/**
 * ******************************************************************************************
 * Copyright (C) 2012 - Food and Agriculture Organization of the United Nations (FAO).
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice,this list
 *       of conditions and the following disclaimer.
 *    2. Redistributions in binary form must reproduce the above copyright notice,this list
 *       of conditions and the following disclaimer in the documentation and/or other
 *       materials provided with the distribution.
 *    3. Neither the name of FAO nor the names of its contributors may be used to endorse or
 *       promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 * SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,PROCUREMENT
 * OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,STRICT LIABILITY,OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * *********************************************************************************************
 */
package org.sola.common.messaging;

import java.text.MessageFormat;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 * Obtains a localized message for displayed based on a message code. 
 * Uses the default locale of the JVM unless a locale is provided. 
 * <p>
 * To add new messages, add the messages to the default Bundle.properties file as well as the
 * appropriate locale specific bundles. The message should include a message property to explain 
 * what the message is for, an optional action property to indicate what the user should do in 
 * response to the message as well as a type property to indicate the type of message (one of PLAIN, 
 * INFORMATION, WARNING, ERROR, QUESTION_YES_NO, QUESTION_YES_NO_CANCEL and QUESTION_OK_CANCEL).
 * </p>
 * <p>
 * Message code should be prefixed with a value that indicates which bundle package to obtain
 * the message details from. Recognized message prefixes include ser, cli and gis.
 * </p>
 * <p>
 * %s can be used to indicate the message includes parameters. Message parameters are replaced
 * based on their position in the message. i.e. the first %s will be replaced by the first parameter
 * in the messageParameters list.
 * </p>
 * @author soladev
 */
public class MessageUtility {

    private static final String MESSAGE_SUFFIX = ".message";
    private static final String ACTION_SUFFIX = ".action";
    private static final String TYPE_SUFFIX = ".type";
    private static final String OPTIONS_SUFFIX = ".options";
    private static final String ERR_NUM_SUFFIX = ".errornumber";
    private static final String MSG_TYPE_DESCRIPTION = "type.description.";
    private static final String DIALOG_OPTIONS = "dialog.options.";
    private static final String SERVICES_MSG_BUNDLE = "org/sola/messages/service/Bundle";
    private static final String CLIENTS_MSG_BUNDLE = "org/sola/messages/client/Bundle";
    private static final String GIS_MSG_BUNDLE = "org/sola/messages/gis/Bundle";
    private static int MAX_LINE_LENGHT = 80;
    private static boolean suppressDialog = false;
    private static MessageResponder messageResponder = null;
    // Enumerates the buttons the user can press
    public static final int BUTTON_CLOSE = -1;
    public static final int BUTTON_ONE = 0;
    public static final int BUTTON_TWO = 1;
    public static final int BUTTON_THREE = 2;
    public static final int BUTTON_FOUR = 3;
    public static final int BUTTON_FIVE = 4;

    /**
     * Determines the message bundle to use based on the prefix of the message id. 
     * Recognized prefixes include service, client and gis.
     * @param msgCode The code identifying of the message to obtain. 
     * @return The name for the message bundle that contains the message details. By default it 
     * returns the client message bundle. 
     */
    private static String getBundleName(String msgCode) {
        // Determines the name of the package to used based on the prefix of the message Id
        String bundleName = SERVICES_MSG_BUNDLE;
        if (msgCode != null) {
            String msgIdPrefix = msgCode.substring(0, 3);
            if (msgIdPrefix.equalsIgnoreCase(ClientMessage.MSG_PREFIX)) {
                bundleName = CLIENTS_MSG_BUNDLE;
            } else if (msgIdPrefix.equalsIgnoreCase(GisMessage.MSG_PREFIX)) {
                bundleName = GIS_MSG_BUNDLE;
            }
        }
        return bundleName;
    }

