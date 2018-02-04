package com.didi.wancore.net;

import com.didi.wancore.app.AppCore;
import com.didi.wancore.net.cookies.CookieInterceptor;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by didi on 2018/1/31.
 */

public class RetrofitClient {
    private static final int DEFAULT_TIME_OUT = 5;
    private static final OkHttpClient OK_HTTP_CLIENT = new OkHttpClient.Builder()
            .cache(new Cache(new File("cache"),30*1024*1024))
            .connectTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
            .readTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
            .writeTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
            .addInterceptor(new CookieInterceptor())
            .build();
    private static final Retrofit RETROFIT_CLIENT = new Retrofit.Builder()
            .baseUrl(AppCore.url())
            .client(OK_HTTP_CLIENT)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static final IRetrofitService RETROFIT_SERVICE = RETROFIT_CLIENT.create(IRetrofitService.class);

    /**
     *
     * @return retrofit client
     */
    public static final Retrofit getClient(){
        return RETROFIT_CLIENT;
    }

    /**
     *
     * @return base service
     */
    public static final IRetrofitService getRetrofitService(){
        return RETROFIT_SERVICE;
    }

    /**
     *
     * @param service
     * @param <T>
     * @return interface
     */
    public static <T> T create(Class<T> service){
        return RETROFIT_CLIENT.create(service);
    }

    public static void init(){}
}
