package com.didi.wancore;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by didi on 2018/1/31.
 */

public abstract class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }
}