    /**
     * Substitutes any parameters in the message text with using the Java FormatMessage class.
     * This will ensure locale specific formatting is applied to numeric and date values. 
     * Message parameters are substituted based on their position index as noted in the message. 
     * i.e. parameter {0} will obtain the first value from the messageParameters, etc.
     * @param msg The message text
     * @param messageParameters The list of parameters to substitute into the message.
     * @return The message text including the parameter values. 
     */
    private static String replaceParameters(String msg, Object[] messageParameters,
            Locale locale) {
        if (messageParameters != null) {
            int count = 0;
            for (Object param : messageParameters) {
                if (param != null) {
                    if (String.class.isAssignableFrom(param.getClass())) {
                        // Make sure the string parameters are not more than 80 characters long. 
                        String last = param.toString().replaceAll(
                                System.getProperty("line.separator"), " ");
                        String newParam = "";
                        while (last.length() > MAX_LINE_LENGHT) {
                            int idx = MAX_LINE_LENGHT;
                            while (last.charAt(idx) != ' ' && idx > 0) {
                                idx--;
                            }
                            if (idx <= 0) {
                                idx = MAX_LINE_LENGHT;
                            }
                            newParam = newParam + last.substring(0, idx)
                                    + System.getProperty("line.separator");
                            if (idx == MAX_LINE_LENGHT) {
                                // Forced a break at 80 chars so make sure the 80th char is included
                                // in the message.
                                idx--;
                            }
                            last = last.substring(idx + 1);
                        }
                        messageParameters[count] = newParam + last;
                    }
                }
                count++;
            }
            MessageFormat formatter = new MessageFormat(msg, locale);
            msg = formatter.format(messageParameters);
        }
        return msg;
    }

    /**
     * Suppresses the display of the message dialog and allows customized responses to messages
     * through the messageResponder object. 
     * @param msgResponder Class implementing the SuppressDialoadResponse interface. If null
     * the default button is used to response to every message. 
     */
    public static void suppressDialog(MessageResponder msgResponder) {
        suppressDialog = true;
        messageResponder = msgResponder;
    }

    /**
     * Uses the code to lookup the appropriate display message based the default locale. 
     * @param msgCode The code identifying of the message to obtain.
     * @return The details for the message including an optional action the user should perform and
     * the type of message. If no message is found in properties file, a default message is returned.
     */
    public static LocalizedMessage getLocalizedMessage(String msgCode) {
        return getLocalizedMessage(msgCode, Locale.getDefault(), null);
    }
    
    /**
     * Uses the code to lookup the appropriate display message based the default locale. 
     * @param msgCode The code identifying of the message to obtain.
     * @return Localized message text.
     */
    public static String getLocalizedMessageText(String msgCode) {
        return getLocalizedMessage(msgCode).getMessage();
    }

    /**
     * Uses the code to lookup the appropriate display message based on the default locate and 
     * updates the message text with any parameters as necessary. 
     * @param msgCode The code identifying of the message to obtain.
     * @param messageParameters The list of parameters to substitute into the message text.
     * @return The details for the message including an optional action the user should perform and
     * the type of message. If no message is found in properties file, a default message is returned.
     */
    public static LocalizedMessage getLocalizedMessage(String msgCode, Object[] messageParameters) {
        return getLocalizedMessage(msgCode, Locale.getDefault(), messageParameters);
    }

    /**
     * Uses the message code to lookup the appropriate display message based on the locale specified. 
     * @param msgCode The code identifying of the message to obtain.
     * @param locale The locale to use for obtaining the localized message (e.g. Locale.FRENCH or
     * new Locale("fr", "FR"))
     * @return The details for the message including an optional action the user should perform and
     * the type of message. If no message is found in properties file, a default message is returned.
     */
    public static LocalizedMessage getLocalizedMessage(String msgCode, Locale locale) {
        return getLocalizedMessage(msgCode, locale, null);
    }

    /**
     * Uses the code to lookup the appropriate display message based on the locale specified. 
     * Also updates the message text with any parameters as necessary. 
     * @param msgCode The code identifying of the message to obtain.
     * @param locale The locale to use for obtaining the localized message (e.g. Locale.FRENCH or
     * new Locale("fr", "FR"))
     * @param messageParameters The list of parameters to substitute into the message text.
     * @return The details for the message including an optional action the user should perform and
     * the type of message. If no message is found in properties file, a default message is returned.
     */
    public static LocalizedMessage getLocalizedMessage(String msgCode, Locale locale,
            Object[] messageParameters) {

        ResourceBundle bundle = ResourceBundle.getBundle(getBundleName(msgCode), locale);

        // Populate the message with values from the properties file. 
        LocalizedMessage msg = new LocalizedMessage();
        msg.setMessageCode(msgCode);
        if (bundle.containsKey(msgCode + MESSAGE_SUFFIX)) {
            msg.setMessage(replaceParameters(
                    bundle.getString(msgCode + MESSAGE_SUFFIX), messageParameters, locale));
            if (bundle.containsKey(msgCode + ACTION_SUFFIX)) {
                msg.setAction(bundle.getString(msgCode + ACTION_SUFFIX));
            }
            if (bundle.containsKey(msgCode + TYPE_SUFFIX)) {
                msg.setType(bundle.getString(msgCode + TYPE_SUFFIX));
            } else {
                msg.setType(LocalizedMessage.Type.PLAIN);
            }
            if (bundle.containsKey(MSG_TYPE_DESCRIPTION + msg.getType().toString())) {
                msg.setTypeDescription(bundle.getString(MSG_TYPE_DESCRIPTION + msg.getType().toString()));
            }
            if (bundle.containsKey(msgCode + OPTIONS_SUFFIX)) {
                msg.setDialogOptions(bundle.getString(msgCode + OPTIONS_SUFFIX));
            } else {
                msg.setDialogOptions(bundle.getString(DIALOG_OPTIONS + msg.getType().toString()));
            }
            if (bundle.containsKey(msgCode + ERR_NUM_SUFFIX)) {
                msg.setErrorNumberRequired(true);
            }
        } else {
            // No message in the bundle, so display a default message
            msg.setMessage("Unable to obtain localized message for " + msgCode + " from locale "
                    + locale.toString() + ".");
            msg.setAction("Contact your system administrator for assistance.");
            msg.setType(LocalizedMessage.Type.ERROR);
            msg.setTypeDescription("Error");
            msg.setDialogOptions("OK");
        }

        return msg;
    }

