package com.aron.mvp.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.aron.mvp.R;
import com.aron.mvp.presenter.impl.OtherPresenterImpl;
import com.aron.mvp.view.OtherBaseView;

public class OtherActivity extends AppCompatActivity implements OtherBaseView,View.OnClickListener{
    private Button btn_upload;

    private OtherPresenterImpl otherPresenter;

    public void init(){
        otherPresenter = new OtherPresenterImpl();
        otherPresenter.attachView(this);//绑定OtherBaseView

        btn_upload = (Button) findViewById(R.id.btn_upload);
        btn_upload.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        init();

        //业务逻辑相关       请求图片上传或下载...
        //UI相关逻辑         显示图片  显示进度条   弹Toast...
    }

    @Override
    public void showToast(String msg) {

    }

    @Override
    public void showProgress(int progress) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_upload:
                otherPresenter.uploadImage("...");
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        otherPresenter.detachView();
    }
}
