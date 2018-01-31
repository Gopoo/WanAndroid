package com.didi.wancore.net;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by didi on 2018/1/31.
 */

public interface IRetrofitService {

    @GET("article/list/{page}/json")
    Observable<String> feed(@Path("page")int page);

    @GET("tree/json")
    Observable<String> tree();

    @FormUrlEncoded
    @POST("article/query/{page}/json")
    Observable<String> query(@Path("page") int page);

    @GET("hotkey/json")
    Observable<String> hotkey();

    @FormUrlEncoded
    @POST("user/login")
    Observable<String> login(@Field("username")String username,@Field("password")String password);


    @FormUrlEncoded
    @POST("user/register")
    Observable<String> register(@Field("username")String username,@Field("password")String password,@Field("repassword")String repassword);

    @FormUrlEncoded
    @POST("lg/collect/{num}/json")
    Observable<String> collect(@Path("num") String num);

    @FormUrlEncoded
    @POST("lg/collect/add/json")
    Observable<String> collect(@Field("title")String title,@Field("author")String author,@Field("link")String link);


}
