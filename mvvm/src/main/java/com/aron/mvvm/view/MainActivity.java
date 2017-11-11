package com.aron.mvvm.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aron.mvvm.R;
import com.aron.mvvm.databinding.ActivityMainBinding;
import com.aron.mvvm.viewmodel.MainViewModel;

/**
 * http://www.cniao5.com/course/lessons/10129
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        MainViewModel viewModel = new MainViewModel(this);
        binding.setViewModel(viewModel);
    }
}
