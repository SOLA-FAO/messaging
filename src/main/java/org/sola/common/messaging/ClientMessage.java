/**
 * ******************************************************************************************
 * Copyright (C) 2014 - Food and Agriculture Organization of the United Nations
 * (FAO). All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,this
 * list of conditions and the following disclaimer. 2. Redistributions in binary
 * form must reproduce the above copyright notice,this list of conditions and
 * the following disclaimer in the documentation and/or other materials provided
 * with the distribution. 3. Neither the name of FAO nor the names of its
 * contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT,STRICT LIABILITY,OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
 * IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * *********************************************************************************************
 */
package org.sola.common.messaging;

public class ClientMessage {

    public static final String MSG_PREFIX = "cli";
    // Message groups
    private static final String TEST = MSG_PREFIX + "test";
    private static final String GENERAL = MSG_PREFIX + "gnrl";
    private static final String SEARCH = MSG_PREFIX + "srch";
    private static final String SERVICE = MSG_PREFIX + "serv";
    private static final String CHECK = MSG_PREFIX + "chck";
    private static final String ARCHIVE = MSG_PREFIX + "arch";
    private static final String GENERAL_ERRORS = MSG_PREFIX + "errs";
    private static final String APPLICATION = MSG_PREFIX + "app";
    private static final String REPORT = MSG_PREFIX + "rpt";
    private static final String GENERAL_CONFIRM = MSG_PREFIX + "confirm";
    private static final String HELP = MSG_PREFIX + "help";
    private static final String BAUNIT = MSG_PREFIX + "baunit";
    private static final String PARTY = MSG_PREFIX + "party";
    private static final String VALIDATION = MSG_PREFIX + "vldtn";
    private static final String SOURCE = MSG_PREFIX + "source";
    private static final String ADMIN = MSG_PREFIX + "admin";
    private static final String BR = MSG_PREFIX + "br";
    private static final String PROGRESSMSG = MSG_PREFIX + "prgs";
    private static final String BULK_OPERATIONS = MSG_PREFIX + "_bulk_operations_";
    private static final String SECURITY = MSG_PREFIX + "sec";
    // <editor-fold defaultstate="collapsed" desc="Test Messages">  
    /**
     * clitest001 - Unit Test Message
     */
    public static final String TEST001 = TEST + "001";
    // </editor-fold>
    // General Messages
    /**
     * clignrl001 - An unexpected error has occurred. Error details: {0}
     */
    public static final String GENERAL_UNEXPECTED = GENERAL + "001";
    /**
     * clignrl002 - Language update will take effect on restart
     */
    public static final String GENERAL_UPDATE_LANG = GENERAL + "002";
    /**
     * clignrl003 - There are {0} running tasks currently. Please wait until
     * finishing.
     */
    public static final String GENERAL_ACTIVE_TASKS_EXIST = GENERAL + "003";
    /**
     * clignrl004 - Select document.
     */
    public static final String GENERAL_SELECT_DOCUMENT = GENERAL + "004";
    /**
     * clignrl005 - Some fields are not filled or have incorrect values:\n\n{0}"
     */
    public static final String GENERAL_BEAN_VALIDATION = GENERAL + "005";
    /**
     * clignrl006 - Loading application, please wait..."
     */
    public static final String GENERAL_LOADING_APPLICATION = GENERAL + "006";
    /**
     * clignrl007 - Save
     */
    public static final String GENERAL_LABELS_SAVE = GENERAL + "007";
    /**
     * clignrl008 - Create
     */
    public static final String GENERAL_LABELS_CREATE = GENERAL + "008";
    /**
     * clignrl009 - Create & Close
     */
    public static final String GENERAL_LABELS_CREATE_AND_CLOSE = GENERAL + "009";
    /**
     * clignrl010 - Save & Close
     */
    public static final String GENERAL_LABELS_SAVE_AND_CLOSE = GENERAL + "010";
    /**
     * clignrl011 - Close
     */
    public static final String GENERAL_LABELS_CLOSE = GENERAL + "011";
    /**
     * clignrl012 - Cancel
     */
    public static final String GENERAL_LABELS_CANCEL = GENERAL + "012";
    /**
     * clignrl013 - Record has been updated successfully.
     */
    public static final String GENERAL_RECORD_SAVED = GENERAL + "013";
    public static final String GENERAL_LABELS_INDIVIDUAL = GENERAL + "014";
    public static final String GENERAL_LABELS_ENTITY = GENERAL + "015";
    /**
     * clignrl016 - Extinguish
     */
    public static final String GENERAL_LABELS_EXTINGUISH = GENERAL + "016";
    /**
     * clignrl017 - Extinguish & Close
     */
    public static final String GENERAL_LABELS_EXTINGUISH_AND_CLOSE = GENERAL + "017";
    /**
     * clignrl018 - Terminate
     */
    public static final String GENERAL_LABELS_TERMINATE = GENERAL + "018";
    /**
     * clignrl019 - Terminate & Close
     */
    public static final String GENERAL_LABELS_TERMINATE_AND_CLOSE = GENERAL + "019";
    /**
     * clignrl020 - You have made some changes on the form. Do you want to save
     * it before closing?
     */
    public static final String GENERAL_FORM_CHANGES_WARNING = GENERAL + "020";
    /**
     * clignrl021 - New
     */
    public static final String GENERAL_LABELS_NEW = GENERAL + "021";
    /**
     * clignrl022 - Document
     */
    public static final String GENERAL_LABELS_DOCUMENT = GENERAL + "022";
    /**
     * clignrl023 - refresh Dashboard
     */
    public static final String GENERAL_BACK_TO_DASHBOARD = GENERAL + "023";
    /**
     * clignrl024 - Assign
     */
    public static final String GENERAL_LABELS_ASSIGN = GENERAL + "024";
    /**
     * clignrl025 - Unassign
     */
    public static final String GENERAL_LABELS_UNASSIGN = GENERAL + "025";
    // Service Messages
    /**
     * cliserv001 - Unable to initialize the {0} service. The reason is: {1}
     */
    public static final String SERVICE_INITIALIZE = SERVICE + "001";
    // Search Messages
    /**
     * clisrch001 - There were no records matching your search criteria.
     */
    public static final String SEARCH_NO_RESULTS = SEARCH + "001";
    /**
     * clisrch002 - Your search matched more than {0} records
     */
    public static final String SEARCH_TOO_MANY_RESULTS = SEARCH + "002";
    /**
     * clisrch003 - Select application
     */
    public static final String SEARCH_SELECT_APPLICATION = SEARCH + "003";
    // Check / Validation Messages
    /**
     * clichck001 - Application {0} cannot be assigned or unassigned until its
     * fees are paid.
     */
    public static final String CHECK_FEES_NOT_PAID = CHECK + "001";
    /**
     * clichck002 - The selected application cannot have a receipt printed until
     * its fees are paid.
     */
    public static final String CHECK_FEES_NOT_PAID_RECEIPT = CHECK + "002";
    /**
     * clichck003 - The selected application cannot have a receipt printed until
     * it is lodged and its fees are paid.
     */
    public static final String CHECK_NOT_LODGED_RECEIPT = CHECK + "003";
    /**
     * clichck004 - A user name and password must be provided.
     */
    public static final String CHECK_INVALID_USERNAME_PASSWORD = CHECK + "004";
    /**
     * clichck005 - Select document type"
     */
    public static final String CHECK_SELECT_DOCTYPE = CHECK + "005";
    /**
     * clichck006 - Enter first and last part of identifier
     */
    public static final String CHECK_FIRST_LAST_PROPERTY = CHECK + "006";
    /**
     * clichck007 - cannot be null
     */
    public static final String CHECK_NOTNULL_FIELDS = CHECK + "007";
    // validation hibernate messages 
    /**
     * clichck008 - name cannot be null
     */
    public static final String CHECK_NOTNULL_NAME = CHECK + "008";
    public static final String CHECK_NOTNULL_CODE = CHECK + "009";
    public static final String CHECK_NOTNULL_STATUS = CHECK + "010";
    public static final String CHECK_SIZE_STATUS = CHECK + "011";
    public static final String CHECK_NOTNULL_DISPLAYVALUE = CHECK + "012";
    public static final String CHECK_NOTNULL_ADDRESS = CHECK + "013";
    public static final String CHECK_NOTNULL_FIRSTPART = CHECK + "014";
    public static final String CHECK_NOTNULL_LASTPART = CHECK + "015";
    public static final String CHECK_NOTNULL_NOTATION = CHECK + "016";
    public static final String CHECK_NOTNULL_EXPIRATION = CHECK + "017";
    public static final String CHECK_FUTURE_EXPIRATION = CHECK + "018";
    public static final String CHECK_NOTNULL_MORTGAGEAMOUNT = CHECK + "019";
    public static final String CHECK_NOTNULL_MORTAGAETYPE = CHECK + "020";
    public static final String CHECK_SIZE_SOURCELIST = CHECK + "021";
    public static final String CHECK_NODUPLICATED_SOURCELIST = CHECK + "022";
    public static final String CHECK_SIZE_RRRSHARELIST = CHECK + "023";
    public static final String CHECK_TOTALSHARE_RRRSHARELIST = CHECK + "024";
    public static final String CHECK_SIZE_RIGHTHOLDERLIST = CHECK + "025";
    public static final String CHECK_NOTNULL_NOMINATOR = CHECK + "026";
    public static final String CHECK_MIN_NOMINATOR = CHECK + "027";
    public static final String CHECK_NOTNULL_DENOMINATOR = CHECK + "028";
    public static final String CHECK_MIN_DENOMINATOR = CHECK + "029";
    public static final String CHECK_NODUPLI_RIGHTHOLDERLIST = CHECK + "030";
    public static final String CHECK_SIZE_FILTERRIGHTHOLDER = CHECK + "031";
    public static final String CHECK_NOTNULL_CADFIRSTPART = CHECK + "032";
    public static final String CHECK_NOTNULL_CADLASTPART = CHECK + "033";
    public static final String CHECK_NOTNULL_CADOBJTYPE = CHECK + "034";
    public static final String CHECK_INVALID_EMAIL = CHECK + "035";
    public static final String CHECK_NOTNULL_LASTNAME = CHECK + "036";
    public static final String CHECK_MIN_GROUPROLES = CHECK + "037";
    public static final String CHECK_NOTNULL_GROUPNAME = CHECK + "038";
    public static final String CHECK_NOTNULL_PASSWORD = CHECK + "039";
    public static final String CHECK_MIN_PASSWORD = CHECK + "040";
    public static final String CHECK_NOTNULL_CONFPASSWORD = CHECK + "041";
    public static final String CHECK_NOTNULL_USERNAME = CHECK + "042";
    public static final String CHECK_MIN_USERGROUP = CHECK + "043";
    public static final String CHECK_NOTNULL_FIRSTNAME = CHECK + "044";
    public static final String CHECK_NOTEQUAL_PASSWORD = CHECK + "045";
    public static final String CHECK_NOTNULL_RECORDATION = CHECK + "046";
    public static final String CHECK_NOTNULL_REFERENCENR = CHECK + "047";
    public static final String CHECK_NOTNULL_SOURCETYPE = CHECK + "048";
    public static final String CHECK_NOTNULL_DISPLAYNAME = CHECK + "049";
    public static final String CHECK_BEANNOTEMPTY_BRTECHTYPE = CHECK + "050";
    public static final String CHECK_SIZE_BRDEFLIST = CHECK + "051";
    public static final String CHECK_SIZE_BRVALLIST = CHECK + "052";
    public static final String CHECK_NOTNULL_BRID = CHECK + "053";
    public static final String CHECK_NOTNULL_ACTIVEFROM = CHECK + "054";
    public static final String CHECK_NOTNULL_ACTIVEUNTIL = CHECK + "055";
    public static final String CHECK_NOTNULL_BODY = CHECK + "056";
    public static final String CHECK_NOTNULL_BRVALID = CHECK + "057";
    public static final String CHECK_BEANNOTNULL_BRSEVTYPE = CHECK + "058";
    public static final String CHECK_BEANNOTNULL_BRVALTARGETTYPE = CHECK + "059";
    public static final String CHECK_GENERICNULL_OBJECT = CHECK + "060";
    public static final String CHECK_GENERICDUPL_OBJECT = CHECK + "061";
    /**
     * clichck062 - Number of services should be greater than 0.
     */
    public static final String CHECK_APP_SERVICES_NOT_EMPTY = CHECK + "062";
    /**
     * clichck063 - No contact person found.
     */
    public static final String CHECK_APP_CONTACT_PERSON_NULL = CHECK + "063";
    /**
     * clichck064 - Fill in contact person address.
     */
    public static final String CHECK_APP_CONTACT_PERSON_ADDRESS = CHECK + "064";
    /**
     * clichck065 - Fill in contact person name.
     */
    public static final String CHECK_APP_CONTACT_PERSON_NAME = CHECK + "065";
    /**
     * clichck066 - Fill in contact person last name.
     */
    public static final String CHECK_APP_CONTACT_PERSON_LASTNAME = CHECK + "066";
    /**
     * clichck067 - Numerator should be less or equal than denominator.
     */
    public static final String CHECK_PROP_SHARE = CHECK + "067";
    /**
     * clichck068 - Enter ID document reference number.
     */
    public static final String CHECK_PERSON_ID_DOC_NUMBER = CHECK + "068";
    /**
     * clichck069 - Enter a correct format date (mm/dd/yy) in From date..
     */
    public static final String CHECK_NOTNULL_DATEFROM = CHECK + "069";
    /**
     * clichck070 - EntEnter a correct format date (mm/dd/yy) in To date..
     */
    public static final String CHECK_NOTNULL_DATETO = CHECK + "070";
    /**
     * clichck071 - Registration date can't be greater than current date
     */
    public static final String CHECK_REGISTRATION_DATE = CHECK + "071";
    /**
     * clichck072 - Enter at least one owner.
     */
    public static final String CHECK_SIZE_OWNERSLIST = CHECK + "072";
    /**
     * clichck073 - Invalid telephone number.
     */
    public static final String CHECK_INVALID_PHONE = CHECK + "073";
    /**
     * clichck074 - Invalid fax.
     */
    public static final String CHECK_INVALID_FAX = CHECK + "074";
    /**
     * clichck075 - Invalid mobile.
     */
    public static final String CHECK_INVALID_MOBILE = CHECK + "075";
    /**
     * clichck076 - Invalid length.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH = CHECK + "076";
    /**
     * clichck077 - Invalid length + parameters.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_PAR = CHECK + "077";
    /**
     * clichck078 - Invalid length Source ref field.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_SRCREF = CHECK + "078";
    /**
     * clichck079 - Invalid length first part field.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_FIRSTPART = CHECK + "079";
    /**
     * clichck080 - Invalid length last part field.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_LASTPART = CHECK + "080";
    /**
     * clichck081 - Invalid length notation field.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_NOTATION = CHECK + "081";
    /**
     * clichck082 - Invalid length notation field.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_MAIL = CHECK + "082";
    /**
     * clichck083 - Invalid length notation field.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_PHONE = CHECK + "083";
    /**
     * clichck084 - Invalid length notation field.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_MOBILE = CHECK + "084";
    /**
     * clichck085 - Invalid length notation field.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_FAX = CHECK + "085";
    /**
     * clichck086 - Invalid length notation field.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_FNAME = CHECK + "086";
    /**
     * clichck087 - Invalid length notation field.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_FLAST = CHECK + "087";
    /**
     * clichck088 - Invalid length notation field.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_ALIAS = CHECK + "088";
    /**
     * clichck089 - Invalid length address field.
     */
    public static final String CHECK_PERSON_ADDRESS = CHECK + "089";
    /**
     * clichck090 - Invalid length name field.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_NAME = CHECK + "090";
    /**
     * clichck091 - Invalid length last name field.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_LASTNAME = CHECK + "091";
    /**
     * clichck092 - No item starting with {0} .
     */
    public static final String CHECK_NO_MATCHING_ITEM = CHECK + "092";
    /**
     * clichck093 - {0} value must be an integer .
     */
    public static final String CHECK_BAUNITAREA_VALUE = CHECK + "093";
    /**
     * clichck094 - Current password not correct.
     */
    public static final String CHECK_CURRENTPSSWD_NOTMATCH = CHECK + "094";
    /**
     * clichck095 - Source is not present.
     */
    public static final String CHECK_BULK_OPERATION_SOURCE_ISNULL = CHECK + "095";
    /**
     * clichck096 - Destination is not present.
     */
    public static final String CHECK_BULK_OPERATION_DESTINATION_ISNULL = CHECK + "096";
    /**
     * clichck097 - Select a location
     */
    public static final String CHECK_SELECT_LOCATION = CHECK + "097";
    /**
     * clichck098 - From date can't be greater than To date
     */
    public static final String CHECK_FROM_TO_DATE = CHECK + "098";
    /**
     * clichck099 - Conditions list shouldn't be empty.
     */
    public static final String CHECK_SIZE_CONDITIONS_LIST = CHECK + "099";
    /**
     * clichck100 - Area should have a value.
     */
    public static final String CHECK_NOTNULL_AREA = CHECK + "100";