    /**
     * Obtains the message details based on the message code and displays the message to the user. 
     * @param messageCode The code of the message to display. 
     * @return The index of the number of the button selected by the user. The left most button 
     * displayed on the dialog is BUTTON_ONE, the next button is BUTTON_TWO, etc. If the user 
     * selects the close icon on the dialog, BUTTON_CLOSE is returned. 
     */
    public static int displayMessage(String messageCode) {
        return displayMessage(messageCode, (String) null);
    }

    /**
     * Obtains the message details based on the message code and displays the message to the user.
     * @param messageCode The code of the message to display. 
     * @param errorNumber The specific error number for the message. Only displayed in the message
     * if the .errornumber key is set for the message in the bundle file.
     * @return The index of the number of the button selected by the user. The left most button 
     * displayed on the dialog is BUTTON_ONE, the next button is BUTTON_TWO, etc. If the user 
     * selects the close icon on the dialog, BUTTON_CLOSE is returned. 
     */
    public static int displayMessage(String messageCode, String errorNumber) {
        return displayMessage(messageCode, errorNumber, (Object[]) null);
    }

    /**
     * Obtains the message details based on the message code and displays the message to the user.
     * @param messageCode The code of the message to display.
     * @param messageParameters The list of parameters to include in the message.
     * @return The index of the number of the button selected by the user. The left most button 
     * displayed on the dialog is BUTTON_ONE, the next button is BUTTON_TWO, etc. If the user 
     * selects the close icon on the dialog, BUTTON_CLOSE is returned. 
     */
    public static int displayMessage(String messageCode, Object[] messageParameters) {
        return displayMessage(messageCode, null, messageParameters);
    }

    /**
     * Obtains the message details based on the message code and displays the message to the user.
     * @param messageCode The code of the message to display.
     * @param messageParameters The list of parameters to include in the message.
     * @return The index of the number of the button selected by the user. The left most button 
     * displayed on the dialog is BUTTON_ONE, the next button is BUTTON_TWO, etc. If the user 
     * selects the close icon on the dialog, BUTTON_CLOSE is returned. 
     */
    public static int displayMessage(String messageCode, List messageParameters) {
        return displayMessage(messageCode, null, messageParameters);
    }

    /**
     * Obtains the message details based on the message code and displays the message to the user.
     * @param messageCode The code of the message to display. 
     * @param errorNumber The specific error number for the message. Only displayed in the message
     * if the .errornumber key is set for the message in the bundle file. 
     * @param messageParameters The array of parameters to include in the message. 
     * @return The index of the number of the button selected by the user. The left most button 
     * displayed on the dialog is BUTTON_ONE, the next button is BUTTON_TWO, etc. If the user 
     * selects the close icon on the dialog, BUTTON_CLOSE is returned.
     */
    public static int displayMessage(String messageCode, String errorNumber, Object[] messageParameters) {
        return displayMessage(getLocalizedMessage(messageCode, messageParameters), errorNumber);
    }

