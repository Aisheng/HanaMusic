package com.example.aisheng.hanamusic.uitl;

import android.util.Log;

/**
 * Created by Aisheng on 2017/4/10.
 */

public class L {

    public static void D(boolean print, String tag, String content) {
        if (print)
            Log.d(tag, content);
    }

    public static void E(boolean print, String tag, String content) {
        if (print)
            Log.e(tag, content);
    }
}
