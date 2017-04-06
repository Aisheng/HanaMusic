package com.example.aisheng.hanamusic.fragment;

import android.app.Activity;
import android.support.v4.app.DialogFragment;

/**
 * Created by Aisheng on 2017/4/6.
 */

public class AttachDialogFragment extends DialogFragment {

    public Activity mContext;

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        this.mContext = activity;
    }
}
