package com.aron.data_binding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aron.data_binding.bean.User;
import com.aron.data_binding.databinding.ActivityMainBinding;

/**
 * http://www.cniao5.com/course/lessons/10129
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //使用DataBinding
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        final User user = new User();
        //user.name = "zhangsan";
        user.name.set("zhangsan");
        binding.setUser(user);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    user.name.set("lisi");
                    user.newName.set("wangwu");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
