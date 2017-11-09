package com.aron.mvp.presenter;

import android.text.TextUtils;

import com.aron.mvp.view.MainView;

/**
 * Created by zhucheng on 2017/11/9.
 */

public class MainPresenterImpl implements MainPresenter {
    @Override
    public void attach(MainView v) {

    }

    @Override
    public void detach() {

    }

    @Override
    public boolean login(String name, String psw) {
        if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(psw)){
            if(name.equals("zhangsan") && psw.equals("123456")){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