    /**
     * clichck101 - gender must be specified.
     */
    public static final String CHECK_NOTNULL_GENDER = CHECK + "101";

    /**
     * clichck102 - gender must be specified.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_CODE = CHECK + "102";
    /**
     * clichck103 - gender must be specified.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_DESCRIPTION = CHECK + "103";
    /**
     * clichck104 - gender must be specified.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_DISPLAY = CHECK + "104";
    /**
     * clichck105 - gender must be specified.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_FIRSTNAME = CHECK + "105";
    /**
     * clichck106 - gender must be specified.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_USERNAME = CHECK + "106";
    /**
     * clichck107 - gender must be specified.
     */
    public static final String CHECK_FIELD_INVALID_LENGTH_PASSWORD = CHECK + "107";

    // Application messages
    /**
     * cliapp001 - Select document to attach digital copy.
     */
    public static final String APPLICATION_SELECT_DOCUMENT_TO_ATTACH_TO = APPLICATION + "001";
    /**
     * cliapp002 - Are you sure you want to remove attachment?
     */
    public static final String APPLICATION_CONFIRM_DOCUMENT_ATTACHMENT_REMOVAL = APPLICATION + "002";
    /**
     * cliapp003 - Property with ID = {0} has the following incomplete
     * applications: {1}
     */
    public static final String APPLICATION_PROPERTY_HAS_INCOMPLETE_APPLICATIONS = APPLICATION + "003";
    /**
     * cliapp004 - You are about to save application. Do you want to proceed?
     */
    public static final String APPLICATION_SAVE_CONFIRM = APPLICATION + "004";
    /**
     * cliapp005 - You haven't supplied all required documents. Do you want to
     * proceed anyway?
     */
    public static final String APPLICATION_NOTALL_DOCUMENT_REQUIRED = APPLICATION + "005";
    /**
     * cliapp006 - You should supply at least {0} property object(s). Do you
     * want to proceed anyway?
     */
    public static final String APPLICATION_ATLEAST_PROPERTY_REQUIRED = APPLICATION + "006";
    /**
     * cliapp007 - Application saved successfully
     */
    public static final String APPLICATION_SUCCESSFULLY_SAVED = APPLICATION + "007";
    /**
     * cliapp008 - Select property to verify
     */
    public static final String APPLICATION_SELECT_PROPERTY_TOVERIFY = APPLICATION + "008";
    /**
     * cliapp009 - Property has been verified successfully
     */
    public static final String APPLICATION_PROPERTY_VERIFIED = APPLICATION + "009";
    /**
     * cliapp010 - There is no selected user
     */
    public static final String APPLICATION_NOSEL_USER = APPLICATION + "010";
    /**
     * cliapp011 - Application will be assigned to user "{0}"
     */
    public static final String APPLICATION_ASSIGN = APPLICATION + "011";
    /**
     * cliapp012 - Applications have been assigned
     */
    public static final String APPLICATION_ASSIGNED = APPLICATION + "012";
    /**
     * cliapp013 - You can't unassign from yourself. Application number {0}
     */
    public static final String APPLICATION_UNASSIGN_FROM_SELF_FORBIDDEN = APPLICATION + "013";
    /**
     * cliapp014 - Applications have been unassigned
     */
    public static final String APPLICATION_UNASSIGNED = APPLICATION + "014";
    /**
     * cliapp015 - Loading unassigned applications...
     */
    public static final String APPLICATION_LOADING_UNASSIGNED = APPLICATION + "015";
    /**
     * cliapp016 - Loading assigned applications...
     */
    public static final String APPLICATION_LOADING_ASSIGNED = APPLICATION + "016";
    /**
     * cliapp017 - Select a Service
     */
    public static final String APPLICATION_SELECT_SERVICE = APPLICATION + "017";
    /**
     * cliapp018 - There are no property objects on the list
     */
    public static final String APPLICATION_PROPERTY_LIST_EMPTY = APPLICATION + "018";
    /**
     * cliapp019 - You are about to take action \"{0}\" against application, no
     * further changes will be possible. Are you sure?
     */
    public static final String APPLICATION_ACTION_WARNING_STRONG = APPLICATION + "019";
    /**
     * cliapp020 - Application #{0}, was failed to approve.
     */
    public static final String APPLICATION_APPROVE_FAILED = APPLICATION + "020";
    /**
     * cliapp021 - Application #{0}, has been successfully approved.
     */
    public static final String APPLICATION_APPROVE_SUCCESS = APPLICATION + "021";
    /**
     * cliapp022 - You are about to reject application, no further changes will
     * be possible. Are you sure?
     */
    public static final String APPLICATION_REJECT_WARNING = APPLICATION + "022";
    /**
     * cliapp023 - Application #{0}, was failed to reject.
     */
    public static final String APPLICATION_REJECT_FAILED = APPLICATION + "023";
    /**
     * cliapp024 - Application #{0}, has been successfully rejected.
     */
    public static final String APPLICATION_REJECT_SUCCESS = APPLICATION + "024";
    /**
     * cliapp025 - You are about to complete \"{0}\" service. Are you sure?
     */
    public static final String APPLICATION_SERVICE_COMPLETE_WARNING = APPLICATION + "025";
    /**
     * cliapp026 - Application service \"{0}\", was failed to complete.
     */
    public static final String APPLICATION_SERVICE_COMPLETE_FAILED = APPLICATION + "026";
    /**
     * cliapp027 - Application service \"{0}\", has been successfully completed.
     */
    public static final String APPLICATION_SERVICE_COMPLETE_SUCCESS = APPLICATION + "027";
    /**
     * cliapp028 - You are about to cancel application service \"{0}\", no
     * further changes will be possible. Are you sure?
     */
    public static final String APPLICATION_SERVICE_CANCEL_WARNING = APPLICATION + "028";
    /**
     * cliapp029 - Application service \"{0}\", was failed to cancel.
     */
    public static final String APPLICATION_SERVICE_CANCEL_FAILED = APPLICATION + "029";
    /**
     * cliapp030 - Application service \"{0}\", has been successfully canceled.
     */
    public static final String APPLICATION_SERVICE_CANCEL_SUCCESS = APPLICATION + "030";
    /**
     * cliapp031 - You are about to revert \"{0}\" service to the pending state.
     * Are you sure?
     */
    public static final String APPLICATION_SERVICE_REVERT_WARNING = APPLICATION + "031";
    /**
     * cliapp032 - Application service \"{0}\", was failed to revert.
     */
    public static final String APPLICATION_SERVICE_REVERT_FAILED = APPLICATION + "032";
    /**
     * cliapp033 - Application service \"{0}\", has been successfully reverted.
     */
    public static final String APPLICATION_SERVICE_REVERT_SUCCESS = APPLICATION + "033";
    /**
     * cliapp034 - Application has critical violations. Fix them first, to
     * continue.
     */
    public static final String APPLICATION_HAS_CRITICAL_VIOLATIONS = APPLICATION + "034";
    /**
     * cliapp035 - Service already added.
     */
    public static final String APPLICATION_ALREADYSELECTED_SERVICE = APPLICATION + "035";
    /**
     * cliapp036 - You are about to take action \"{0}\" against application. Are
     * you sure?
     */
    public static final String APPLICATION_ACTION_WARNING_SOFT = APPLICATION + "036";
    /**
     * cliapp037 - The action against the application #{0}, has been successful.
     */
    public static final String APPLICATION_ACTION_SUCCESS = APPLICATION + "037";
    /**
     * cliapp038 - Opening application form...
     */
    public static final String APPLICATION_OPENING_FORM = APPLICATION + "038";
    /**
     * cliapp039 - You've made some changes on the application. They will be
     * saved before further action. Do you want to continue?
     */
    public static final String APPLICATION_SAVE_BEFORE_ACTION = APPLICATION + "039";
    /**
     * cliapp040 - You are adding new services to the list. Remember to pay the
     * fee for new added service
     */
    public static final String APPLICATION_WARNING_ADDEDSERVICE = APPLICATION + "040";
    /**
     * cliapp041 - Application not found.
     */
    public static final String APPLICATION_NOT_FOUND = APPLICATION + "041";
    /**
     * cliapp042 - Application service \"{0}\", has been successfully started.
     */
    public static final String APPLICATION_SERVICE_START_SUCCESS = APPLICATION + "042";
    /**
     * cliapp043 - You can't unassign from others. Application number {0}
     */
    public static final String APPLICATION_UNASSIGN_FROM_OTHERS_FORBIDDEN = APPLICATION + "043";
    /**
     * cliapp044 - Are you sure you want to unassign selected applications?
     */
    public static final String APPLICATION_CONFIRM_UNASSIGN = APPLICATION + "044";
    /**
     * cliapp045 - Unable to display the screen for this service.
     */
    public static final String APPLICATION_UNKNOWN_LAUNCH_PANEL = APPLICATION + "045";
    /**
     * cliapp046 - Unable to determine a property for this service.
     */
    public static final String APPLICATION_NO_PROPERTY_FOR_SERVICE = APPLICATION + "046";
    // Reports messages.
    /**
     * clirpt001 - Report generation failed. Error details: {0}
     */
    public static final String REPORT_GENERATION_FAILED = REPORT + "001";
    /**
     * clirpt002 - No Report
     */
    public static final String NO_REPORT_GENERATION = REPORT + "002";
    /**
     * clirpt003 - Report generation on area #{0}, has been successful
     */
    public static final String REPORT_GENERATION_SUCCESS = REPORT + "003";
    /**
     * clirpt004 - No certificate
     */
    public static final String NO_CERTIFICATE_GENERATION = REPORT + "004";
    // Digital archive messages
    /**
     * cliarch001 - Select file to open.
     */
    public static final String ARCHIVE_SELECT_FILE_TO_OPEN = ARCHIVE + "001";
    /**
     * cliarch002 - Select file to attach.
     */
    public static final String ARCHIVE_SELECT_FILE_TO_ATTACH = ARCHIVE + "002";
    /**
     * cliarch003 - Failed to attach file "{0}".
     */
    public static final String ARCHIVE_FAILED_TO_ATTACH_FILE = ARCHIVE + "003";
    /**
     * cliarch004 - File has been deleted successfully.
     */
    public static final String ARCHIVE_FILE_DELETED = ARCHIVE + "004";
    /**
     * cliarch005 - You are going to delete file from the shared server folder.
     * Do you want to proceed?
     */
    public static final String ARCHIVE_CONFIRM_FILE_DELETION = ARCHIVE + "005";
    /**
     * cliarch006 - File has been added into digital archive.
     */
    public static final String ARCHIVE_FILE_ADDED = ARCHIVE + "006";
    /**
     * cliarch007 - Failed to delete file {0}.
     */
    public static final String ARCHIVE_FAILED_DELETE_FILE = ARCHIVE + "007";
    // BA unit messages
    /**
     * clibaunit001 - Select parcel
     */
    public static final String BAUNIT_SELECT_PARCEL = BAUNIT + "001";
    /**
     * clibaunit002 - Selected right doesn't have pending changes and can't be
     * edited.
     */
    public static final String BAUNIT_RRR_NO_PEDING_CHANGES = BAUNIT + "002";
    /**
     * clibaunit003 - Property not found.
     */
    public static final String BAUNIT_NOT_FOUND = BAUNIT + "003";
    /**
     * clibaunit004 - No rights and parcels are selected. Do you want to
     * continue?
     */
    public static final String BAUNIT_NOTHING_SELECTED = BAUNIT + "004";
    /**
     * clibaunit005 - You have selected parcels, related to existing property.
     * Make sure to make changes in the current property object.
     */
    public static final String BAUNIT_EXISTING_PARCELS_SELECTED = BAUNIT + "005";
    /**
     * clibaunit006 - Do you want to bring forward current rights/restrictions?
     */
    public static final String BAUNIT_SELECT_EXISTING_PROPERTY = BAUNIT + "006";
    /**
     * clibaunit007 - Select relation type.
     */
    public static final String BAUNIT_SELECT_RELATION_TYPE = BAUNIT + "007";
    /**
     * clibaunit008 - Relation type you have selected, should be the same as on
     * existing parent Property list.
     */
    public static final String BAUNIT_WRONG_RELATION_TYPE = BAUNIT + "008";
    /**
     * clibaunit009 - The Property object you have selected, already exists in
     * the list of parent Properties.
     */
    public static final String BAUNIT_HAS_SELECTED_PARENT_BA_UNIT = BAUNIT + "009";
    /**
     * clibaunit010 - Do you want to bring forward rights/restrictions from
     * other property objects?
     */
    public static final String BAUNIT_SELECT_EXISTING_PROPERTY_AGAIN = BAUNIT + "010";
    /**
     * clibaunit011 - You are about to terminate this Property.\n The current
     * state will be saved and Property marked for termination.\n Do you want to
     * proceed?
     */
    public static final String BAUNIT_CONFIRM_TERMINATION = BAUNIT + "011";
    /**
     * clibaunit012 - Property has been marked for termination.
     */
    public static final String BAUNIT_TERMINATED = BAUNIT + "012";
    /**
     * clibaunit013 - Property termination has been canceled.
     */
    public static final String BAUNIT_TERMINATION_CANCELED = BAUNIT + "013";
    /**
     * clibaunit014 - Property has been saved successfully.
     */
    public static final String BAUNIT_SAVED = BAUNIT + "014";
    /**
     * clibaunit015 - Failed to save property.
     */
    public static final String BAUNIT_SAVE_FAILED = BAUNIT + "015";
    /**
     * clibaunit016 - The sum of parcels areas is "{0}". Do you want to save
     * this value for area size?
     */
    public static final String BAUNIT_CONFIRM_AREA = BAUNIT + "016";
    /**
     * clibaunit017 - There are current RRRs that will be canceled.\n Do you
     * want to proceed?
     */
    public static final String BAUNIT_CURRENT_RRR_EXIST_CONFIRM_TERMINATION = BAUNIT + "017";
    /**
     * clibaunit018 - Parcel already exists and assigned to another Property
     * please use selection tool for adding existing parcels
     */
    public static final String BAUNIT_PARCEL_EXISTS = BAUNIT + "018";
    /**
     * clibaunit019 - Rights export failed with the following error: {0}
     */
    public static final String BAUNIT_RIGHTS_EXPORT_FAILED = BAUNIT + "019";
    /**
     * clibaunit020 - Rights export has been completed successfully
     */
    public static final String BAUNIT_RIGHTS_EXPORT_SUCCESS = BAUNIT + "020";
    /**
     * clibaunit021 - Select condition.
     */
    public static final String BAUNIT_CONDITION_EMPTY = BAUNIT + "021";
    /**
     * clibaunit022 - Enter custom condition text.
     */
    public static final String BAUNIT_CUSTOM_CONDITION_EMTY = BAUNIT + "022";
    /**
     * clibaunit023 - {0} has no registration number. It will be assigned
     * automatically after saving property object.
     */
    public static final String BAUNIT_RRR_NO_REGISTRATION_NUMBER = BAUNIT + "023";
    /**
     * clibaunit024 - There are no parcels on the property object.
     */
    public static final String BAUNIT_HAS_NO_PARCELS = BAUNIT + "024";
    /**
     * clibaunit025 - The following warnings were found, which may affect report
     * generation. Do you want to proceed?
     */
    public static final String BAUNIT_RRR_REPORT_WARNINGS = BAUNIT + "025";
    /**
     * clibaunit026 - Enter lease rejection reason
     */
    public static final String BAUNIT_LEASE_REJECTION_REASON_TITLE = BAUNIT + "026";
    /**
     * clibaunit050 - Enter custom condition name.
     */
    public static final String BAUNIT_CUSTOM_CONDITION_NAME_EMPTY = BAUNIT + "050";
    /**
     * clibaunit051 - Property manager assigned
     */
    public static final String BAUNIT_PROP_MANAGER_ASSIGNED = BAUNIT + "051";

