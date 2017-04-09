package com.example.aisheng.hanamusic.fragment;

import android.os.Bundle;

/**
 * Created by Aisheng on 2017/4/9.
 */

public class FolderDetailFragment extends BaseFragment {


    public static FolderDetailFragment newInstance(String id, boolean useTransition, String transitionName) {
        FolderDetailFragment fragment = new FolderDetailFragment();
        Bundle args = new Bundle();
        args.putString("folder_path", id);
        args.putBoolean("transition", useTransition);
        if (useTransition)
            args.putString("transition_name", transitionName);
        fragment.setArguments(args);
        return fragment;
    }

}
