package com.aron.mvp.presenter;

import com.aron.mvp.view.OtherBaseView;

/**
 * Created by zhucheng on 2017/11/11.
 * 只为OtherActivity提供业务逻辑
 */

public interface OtherBasePresenter extends BasePresenter<OtherBaseView>{

    void uploadImage(String path);

}
