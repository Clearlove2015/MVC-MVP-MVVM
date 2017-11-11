package com.aron.mvp.presenter;

import com.aron.mvp.model.User;
import com.aron.mvp.view.MainBaseView;

/**
 * Created by zhucheng on 2017/11/11.
 * 只为MainActivity提供业务逻辑
 */

public interface MainBasePresenter extends BasePresenter<MainBaseView>{

    void login(User user);

}
