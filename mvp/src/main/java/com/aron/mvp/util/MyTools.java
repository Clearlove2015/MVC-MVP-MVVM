package com.aron.mvp.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zhucheng on 2017/11/9.
 */

public class MyTools {

    public static void toast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}