    // General error messages
    /**
     * clierrs001 - Can't cerate a new file. {0}
     */
    public static final String ERR_FAILED_CREATE_NEW_FILE = GENERAL_ERRORS + "001";
    /**
     * clierrs002 - The file {0} cannot be opened automatically.
     */
    public static final String ERR_FAILED_OPEN_FILE = GENERAL_ERRORS + "002";
    /**
     * clierrs003 - Method not found - {0}. Error details: {1}
     */
    public static final String ERR_NO_SUCH_METHOD = GENERAL_ERRORS + "003";
    /**
     * clierrs004 - Violation of business rules occurred.
     */
    public static final String ERR_BR_VIOLATION = GENERAL_ERRORS + "004";
    /**
     * clierrs005 - {0} Web-service is not initialized.
     */
    public static final String GENERAL_ERRORS_WEBSERVICE_NOT_INITIALIZED = GENERAL_ERRORS + "005";

    /**
     * clierrs006 - Unable to display panel {0}
     */
    public static final String ERR_UNABLE_TO_LAUNCH_PANEL = GENERAL_ERRORS + "006";
    /**
     * clierrs007 - Configuration missing for panel launch code {0}
     */
    public static final String ERR_MISSING_PANEL_LAUNCH_CODE = GENERAL_ERRORS + "007";

