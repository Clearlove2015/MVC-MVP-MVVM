package com.aron.mvp.presenter;


import com.aron.mvp.view.MainView;

/**
 * Created by zhucheng on 2017/11/9.
 */

public interface MainPresenter extends BasePresenter<MainView> {

    //登录
    boolean login(String name,String psw);


}
