package com.example.aisheng.hanamusic.uitl;


import android.os.Build;

/**
 * Created by Administrator on 2017/3/31.
 */
public class CommonUtils {


    public static boolean isLollipop() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }

}
