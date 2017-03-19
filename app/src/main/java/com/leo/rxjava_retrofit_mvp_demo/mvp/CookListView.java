package com.leo.rxjava_retrofit_mvp_demo.mvp;


import com.leo.rxjava_retrofit_mvp_demo.base.BaseView;

/**
 * Created by Leo on 2017/3/15.
 */

public interface CookListView extends BaseView {
    void getDataSuccess(CookListModel model);

    void getDataFail(String msg);
}
