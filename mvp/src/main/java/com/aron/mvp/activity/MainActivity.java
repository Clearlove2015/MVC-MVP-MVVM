package com.aron.mvp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.aron.mvp.R;
import com.aron.mvp.presenter.MainPresenter;
import com.aron.mvp.presenter.MainPresenterImpl;
import com.aron.mvp.util.MyTools;
import com.aron.mvp.view.MainView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * MVP核心思想：
 * 1.UI逻辑抽象成View接口
 * 2.业务逻辑抽象成Presenter接口
 * 3.Presenter接口有多种实现
 */
public class MainActivity extends AppCompatActivity implements MainView{

    @Bind(R.id.et_name)
    EditText etName;
    @Bind(R.id.et_psw)
    EditText etPsw;
    @Bind(R.id.btn_login)
    Button btnLogin;

    MainPresenter mainPresenter = new MainPresenterImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        boolean login_staus = mainPresenter.login(etName.getText().toString(),etPsw.getText().toString());
        if(login_staus){
            login_success();
        }else{
            login_failed();
        }
    }


    @Override
    public void toast(String msg) {
        MyTools.toast(this,msg);
    }

    @Override
    public void login_success() {
        MyTools.toast(this,"登录成功");
    }

    @Override
    public void login_failed() {
        MyTools.toast(this,"登录失败");
    }
}
