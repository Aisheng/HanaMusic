package com.example.aisheng.hanamusic;

import android.app.Application;
import android.util.Log;

/**
 * Created by Aisheng on 2017/3/29.
 */

public class MainApplication  extends Application {

    private static final String TAG = "MainApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                Log.e(TAG,"------------------------UnCatchException From MainApplication");
                e.printStackTrace();
            }
        });
    }
}
