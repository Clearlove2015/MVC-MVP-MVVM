package com.aron.data_binding.bean;

import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by zhucheng on 2017/11/11.
 */

/**
 * DataBinding
 * 该工具可以将View和一个对象的field绑定，当field更新的时候，framework将收到通知，然后View自动更新
 */
public class User {
    //public String name;

    public ObservableField<String> name = new ObservableField<>();

    public ObservableField<String> newName = new ObservableField<>();

    public void onClickName(View v){
        Log.e("User",name.get());
    }

    @BindingAdapter({"zcName"})
    public static void setNewName(TextView tv,ObservableField<String> oName){
        tv.setText(oName.get());
    }


}
