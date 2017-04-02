package com.example.aisheng.hanamusic.activity;


import android.os.Bundle;

import com.example.aisheng.hanamusic.R;

/**
 * Created by Administrator on 2017/3/31.
 */
public class TabActivity extends BaseActivity {

    private int page, artistId, albumId;

    @Override
    public void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if (getIntent().getExtras() != null) {
            page = getIntent().getIntExtra("page_number", 0);
            artistId = getIntent().getIntExtra("artist", 0);
            albumId = getIntent().getIntExtra("album", 0);
        }
        setContentView(R.layout.activity_tab);


    }

}
