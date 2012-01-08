/**
 * ******************************************************************************************
 * Copyright (C) 2011 - Food and Agriculture Organization of the United Nations (FAO).
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
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.common.messaging;

/**
 *
 * @author soladev
 */
public class GisMessage {

    public static final String MSG_PREFIX = "gis";
    
    // Message groups
    private static final String TEST = MSG_PREFIX + "test";
    private static final String GENERAL = MSG_PREFIX + "gnrl";
    private static final String INFOTOOL = MSG_PREFIX + "infotool";
    private static final String LOCATE = MSG_PREFIX + "locate";
    private static final String GEOTOOLS = MSG_PREFIX + "geotools5";
    private static final String CADASTRE_CHANGE = MSG_PREFIX + "_cadastre_change_";
   // General Messages
    /** gisgnrl001 - Error starting the service */
    public static final String GENERAL_ERROR_STARTING_SERVICE = GENERAL + "001";
    /** gisgnrl002 - CollectionFeatureSource is an inmemory wrapper */
    public static final String GENERAL_EXCEPTION_COLLFEATSOURCE = GENERAL + "002";
    /** gisgnrl003 - Filter not found */
    public static final String GENERAL_EXCEPTION_FILTER_NOTFOUND = GENERAL + "003";
    /** gisgnrl004 - Type of filter not supported */
    public static final String GENERAL_EXCEPTION_TYPE_NOTSUPPORTED = GENERAL + "004";
    /** gisgnrl005 - Under Construction */
    public static final String GENERAL_UNDER_CONSTRUCTION = GENERAL + "005";
   // Info Tool    
    /** gisinfotool001 - Click to get information */
    public static final String INFOTOOL_CLICK = INFOTOOL + "001";
   // Locate Remove App    
    /** gislocate001 - Click to remove location */
    public static final String LOCATE_REMOVE = LOCATE + "001";
    /** gislocate002 - Error in setting location */
    public static final String LOCATE_ERROR_SETUP = LOCATE + "002";

    public static final String ADDING_FEATURE_ERROR = GEOTOOLS + "01";
    public static final String MAPCONTROL_MAPCONTEXT_WITHOUT_SRID_ERROR = GEOTOOLS + "02";
    public static final String DRAWINGTOOL_GEOMETRY_NOT_VALID_ERROR = GEOTOOLS + "03";
    public static final String LAYERGRAPHICS_STARTUP_ERROR = GEOTOOLS + "04";
    public static final String SHAPEFILELAYER_FILE_NOT_FOUND_ERROR = GEOTOOLS + "05";
    public static final String REMOVE_ALL_FEATURES_ERROR = GEOTOOLS + "06";
    public static final String LAYER_NOT_ADDED_ERROR = GEOTOOLS + "07";
    public static final String WMSLAYER_NOT_INITIALIZED_ERROR = GEOTOOLS + "08";
    public static final String WMSLAYER_LAYER_NOT_FOUND_ERROR = GEOTOOLS + "09";
    public static final String UTILITIES_SLD_DOESNOT_EXIST_ERROR = GEOTOOLS + "10";
    public static final String UTILITIES_SLD_LOADING_ERROR = GEOTOOLS + "11";
    public static final String UTILITIES_COORDSYS_COULDNOT_BE_CREATED_ERROR = GEOTOOLS + "12";
    public static final String DRAWINGTOOL_NOT_ENOUGH_POINTS_INFORMATIVE = GEOTOOLS + "13";
    public static final String PARCEL_TARGET_NOT_FOUND = GEOTOOLS + "14";
    public static final String PARCEL_ERROR_ADDING_PARCEL  = GEOTOOLS + "15";

    //Cadastre change messages

    /** The point has to fall on an current node or to a line*/
    public static final String CADASTRE_CHANGE_HAS_TO_SNAP  = CADASTRE_CHANGE + "001";
    /** The points of the new parcel has to fall in the points that are marked boundary.*/
    public static final String CADASTRE_CHANGE_NEW_CO_MUST_SNAP  = CADASTRE_CHANGE + "002";
    /** The official area is wrong.*/
    public static final String CADASTRE_CHANGE_CO_OFFICIAL_AREA_WRONG  = CADASTRE_CHANGE + "003";
    /** Error adding point.*/
    public static final String CADASTRE_CHANGE_ERROR_ADDING_POINT  = CADASTRE_CHANGE + "004";
    /** Error removing point: found in parcel.*/
    public static final String CADASTRE_CHANGE_ERROR_POINT_FOUND_IN_PARCEL  = CADASTRE_CHANGE + "005";
    /** Error adding cadastre object.*/
    public static final String CADASTRE_CHANGE_ERROR_ADD_CO  = CADASTRE_CHANGE + "006";
    /** Error in cadastre change setup.*/
     public static final String CADASTRE_CHANGE_ERROR_SETUP  = CADASTRE_CHANGE + "007";
    /** Error while adding points in start of the cadastre change.*/
     public static final String CADASTRE_CHANGE_ERROR_ADDINGPOINT_IN_START  = CADASTRE_CHANGE + "008";
    /** Error while adding new cadastre objects in start of the cadastre change.*/
     public static final String CADASTRE_CHANGE_ERROR_ADDINGNEWCADASTREOBJECT_IN_START  = 
             CADASTRE_CHANGE + "009";
    /** Error while adding target cadastre objects in start of the cadastre change.*/
     public static final String CADASTRE_CHANGE_ERROR_ADDTARGET_IN_START  = CADASTRE_CHANGE + "010";
    /** The cadastre change is saved successfully.*/
    public static final String CADASTRE_CHANGE_SAVED_SUCCESSFULLY  = CADASTRE_CHANGE + "011";
     
    // <editor-fold defaultstate="collapsed" desc="Test Messages">  
    /** gistest001 - Unit Test Message */
    public static final String TEST001 = TEST + "001";
    // </editor-fold>
}
