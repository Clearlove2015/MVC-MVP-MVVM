package com.aron.mvp.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.aron.mvp.R;
import com.aron.mvp.model.User;
import com.aron.mvp.presenter.impl.MainPresenterImpl;
import com.aron.mvp.view.MainBaseView;

/**
 * http://www.cniao5.com/course/lessons/10129
 *
 * MVP模式的核心思想:
 * 把Activity中的UI逻辑抽象成View接口，把业务逻辑抽象成Presenter接口，Model类还是原来的Model类
 */
public class MainActivity extends AppCompatActivity implements MainBaseView,View.OnClickListener{

    private EditText et_name,et_pwd;
    private Button btn_login;

    private MainPresenterImpl mainPresenter;

    public void init(){
        mainPresenter = new MainPresenterImpl();
        mainPresenter.attachView(this);//绑定MainBaseView

        et_name = (EditText) findViewById(R.id.et_name);
        et_pwd = (EditText) findViewById(R.id.et_pwd);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess(String msg) {
        showToast(msg);
    }

    @Override
    public void loginFailed(String msg) {
        showToast(msg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mainPresenter.detachView();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
                User user = new User(et_name.getText().toString(),et_pwd.getText().toString());
                mainPresenter.login(user);
                break;
        }
    }
}
