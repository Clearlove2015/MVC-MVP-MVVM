package com.aron.mvp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aron.mvp.R;
import com.aron.mvp.view.OtherView;

public class OtherActivity extends AppCompatActivity implements OtherView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        //业务相关逻辑   请求文件上传、下载
        //UI相关逻辑    显示图片，显示进度条，弹出提示
    }

    @Override
    public void toast(String msg) {

    }

    @Override
    public void upload_success() {

    }

    @Override
    public void download_success() {

    }

    @Override
    public void show_progress(int progress) {

    }
}
