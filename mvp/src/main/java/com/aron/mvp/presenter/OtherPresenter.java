package com.aron.mvp.presenter;

import com.aron.mvp.view.OtherView;

/**
 * Created by zhucheng on 2017/11/9.
 */

public interface OtherPresenter extends BasePresenter<OtherView>{

    //上传
    void upload();

    //下载
    void download();

}
