package com.aron.mvvm.viewmodel;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

/**
 * Created by zhucheng on 2017/11/11.
 */

public class MainViewModel {
    private String name;
    private String pwd;

    private Context context;

    public MainViewModel(Context context) {
        this.context = context;
    }

    public TextWatcher userNameChange() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                name = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
    }

    public TextWatcher pwdChange() {
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                pwd = charSequence.toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
    }

    public void login(View v) {
        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(pwd)) {
            if (name.equals("zhangsan") && pwd.equals("123456")) {
                Toast.makeText(context, "登录成功", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "登录失败", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(context, "用户名和密码不能为空", Toast.LENGTH_SHORT).show();
        }
    }

}
