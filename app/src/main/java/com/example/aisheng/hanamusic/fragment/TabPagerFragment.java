package com.example.aisheng.hanamusic.fragment;

import android.os.Bundle;

/**
 * Created by Aisheng on 2017/4/3.
 */

public class TabPagerFragment extends BaseFragment {

    public static final TabPagerFragment newInstance(int page, String[] title) {
        TabPagerFragment f = new TabPagerFragment();
        Bundle bdl = new Bundle(1);
        bdl.putInt("page_number", page);
        bdl.putStringArray("title", title);
        f.setArguments(bdl);
        return f;
    }
}