    // General confirms
    /**
     * cliconfirm001 - Are you sure you want to delete record? All data will be
     * lost
     */
    public static final String CONFIRM_DELETE_RECORD = GENERAL_CONFIRM + "001";
    /**
     * cliconfirm002 - You are about changing your password. The system will be
     * closed. Do you want to proceed?
     */
    public static final String CONFIRM_SYSTEM_WILL_BE_CLOSED = GENERAL_CONFIRM + "002";
    /**
     * cliconfirm003 - You are about changing used language. The window will be
     * closed and opened again and you will lose all unsaved data. Do you want
     * to proceed?
     */
    public static final String CONFIRM_CHANGE_LANGUAGE = GENERAL_CONFIRM + "003";
    /**
     * cliconfirm004 - Are you sure you want to remove record?
     */
    public static final String CONFIRM_REMOVE_RECORD = GENERAL_CONFIRM + "004";
    // Help messages
    /**
     * clihelp001 - HelpSet - Exception:{0} Path: {1} not found
     */
    public static final String EXCEPTION_HELPSET = HELP + "001";
    // Party messages
    /**
     * cliparty001 - Select party
     */
    public static final String PARTY_SELECT_PARTY = PARTY + "001";
    /**
     * cliparty002 - You are about to save party.\nDo you want to proceed?
     */
    public static final String PARTY_SAVE_CONFIRM = PARTY + "002";
    /**
     * cliparty003 - Person has been saved.
     */
    public static final String PARTY_SAVED = PARTY + "003";
    /**
     * cliparty004 - Fill party fields
     */
    public static final String PARTY_FILL_PARTY = PARTY + "004";
    /**
     * cliparty005 - party prepared successfully
     */
    public static final String PARTY_PREPARED_PARTY = PARTY + "005";
    /**
     * cliparty006 - Select role
     */
    public static final String PARTY_SELECT_ROLE = PARTY + "006";
    /**
     * cliparty007 - Role already added
     */
    public static final String PARTY_ALREADYSELECTED_ROLE = PARTY + "007";
    /**
     * cliparty008 - Person has been created.
     */
    public static final String PARTY_CREATED = PARTY + "003";
    // Source messages
    /**
     * clisource001 - This action will detach document from the transaction. Are
     * you sure?
     */
    public static final String SOURCE_DETACH_TRANSACTION_WARNING = SOURCE + "001";
    /**
     * clisource002 - This action will attach document to the transaction. Are
     * you sure?
     */
    public static final String SOURCE_ATTACH_TRANSACTION_WARNING = SOURCE + "002";
    /**
     * clisource003 - Loading document on the server
     */
    public static final String SOURCE_LOAD_DOC_ON_SERVER = SOURCE + "003";
    /**
     * clisource004 - Document has been saved successfully.
     */
    public static final String SOURCE_SAVED = SOURCE + "004";
    /**
     * clisource005 - Document has been added.
     */
    public static final String SOURCE_ADDED = SOURCE + "005";
    /**
     * clisource006 - The document could not be retrieved for display.
     */
    public static final String SOURCE_NO_DOCUMENT = SOURCE + "006";
    /**
     * clisource007 - Document shouldn't be null.
     */
    public static final String SOURCE_MUST_BE_NOT_NULL = SOURCE + "007";
    /**
     * clisource008 - Attorney name shouldn't be empty.
     */
    public static final String SOURCE_ATTORNEY_NAME_NOT_NULL = SOURCE + "008";
    /**
     * clisource009 - Person name shouldn't be empty.
     */
    public static final String SOURCE_PERSON_NAME_NOT_NULL = SOURCE + "009";
    /**
     * clisource010 - Document not found.
     */
    public static final String SOURCE_NOT_FOUND = SOURCE + "010";
    /**
     * clisource011 - Pdf file {0} has been generated and saved into archive
     *
     */
    public static final String SOURCE_SYS_REP_GENERATED = SOURCE + "011";
    // Validation messages 
    /**
     * clivldtn001 - You have duplicated objects in the list
     */
    public static final String VALIDATION_NODUPLICATES = VALIDATION + "001";
    /**
     * clivldtn002 - You have duplicated parties in one share.
     */
    public static final String VALIDATION_SHARE_NODUPLICATES = VALIDATION + "002";
    /**
     * clivldtn003 - Fill in at least one owner.
     */
    public static final String VALIDATION_OWNER_FILL = VALIDATION + "003";
    /**
     * clivldtn004 - Fill in numerator.
     */
    public static final String VALIDATION_NUM_FILL = VALIDATION + "004";
    /**
     * clivldtn005 - Minimum value for numerator is 1.
     */
    public static final String VALIDATION_MIN_NUM = VALIDATION + "005";
    /**
     * clivldtn006 - Fill in denominator.
     */
    public static final String VALIDATION_DEN_FILL = VALIDATION + "006";
    /**
     * clivldtn007 - Minimum value for denominator is 1.
     */
    public static final String VALIDATION_MIN_DEN = VALIDATION + "007";
    // BR messages
    /**
     * clibr001 - For selected target type \"Service moment\" and \"Application
     * moment\" should be empty.
     */
    public static final String BR_REGISTRATION_MOMENT_VALIDATION = BR + "001";
    /**
     * clibr002 - For selected target type \"Service moment\" and \"Registration
     * moment\" should be empty.
     */
    public static final String BR_APPLICATION_MOMENT_VALIDATION = BR + "002";
    /**
     * clibr003 - Select Right and Restriction target type.
     */
    public static final String BR_RRR_TYPE_VALIDATION = BR + "003";
    /**
     * clibr004 - For selected target type \"Application moment\" and
     * \"Registration moment\" should be empty.
     */
    public static final String BR_SERVICE_MOMENT_VALIDATION = BR + "004";
    /**
     * clibr005 - Select target type, different from application.
     */
    public static final String BR_REQUEST_TYPE_VALIDATION = BR + "005";
    // Admin messages
    /**
     * cliadmin001 - Are you sure you want to delete group? All users included
     * in the group will lose access rights, assigned to this group.
     */
    public static final String ADMIN_CONFIRM_DELETE_GROUP = ADMIN + "001";
    /**
     * cliadmin002 - Group has been saved successfully.
     */
    public static final String ADMIN_GROUP_SAVED = ADMIN + "002";
    /**
     * cliadmin003 - Role has been saved successfully.
     */
    public static final String ADMIN_ROLE_SAVED = ADMIN + "003";
    /**
     * cliadmin004 - Are you sure you want to delete role? All groups having
     * this role will lose related access rights.
     */
    public static final String ADMIN_CONFIRM_DELETE_ROLE = ADMIN + "004";
    /**
     * cliadmin005 - Group has been created successfully.
     */
    public static final String ADMIN_GROUP_CREATED = ADMIN + "005";
    /**
     * cliadmin006 - Role has been created successfully.
     */
    public static final String ADMIN_ROLE_CREATED = ADMIN + "006";
    /**
     * cliadmin007 - Are you sure you want to delete user?
     */
    public static final String ADMIN_CONFIRM_DELETE_USER = ADMIN + "007";
    /**
     * cliadmin008 - User has been created successfully.
     */
    public static final String ADMIN_USER_CREATED = ADMIN + "008";
    /**
     * cliadmin009 - User has been saved successfully.
     */
    public static final String ADMIN_USER_SAVED = ADMIN + "009";
    /**
     * cliadmin010 - No users were found.
     */
    public static final String ADMIN_USERS_NO_FOUND = ADMIN + "010";
    /**
     * cliadmin011 - Password has been changed successfully.
     */
    public static final String ADMIN_PASSWORD_CHANGED = ADMIN + "011";
    /**
     * cliadmin012 - Current user can't be deleted.
     */
    public static final String ADMIN_CURRENT_USER_DELETE_ERROR = ADMIN + "012";
    /**
     * cliadmin013 - You don't have administrator's rights.
     */
    public static final String ADMIN_NO_ADMIN_RIGHTS = ADMIN + "013";
    /**
     * cliadmin014 - Current user can't be disabled.
     */
    public static final String ADMIN_CURRENT_USER_DISABLE_ERROR = ADMIN + "014";
    /**
     * cliadmin015 - New \"{0}\" object has been created.
     */
    public static final String ADMIN_REFDATA_CREATED = ADMIN + "015";
    /**
     * cliadmin016 - Are you sure you want to delete \"{0}\"?. It might affect
     * data in other tables.
     */
    public static final String ADMIN_CONFIRM_DELETE_REFDATA = ADMIN + "016";
    /**
     * cliadmin017 - Object has been saved successfully.
     */
    public static final String ADMIN_OBJECT_SAVED = ADMIN + "017";
    /**
     * cliadmin018 - No business rules where found.
     */
    public static final String ADMIN_BR_NO_FOUND = ADMIN + "018";
    /**
     * cliadmin019 - New business rule has been created.
     */
    public static final String ADMIN_BR_CREATED = ADMIN + "019";
    /**
     * cliadmin020 - Business rule has been saved successfully.
     */
    public static final String ADMIN_BR_SAVED = ADMIN + "020";
    /**
     * cliadmin021 - Are you sure you want to delete \"{0}\"?.
     */
    public static final String ADMIN_CONFIRM_DELETE_BR = ADMIN + "021";
    /**
     * cliadmin022 - There are business rule validations dependent on the
     * current object. Remove them first before deleting object.
     */
    public static final String ADMIN_BR_REMOVE_VALIDATIONS = ADMIN + "022";
    /**
     * cliadmin023 - Reference data object \"{0}\" has been saved.
     */
    public static final String ADMIN_REFDATA_SAVED = ADMIN + "023";

