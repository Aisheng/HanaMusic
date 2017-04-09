package com.example.aisheng.hanamusic.fragment;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.aisheng.hanamusic.info.MusicInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aisheng on 2017/4/9.
 */

public class AlbumDetailFragment extends BaseFragment {

//    private int currentlyPlayingPosition = 0;
//    private ActionBar ab;
//    private AlbumDetailAdapter mAdapter;
//    private List<MusicInfo> musicInfos = new ArrayList<>();
//    private long albumID = -1;
//    private RecyclerView recyclerView;
//    private LinearLayoutManager layoutManager;
//    private RecyclerView.ItemDecoration itemDecoration;

    public static AlbumDetailFragment newInstance(long id, boolean useTransition, String transitionName) {
        AlbumDetailFragment fragment = new AlbumDetailFragment();
        Bundle args = new Bundle();
        args.putLong("album_id", id);
        args.putBoolean("transition", useTransition);
        if (useTransition)
            args.putString("transition_name", transitionName);
        fragment.setArguments(args);
        return fragment;
    }
}
