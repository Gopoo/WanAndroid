package com.didi.wancore.app;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;

/**
 * Created by didi on 2018/1/30.
 */

public class Preferences{

    private static final SharedPreferences PREFERENCES = PreferenceManager.getDefaultSharedPreferences(Market.context());

    private static SharedPreferences getPreference(){
        return PREFERENCES;
    }

    /**
     *
     * @param name
     * @param value
     */
    public static void addProfile(String name,String value){
        getPreference().edit().putString(name,value).apply();
    }

    /**
     *
     * @param name
     * @param defaultvalue
     * @return
     */
    public static String getProfile(String name,@Nullable String defaultvalue){
        return getPreference().getString(name,defaultvalue);
    }

    /**
     *
     * @param name
     * @param value
     */
    public static void setAppFlags(String name,boolean value){
        getPreference().edit().putBoolean(name,value).apply();
    }

    /**
     *
     * @param name
     * @param defaultvalue
     * @return
     */
    public static boolean getAppFlags(String name,@Nullable boolean defaultvalue){
        return getPreference().getBoolean(name,defaultvalue);
    }

    /**
     *
     * @param name
     */
    public static void removeProfile(String name){
        getPreference().edit().remove(name).apply();
    }

    /**
     *
     */
    public static void clearProfiles(){
        getPreference().edit().clear().apply();
    }
}
