package com.example.aisheng.hanamusic.activity;


import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;

import com.example.aisheng.hanamusic.R;
import com.example.aisheng.hanamusic.fragment.ArtistDetailFragment;
import com.example.aisheng.hanamusic.fragment.TabPagerFragment;

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
        if (artistId != 0) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            ArtistDetailFragment fragment = ArtistDetailFragment.newInstance(artistId);
            transaction.hide(getSupportFragmentManager().findFragmentById(R.id.tab_container));
            transaction.add(R.id.tab_container, fragment);
            transaction.addToBackStack(null).commit();
        }
        if (albumId != 0) {

        }

        String[] title = {"单曲", "歌手", "专辑", "文件夹"};
        TabPagerFragment fragment = TabPagerFragment.newInstance(page, title);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.tab_container, fragment);
        transaction.commitAllowingStateLoss();
    }
}
