/**
 * ******************************************************************************************
 * Copyright (C) 2014 - Food and Agriculture Organization of the United Nations (FAO).
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

/**
 * Contains the localized details for the message
 * @author amcdowell
 */
public class LocalizedMessage {

    private String messageCode;
    private String message;
    private String action;
    private Type type;
    private String typeDescription;
    private String[] dialogOptions;
    private boolean errorNumberRequired;

    public enum Type {

        PLAIN, INFORMATION, WARNING, ERROR, QUESTION_YES_NO, QUESTION_YES_NO_CANCEL,
        QUESTION_OK_CANCEL
    }

    /** This is an optional value that if populated, should indicate what actions
     * the user should perform in response to the message (e.g. Contact the system administrator, 
     * retry your action, etc). */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    /** The localized text for the message. Messages can include parameters. */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /** The code that identifies which message to display to the user. It should not be confused 
     * with the error number which is generated for error messages to allow identification of
     * specific messages in the log file. */
    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    /** The type of the message. Refer the LocalizedMessage.Type enumeration for a list of valid 
     * values. This information can be used to ensure the appropriate icons and buttons are 
     * displayed on any message dialog  used to present the message  to the user on the message
     * dialog. */
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    /** Overloaded version of setType that translates a string into one of the value Type enumeration
     * values. If the string does not match one of the enumeration values, PLAIN is used as the 
     * default enumeration.  
     */
    public void setType(String type) {
        try {
            this.type = Type.valueOf(type);
        } catch (IllegalArgumentException ex) {
            // The string value for the message type is invalid. Set a default value so the user gets
            // some information displayed to them. 
            this.type = Type.PLAIN;
        }
    }

    /** Provides a localized description for the message type. Used by the formatTitle method as
     * part of the title for the message dialog. */
    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    /** The localized values for the button labels to display for the message. These
     * may be customized values specific to the message. */
    public String[] getDialogOptions() {
        return dialogOptions;
    }

    public void setDialogOptions(String[] dialogOptions) {
        this.dialogOptions = dialogOptions.clone();
    }

    /** Overloaded setter that will covert a comma delimited string into a string array. */
    public void setDialogOptions(String dialogOptions) {
        this.dialogOptions = dialogOptions.split(",");
    }

    /** Indicates if the error number should be displayed as part of the error message */
    public boolean isErrorNumberRequired() {
        return errorNumberRequired;
    }

    public void setErrorNumberRequired(boolean errorNumberRequired) {
        this.errorNumberRequired = errorNumberRequired;
    }

    /** 
     * Determines if the message type is one of the QUESTION types
     * @return true if the type of message is QUESTION_YES_NO, QUESTION_YES_NO_CANCEL or 
     * QUESTION_OK_CANCEL
     */
    public boolean isQuestion() {
        return this.type.equals(Type.QUESTION_YES_NO)
                || this.type.equals(Type.QUESTION_YES_NO_CANCEL)
                || this.type.equals(Type.QUESTION_OK_CANCEL);
    }

    /**
     * Formats the message details including the localized message and the message action into
     * one string. Also includes the error number if the error number is required for the message
     * @param errorNumber The number generated for the error to use as a reference in the log file
     * @return The formated message
     */
    public String formatMessage(String errorNumber) {
        String result = getMessage();
        if (getAction() != null) {
            result = result + System.getProperty("line.separator") + getAction();
        }
        if (isErrorNumberRequired() && errorNumber != null) {
            result = result + " " + errorNumber;
        }
        return result;
    }

    /** 
     * Formats a title for the message based on the message type description and the message Code
     * @return Formated title for the message
     */
    public String formatTitle() {
        String result = getTypeDescription();
        if (getMessageCode() != null) {
            result = result + " " + getMessageCode().toUpperCase();
        }
        return result;
    }
}
