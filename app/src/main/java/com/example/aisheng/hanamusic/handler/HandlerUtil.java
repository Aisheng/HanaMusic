package com.example.aisheng.hanamusic.handler;

import android.content.Context;
import android.os.Handler;

import java.lang.ref.WeakReference;

/**
 * Created by Aisheng on 2017/3/30.
 */

public class HandlerUtil extends Handler {

    private static HandlerUtil instance = null;
    WeakReference<Context> mActivityReference;

    public static HandlerUtil getInstance(Context context) {
        if (instance == null) {
            instance = new HandlerUtil(context.getApplicationContext());
        }
        return instance;
}
    HandlerUtil(Context context) {
        mActivityReference = new WeakReference<>(context);
    }
}
