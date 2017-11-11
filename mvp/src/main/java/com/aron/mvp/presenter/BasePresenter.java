package com.aron.mvp.presenter;

/**
 * Created by zhucheng on 2017/11/11.
 * 抽取Activity的业务逻辑
 */

public interface BasePresenter<T> {

    /**
     * 通过使用泛型替代不同的view
     * @param v
     */

    //绑定view
    void attachView(T v);

    //解绑view
    void detachView();


}
