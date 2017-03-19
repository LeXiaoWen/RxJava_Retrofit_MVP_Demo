package com.leo.rxjava_retrofit_mvp_demo.mvp;

import android.os.Bundle;

import com.leo.rxjava_retrofit_mvp_demo.base.BaseActivity;
import com.leo.rxjava_retrofit_mvp_demo.base.BasePresenter;


/**
 * Created by Leo on 2017/3/15.
 */

public abstract class MvpActivity<P extends BasePresenter> extends BaseActivity {

    protected P mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mvpPresenter = createPresenter();
        super.onCreate(savedInstanceState);
    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mvpPresenter != null) {
            mvpPresenter.detachView();
        }
    }

    public void showLoading() {
        showProgressDialog();
    }

    public void hideLoading() {
        dismissProgressDialog();
    }
}
