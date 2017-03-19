package com.leo.rxjava_retrofit_mvp_demo.api;



import com.leo.rxjava_retrofit_mvp_demo.mvp.CookListModel;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Leo on 2017/3/7.
 */

public interface ApiService {

    //菜谱接口
    @GET("/api/cook/list")
    Observable<CookListModel> getCookList(@Query("page") int page, @Query("rows") int rows);




}
