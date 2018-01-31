package com.didi.wancore.app;

import android.content.Context;

/**
 * Created by didi on 2018/1/30.
 */

public class AppCore {
    /**
     *  get configurator
     * @return Configurator single instance
     */
    public static final Configurator getConfigurator(){
        return Configurator.newInstance();
    }

    /**
     *  set base url
     * @param url
     */
    public static final void url(String url){
        getConfigurator().setConfiguration(ConfigType.BASE_URL.name(),url);
    }

    /**
     *  set application context
     * @param context
     */
    public static final void context(Context context){
        getConfigurator().setConfiguration(ConfigType.BASE_CONTEXT.name(),context);
    }

    /**
     *
     * @return base url
     */
    public static final String url(){
        return (String) getConfigurator().getConfiguration(ConfigType.BASE_URL.name());
    }

    /**
     *
     * @return application context
     */
    public static final Context context(){
        return (Context) getConfigurator().getConfiguration(ConfigType.BASE_CONTEXT.name());
    }
}
