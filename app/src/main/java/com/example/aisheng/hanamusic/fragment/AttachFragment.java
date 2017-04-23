package com.example.aisheng.hanamusic.fragment;

import android.app.Activity;
import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2017/4/23.
 */
public class AttachFragment  extends Fragment {

    public Activity mContext;

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        this.mContext = activity;
    }


}