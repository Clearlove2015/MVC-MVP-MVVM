package com.aron.mvp.view;

/**
 * Created by zhucheng on 2017/11/9.
 */

public interface OtherView extends BaseView {

    //上传成功
    void upload_success();

    //下载成功
    void download_success();

    //显示进度
    void show_progress(int progress);
}
