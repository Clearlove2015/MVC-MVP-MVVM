package com.aron.mvp.presenter.impl;

import android.text.TextUtils;

import com.aron.mvp.model.User;
import com.aron.mvp.presenter.MainBasePresenter;
import com.aron.mvp.view.MainBaseView;

/**
 * Created by zhucheng on 2017/11/11.
 * MainActivity业务逻辑的具体实现
 */

public class MainPresenterImpl implements MainBasePresenter {

    private MainBaseView mainBaseView;

    @Override
    public void attachView(MainBaseView v) {
        this.mainBaseView = v;
    }

    @Override
    public void detachView() {
        mainBaseView = null;
    }

    @Override
    public void login(User user) {
        //模拟网络登录
        if (!TextUtils.isEmpty(user.getName()) && !TextUtils.isEmpty(user.getPwd())) {
            if (user.getName().equals("zhangsan") && user.getPwd().equals("123456")) {
                mainBaseView.showToast("登录成功");
            } else {
                mainBaseView.showToast("登录失败");
            }
        } else {
            mainBaseView.showToast("用户名和密码不能为空");
        }
    }
}
