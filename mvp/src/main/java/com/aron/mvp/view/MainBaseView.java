package com.aron.mvp.view;

/**
 * Created by zhucheng on 2017/11/11.
 * 只负责MainActivity中的UI逻辑
 */

public interface MainBaseView extends BaseView{

    void loginSuccess(String msg);
    void loginFailed(String msg);

}