    /**
     * cliadmin024 - Extract records from the system...
     */
    public static final String ADMIN_CONSOLIDATION_EXTRACT = ADMIN + "024";

    /**
     * cliadmin025 - Consolidate records to the current system...
     */
    public static final String ADMIN_CONSOLIDATION_CONSOLIDATE = ADMIN + "025";

    /**
     * cliadmin026 - Output file: {0}.
     */
    public static final String ADMIN_CONSOLIDATION_EXTRACT_OUTPUT_FILE = ADMIN + "026";

    /**
     * cliadmin027 - Extracted database file is missing.
     */
    public static final String ADMIN_CONSOLIDATION_CONSOLIDATE_FILE_MISSING = ADMIN + "027";

    /**
     * cliadmin028 - Uploading file ...
     */
    public static final String ADMIN_CONSOLIDATION_CONSOLIDATE_UPLOADING_FILE = ADMIN + "028";

    /**
     * cliadmin029 - done.
     */
    public static final String ADMIN_CONSOLIDATION_DONE = ADMIN + "029";

    /**
     * cliadmin030 - Consolidating in server...
     */
    public static final String ADMIN_CONSOLIDATION_CONSOLIDATE_CONSOLIDATING_IN_SERVER = ADMIN + "030";

    /**
     * cliadmin031 - Downloading extracted file...
     */
    public static final String ADMIN_CONSOLIDATION_EXTRACT_DOWNLOAD = ADMIN + "031";
        /**
     * cliadmin032 - Server cached flushed successfully.
     */
    public static final String ADMIN_FLUSH_CACHE = ADMIN + "032";

