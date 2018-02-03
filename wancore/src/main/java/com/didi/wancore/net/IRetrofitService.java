package com.didi.wancore.net;

import com.didi.wancore.bean.ActionBean;
import com.didi.wancore.bean.ArticleBean;
import com.didi.wancore.bean.HotKeyBean;
import com.didi.wancore.bean.OwnWebsiteBean;
import com.didi.wancore.bean.QueryBean;
import com.didi.wancore.bean.SignBean;
import com.didi.wancore.bean.TreeBean;
import com.didi.wancore.bean.WebsiteBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by didi on 2018/1/31.
 */

public interface IRetrofitService{

    @GET("article/list/{page}/json")
    Observable<ArticleBean> feed(@Path("page")int page);

    @GET("article/list/{page}/json?cid={captureid}")
    Observable<ArticleBean> treeArticle(@Path("page")int page,@Path("captureid")int cid);

    @GET("tree/json")
    Observable<TreeBean> tree();

    @FormUrlEncoded
    @POST("article/query/{page}/json")
    Observable<QueryBean> query(@Path("page") int page);

    @GET("friend/json")
    Observable<WebsiteBean> friendWeb();

    @GET("hotkey/json")
    Observable<HotKeyBean> hotkey();

    @FormUrlEncoded
    @POST("user/login")
    Observable<SignBean> login(@Field("username")String username, @Field("password")String password);


    @FormUrlEncoded
    @POST("user/register")
    Observable<SignBean> register(@Field("username")String username,@Field("password")String password,@Field("repassword")String repassword);

    @FormUrlEncoded
    @POST("lg/collect/{num}/json")
    Observable<ActionBean> collectArticle(@Path("num") int num);

    @FormUrlEncoded
    @POST("lg/collect/add/json")
    Observable<ActionBean> collectWebArticle(@Field("title")String title,@Field("author")String author,@Field("link")String link);


    @FormUrlEncoded
    @POST("lg/collect/addtool/json")
    Observable<ActionBean> collectWebsite(@Field("name")String name,@Field("link")String link);

    @FormUrlEncoded
    @POST("lg/uncollect/99/json")
    Observable<ActionBean> cancelCollectArticle(@Field("originId")int id);

    @GET("lg/collect/usertools/json")
    Observable<OwnWebsiteBean> collectedWebsite();


    @FormUrlEncoded
    @POST("lg/collect/updatetool/json")
    Observable<ActionBean> updateCollectedWebsite(@Field("id")int id,@Field("name")String name,@Field("link")String link);


    @FormUrlEncoded
    @POST("lg/collect/deletetool/json")
    Observable<ActionBean> deleteCollectedWebsite(@Field("id")int id);

}
