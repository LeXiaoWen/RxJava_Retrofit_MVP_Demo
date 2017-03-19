package com.leo.rxjava_retrofit_mvp_demo.mvp;


import com.leo.rxjava_retrofit_mvp_demo.api.ApiCallback;
import com.leo.rxjava_retrofit_mvp_demo.base.BasePresenter;

/**
 * Created by Leo on 2017/3/15.
 */

public class CookListPresenter extends BasePresenter<CookListView> {
    public CookListPresenter(CookListView view) {
        attachView(view);
    }
    public void loadDataByRetrofitRxjava(int page,int rows) {
        mvpView.showLoading();
        addSubscription(apiStores.getCookList(page,rows), new ApiCallback<CookListModel>(){

            @Override
            public void onSuccess(CookListModel model) {
                mvpView.getDataSuccess(model);
            }

            @Override
            public void onFailure(String msg) {
            mvpView.getDataFail(msg);
            }

            @Override
            public void onFinish() {
                mvpView.hideLoading();
            }
        } );
    }
}
