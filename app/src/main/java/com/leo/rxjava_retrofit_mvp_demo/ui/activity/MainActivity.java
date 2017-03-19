package com.leo.rxjava_retrofit_mvp_demo.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.leo.rxjava_retrofit_mvp_demo.R;
import com.leo.rxjava_retrofit_mvp_demo.mvp.CookListModel;
import com.leo.rxjava_retrofit_mvp_demo.mvp.CookListPresenter;
import com.leo.rxjava_retrofit_mvp_demo.mvp.CookListView;
import com.leo.rxjava_retrofit_mvp_demo.mvp.MvpActivity;
import com.leo.rxjava_retrofit_mvp_demo.ui.adapter.MyAdapter;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends MvpActivity<CookListPresenter> implements CookListView {

    @BindView(R.id.btn)
    Button mBtn;
    @BindView(R.id.recycler)
    RecyclerView mRecycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initToolBarAsHome("MVP+Retrofit+RxJava");
    }

    @Override
    protected CookListPresenter createPresenter() {
        return new CookListPresenter(this);
    }

    @Override
    public void getDataSuccess(CookListModel model) {
        dataSuccess(model);
        mvpPresenter.mvpView.hideLoading();
    }

    @Override
    public void getDataFail(String msg) {
        toastShow("网络不给力！");
    }

    @OnClick(R.id.btn)
    public void onClick() {
        mvpPresenter.loadDataByRetrofitRxjava(1,20);
    }

    //处理数据
    private void dataSuccess(CookListModel model) {
        MyAdapter adapter = new MyAdapter(model.getTngou());
        mRecycler.setLayoutManager(new LinearLayoutManager(this));
        mRecycler.setAdapter(adapter);
    }
}
