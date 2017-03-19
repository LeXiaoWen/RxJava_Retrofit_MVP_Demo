package com.leo.rxjava_retrofit_mvp_demo.ui.adapter;

import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.leo.rxjava_retrofit_mvp_demo.R;
import com.leo.rxjava_retrofit_mvp_demo.api.ApiContancts;
import com.leo.rxjava_retrofit_mvp_demo.mvp.CookListModel;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Leo on 2017/3/15.
 */

public class MyAdapter extends BaseQuickAdapter<CookListModel.TngouBean>{
    public MyAdapter( List<CookListModel.TngouBean> data) {
        super(R.layout.item_cook_list, data);
    }



    @Override
    protected void convert(BaseViewHolder viewHolder, CookListModel.TngouBean tngouBean) {
        viewHolder.setText(R.id.cook_description,tngouBean.getDescription());
        viewHolder.setText(R.id.cook_name,tngouBean.getName());
        Picasso
                .with(mContext)
                .load(ApiContancts.Image_BASE_URL+tngouBean.getImg())
                .into((ImageView) viewHolder.getView(R.id.cook_image));
    }
}
