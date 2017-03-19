package com.leo.rxjava_retrofit_mvp_demo.api;


import com.leo.rxjava_retrofit_mvp_demo.mvp.CookListModel;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by Leo on 2017/3/7.
 */

public class App {
    public static Retrofit initRetrofit(){
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(ApiContancts.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();


        return retrofit;
    }

    public static Observable<CookListModel> initCookList(int page, int rows){

        Observable<CookListModel> cookList =  initRetrofit()
                .create(ApiService.class)
                .getCookList(page, rows);
        return cookList;
    }










}
