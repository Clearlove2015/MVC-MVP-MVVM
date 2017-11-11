package com.aron.mvp.presenter.impl;

import com.aron.mvp.presenter.OtherBasePresenter;
import com.aron.mvp.view.OtherBaseView;

/**
 * Created by zhucheng on 2017/11/11.
 * OtherActivity业务逻辑的具体的实现
 */

public class OtherPresenterImpl implements OtherBasePresenter {
    private OtherBaseView otherBaseView;

    @Override
    public void attachView(OtherBaseView v) {
        this.otherBaseView = v;
    }

    @Override
    public void detachView() {
        otherBaseView = null;
    }

    @Override
    public void uploadImage(String path) {
        //上传图片逻辑
    }
}
