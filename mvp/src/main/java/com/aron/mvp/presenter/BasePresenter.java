package com.aron.mvp.presenter;

/**
 * Created by zhucheng on 2017/11/9.
 */

public interface BasePresenter<T> {

    //绑定view
    void attach(T v);

    //解绑view
    void detach();

}
