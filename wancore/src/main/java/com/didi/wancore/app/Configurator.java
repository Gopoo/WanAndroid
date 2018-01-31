package com.didi.wancore.app;

import android.support.v4.util.ArrayMap;

/**
 * Created by didi on 2018/1/30.
 */

public class Configurator {
    private static ArrayMap<String,Object> MAP = new ArrayMap<>();
    /**
     *
     * @param key
     * @param value
     */
    protected void setConfiguration(String key,Object value){
        MAP.put(key,value);
    }

    /**
     *
     * @param key
     * @return value of key
     */
    protected Object getConfiguration(String key){
        return MAP.get(key);
    }

    private static final class Holder{
        private static final Configurator CONFIGURATOR = new Configurator();
    }
    static Configurator newInstance(){
        return Holder.CONFIGURATOR;
    }

}