    /**
     * Obtains the message details based on the message code and displays the message to the user.
     * @param messageCode The code of the message to display. 
     * @param errorNumber The specific error number for the message. Only displayed in the message
     * if the .errornumber key is set for the message in the bundle file. 
     * @param messageParameters The list of parameters to include in the message. 
     * @return The index of the number of the button selected by the user. The left most button 
     * displayed on the dialog is BUTTON_ONE, the next button is BUTTON_TWO, etc. If the user 
     * selects the close icon on the dialog, BUTTON_CLOSE is returned.
     */
    public static int displayMessage(String messageCode, String errorNumber, List<String> messageParameters) {
        Object[] params = null;
        if (messageParameters != null) {
            params = messageParameters.toArray();
        }
        return displayMessage(getLocalizedMessage(messageCode, params), errorNumber);
    }

    /**
     * Displays the provided localized message to the user. If the suppressDialog flag is set, the
     * message dialog is not displayed and instead the messageResponder is invoked (if valid) to 
     * obtain the response to the message. If the dialog is suppressed, and the messageResponder
     * is not set, the default button is returned as the message response. 
     * @param message The localized message
     * @param errorNumber The specific error number for the message. Only displayed in the message
     * if the .errornumber key is set for the message in the bundle file. 
     * @return The index of the number of the button selected by the user. The left most button 
     * displayed on the dialog is BUTTON_ONE, the next button is BUTTON_TWO, etc. If the user 
     * selects the close icon on the dialog, BUTTON_CLOSE is returned.
     */
    public static int displayMessage(LocalizedMessage message, String errorNumber) {
        int selectedButton = BUTTON_ONE;
        if (suppressDialog) {
            if (messageResponder != null) {
                selectedButton = messageResponder.getResponse(message,
                        errorNumber, selectedButton);
            }

        } else {
            String formatedMessage = message.formatMessage(errorNumber);
            String[] dialogOptions = message.getDialogOptions();
            int optionPaneMessageType = getJOptionPaneMessageType(message);
            selectedButton = JOptionPane.showOptionDialog(null, formatedMessage,
                    message.formatTitle(), getJOptionPaneOptionType(message),
                    optionPaneMessageType, null, dialogOptions,
                    dialogOptions[0]);
        }
        return selectedButton;
    }

    /**
     * Determines the appropriate JOptionPane Option type based on the message type. 
     * @param message The localized message to process
     * @return The JOptionPane option value. One of DEFAULT_OPTION, YES_NO_OPTION, 
     * YES_NO_CANCEL_OPTION or OK_CANCEL_OPTION
     */
    public static int getJOptionPaneOptionType(LocalizedMessage message) {
        int result = JOptionPane.DEFAULT_OPTION;
        if (message.getType() == LocalizedMessage.Type.QUESTION_YES_NO) {
            result = JOptionPane.YES_NO_OPTION;
        }
        if (message.getType() == LocalizedMessage.Type.QUESTION_YES_NO_CANCEL) {
            result = JOptionPane.YES_NO_CANCEL_OPTION;
        }
        if (message.getType() == LocalizedMessage.Type.QUESTION_OK_CANCEL) {
            result = JOptionPane.OK_CANCEL_OPTION;
        }
        return result;
    }

    /**
     * Determines the appropriate JOptionPane MessageType type based on the message type. 
     * @param message The localized message to process
     * @return The JOptionPane message type value. One of ERROR_MESSAGE, WARNING_MESSAGE, 
     * INFORMATION_MESSAGE, PLAIN_MESSAGE or QUESTION_MESSAGE.
     */
    public static int getJOptionPaneMessageType(LocalizedMessage message) {
        int result = JOptionPane.ERROR_MESSAGE;
        if (message.getType() == LocalizedMessage.Type.WARNING) {
            result = JOptionPane.WARNING_MESSAGE;
        }
        if (message.getType() == LocalizedMessage.Type.INFORMATION) {
            result = JOptionPane.INFORMATION_MESSAGE;
        }
        if (message.getType() == LocalizedMessage.Type.PLAIN) {
            result = JOptionPane.PLAIN_MESSAGE;
        }
        if (message.isQuestion()) {
            result = JOptionPane.QUESTION_MESSAGE;
        }
        return result;
    }

    /**
     * Checks if the resource bundle has a localized message for the given message code. 
     * @param msgCode The message code
     * @return true if the bundle includes a localized message. 
     */
    public static boolean hasLocalizedMessage(String msgCode) {
        return hasLocalizedMessage(msgCode, Locale.getDefault());
    }

    /**
     * Checks if the resource bundle has a localized message for the given message code. 
     * @param msgCode The message code
     * @param msgCode The locale to check
     * @return True if the bundle includes the localized message. 
     */
    public static boolean hasLocalizedMessage(String msgCode, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle(getBundleName(msgCode), locale);
        boolean result = bundle.containsKey(msgCode + MESSAGE_SUFFIX);
        return result;
    }
}