    // Progress bar messages
    /**
     * cliprgs001 - Opening application form...
     */
    public static final String PROGRESS_MSG_OPEN_APP = PROGRESSMSG + "001";
    /**
     * cliprgs002 - Opening application assignment form...
     */
    public static final String PROGRESS_MSG_OPEN_APPASSIGN = PROGRESSMSG + "002";
    /**
     * cliprgs003 - Opening application search form...
     */
    public static final String PROGRESS_MSG_OPEN_APPSEARCH = PROGRESSMSG + "003";
    /**
     * cliprgs004 - Opening map...
     */
    public static final String PROGRESS_MSG_OPEN_MAP = PROGRESSMSG + "004";
    /**
     * cliprgs005 - Opening new application form...
     */
    public static final String PROGRESS_MSG_OPEN_APPNEW = PROGRESSMSG + "005";
    /**
     * cliprgs006 - Opening property search form...
     */
    public static final String PROGRESS_MSG_OPEN_PROPERTYSEARCH = PROGRESSMSG + "006";
    /**
     * cliprgs007 - Opening document search form...
     */
    public static final String PROGRESS_MSG_OPEN_DOCUMENTSEARCH = PROGRESSMSG + "007";
    /**
     * cliprgs008 - Opening person search form...
     */
    public static final String PROGRESS_MSG_OPEN_PERSONSEARCH = PROGRESSMSG + "008";
    /**
     * cliprgs009 - Opening property form...
     */
    public static final String PROGRESS_MSG_OPEN_PROPERTY = PROGRESSMSG + "009";
    /**
     * cliprgs010 - Saving...
     */
    public static final String PROGRESS_MSG_SAVING = PROGRESSMSG + "010";
    /**
     * cliprgs011 - Opening prior property selection form...
     */
    public static final String PROGRESS_MSG_OPEN_PROPERTYLINK = PROGRESSMSG + "011";
    /**
     * cliprgs012 - Opening person form...
     */
    public static final String PROGRESS_MSG_OPEN_PERSON = PROGRESSMSG + "012";
    /**
     * cliprgs013 - Calculating fee...
     */
    public static final String PROGRESS_MSG_APP_CALCULATINGFEE = PROGRESSMSG + "013";
    /**
     * cliprgs014 - Validating...
     */
    public static final String PROGRESS_MSG_APP_VALIDATING = PROGRESSMSG + "014";
    /**
     * cliprgs015 - Taking action on application...
     */
    public static final String PROGRESS_MSG_APP_TAKE_ACTION = PROGRESSMSG + "015";
    /**
     * cliprgs016 - Opening document registration form...
     */
    public static final String PROGRESS_MSG_OPEN_DOCREGISTRATION = PROGRESSMSG + "016";
    /**
     * cliprgs017 - Opening cadastre change form...
     */
    public static final String PROGRESS_MSG_OPEN_CADASTRE_CHANGE = PROGRESSMSG + "017";
    /**
     * cliprgs018 - Searching applications...
     */
    public static final String PROGRESS_MSG_APP_SEARCHING = PROGRESSMSG + "018";
    /**
     * cliprgs019 - Searching properties...
     */
    public static final String PROGRESS_MSG_PROPERTY_SEARCHING = PROGRESSMSG + "019";
    /**
     * cliprgs020 - Searching documents...
     */
    public static final String PROGRESS_MSG_DOCUMENT_SEARCHING = PROGRESSMSG + "020";
    /**
     * cliprgs021 - Searching persons...
     */
    public static final String PROGRESS_MSG_PERSON_SEARCHING = PROGRESSMSG + "021";
    /**
     * cliprgs022 - Opening document...
     */
    public static final String PROGRESS_MSG_DOCUMENT_OPENING = PROGRESSMSG + "022";
    /**
     * cliprgs023 - Getting list of documents...
     */
    public static final String PROGRESS_MSG_DOCUMENT_GETTING_LIST = PROGRESSMSG + "023";
    /**
     * cliprgs024 - Canceling service...
     */
    public static final String PROGRESS_MSG_SERVICE_CANCELING = PROGRESSMSG + "024";
    /**
     * cliprgs025 - Completing service...
     */
    public static final String PROGRESS_MSG_SERVICE_COMPLETING = PROGRESSMSG + "025";
    /**
     * cliprgs026 - Reverting service...
     */
    public static final String PROGRESS_MSG_SERVICE_REVERTING = PROGRESSMSG + "026";
    /**
     * cliprgs027 - Opening document form...
     */
    public static final String PROGRESS_MSG_DOCUMENT_FORM_OPENING = PROGRESSMSG + "027";
    /**
     * cliprgs028 - Saving document...
     */
    public static final String PROGRESS_MSG_DOCUMENT_SAVING = PROGRESSMSG + "028";
    /**
     * cliprgs030 - Searching {0}...
     */
    public static final String PROGRESS_MSG_MAP_SEARCHING = PROGRESSMSG + "030";
    /**
     * cliprgs031 - Generating thumbnail...
     */
    public static final String PROGRESS_MSG_GENERATE_THUMBNAIL = PROGRESSMSG + "031";
    /**
     * cliprgs032 - Searching power of attorney...
     */
    public static final String PROGRESS_MSG_POWER_OF_ATTORNEY_SEARCHING = PROGRESSMSG + "032";
    /**
     * cliprgs033 - Getting application...
     */
    public static final String PROGRESS_MSG_APP_GETTING = PROGRESSMSG + "033";
    /**
     * cliprgs034 - Getting document...
     */
    public static final String PROGRESS_MSG_DOCUMENT_GETTING = PROGRESSMSG + "034";
    /**
     * cliprgs035 - Starting service...
     */
    public static final String PROGRESS_MSG_SERVICE_STARTING = PROGRESSMSG + "035";
    /**
     * cliprgs036 - Starting spatial object load operation...
     */
    public static final String PROGRESS_MSG_SPATIAL_OBJECT_LOAD_STARTING = PROGRESSMSG + "036";
    /**
     * cliprgs037 - Starting source load operation...
     */
    public static final String PROGRESS_MSG_SOURCE_LOAD_STARTING = PROGRESSMSG + "037";
    /**
     * cliprgs038 - Searching rights, it may take several minutes...
     */
    public static final String PROGRESS_MSG_SEARCH_RIGHTS = PROGRESSMSG + "038";
    /**
     * cliprgs039 - Exporting rights, it may take several minutes...
     */
    public static final String PROGRESS_MSG_EXPORT_RIGHTS = PROGRESSMSG + "039";
    /**
     * cliprgs040 - Getting property...
     */
    public static final String PROGRESS_MSG_BA_UNIT_GETTING = PROGRESSMSG + "040";
    /**
     * cliprgs041 - Generating report...
     */
    public static final String PROGRESS_MSG_GENERATING_REPORT = PROGRESSMSG + "041";
    /**
     * cliprgs100 - Opening notation...
     */
    public static final String PROGRESS_MSG_OPEN_NOTATION = PROGRESSMSG + "100";
    /**
     * cliprgs101 - Opening parcel...
     */
    public static final String PROGRESS_MSG_OPEN_PARCEL = PROGRESSMSG + "101";
    /**
     * cliprgs102 - Assigning property manager...
     */
    public static final String PROGRESS_MSG_ASSIGN_PROP_MANAGER = PROGRESSMSG + "102";
    /**
     * cliprgs103 - Assigning job...
     */
    public static final String PROGRESS_MSG_ASSIGN_JOB = PROGRESSMSG + "103";
        /**
     * cliprgs104 - Loading properties to action...
     */
    public static final String PROGRESS_MSG_PROP_TO_ACTION = PROGRESSMSG + "104";
            /**
     * cliprgs105 - Searching parcels...
     */
    public static final String PROGRESS_MSG_SEARCHING_PARCELS = PROGRESSMSG + "105";
    /**
     * cliprgs106 - Saving security changes...
     */
    public static final String PROGRESS_MSG_SAVE_SECURITY_CHANGES = PROGRESSMSG + "106";
    /**
     * cli_bulk_operations_001 - The destination attribute already exist! You
     * can remove it before adding it again.
     */
    public static final String BULK_OPERATIONS_DESTINATION_ATTRIBUTE_EXISTS = BULK_OPERATIONS + "001";
    /**
     * cli_bulk_operations_002 - Converting features to sola spatial objects and
     * send to server...
     */
    public static final String BULK_OPERATIONS_CONVERT_FEATURES_TO_BEANS_AND_SENDTOSERVER
            = BULK_OPERATIONS + "002";
    /**
     * cli_bulk_operations_003 - Retrieving sources and sending them to the
     * server ...
     */
    public static final String BULK_OPERATIONS_LOAD_SOURCE_AND_SENDTOSERVER
            = BULK_OPERATIONS + "003";
    /**
     * cli_bulk_operations_004 - Document type {0} is not found in the system.
     * System administrator must be approached to add it in the system.
     */
    public static final String BULK_OPERATIONS_LOAD_SOURCE_TYPE_NOT_FOUND
            = BULK_OPERATIONS + "004";
    /**
     * clisec001 - Your password is due to expire in {0} days.
     */
    public static final String SECURITY_WARN_PWORD_EXPIRY = SECURITY + "001";
    /**
     * clisec002 - Your password has been set by an administrator.
     */
    public static final String SECURITY_PASSWORD_SET_BY_ADMIN = SECURITY + "002";
    /**
     * clisec003 - Your password has expired.
     */
    public static final String SECURITY_PASSWORD_EXPIRED = SECURITY + "003";
}
