package com.didi.wancore.net.cookies;

import com.didi.wancore.account.AccountManger;
import com.didi.wancore.utils.LogUtils;


import java.io.IOException;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by didi on 2018/2/3.
 */

public class CookieInterceptor implements Interceptor {
    private String mCookies = null;
    @Override
    public Response intercept(Chain chain) throws IOException {
        //we need load cookies from preferences to get user info
        Request.Builder builder = null;
        Response response = null;
        if (mCookies==null&&!chain.request().url().url().toString().contains("/user/")){
            mCookies = AccountManger.getCookies();
        }
        if (mCookies!=null){
            builder = chain.request().newBuilder();
            builder.addHeader("cookie", mCookies);
        }
        if (builder!=null)
             response = chain.proceed(builder.build());
        else
            response = chain.proceed(chain.request());
        //we need save cookies when user register or signin
        if (response.request().url().url().toString().contains("/user/")){
            List<String> cookies = response.headers().values("Set-Cookie");
            StringBuilder sb = new StringBuilder();
            for (String c : cookies){
                sb.append(c);
            }
            mCookies = sb.toString();
            AccountManger.setCookies(mCookies);
        }
        return response;
    }
}
