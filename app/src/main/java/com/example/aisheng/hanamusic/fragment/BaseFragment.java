package com.example.aisheng.hanamusic.fragment;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.aisheng.hanamusic.activity.BaseActivity;
import com.example.aisheng.hanamusic.activity.MusicStateListener;

/**
 * Created by Aisheng on 2017/3/30.
 */

public class BaseFragment extends Fragment implements MusicStateListener {

    public Activity mContext;

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        this.mContext = activity;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onResume() {
        super.onResume();
        ((BaseActivity) getActivity()).setMusicStateListenerListener(this);
        reloadAdapter();
    }

    @Override
    public void onStop() {
        super.onStop();
        ((BaseActivity) getActivity()).removeMusicStateListenerListener(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }

    @Override
    public void updateTrackInfo() {

    }

    @Override
    public void updateTime() {

    }

    @Override
    public void changeTheme() {

    }

    @Override
    public void reloadAdapter() {

    }
}
