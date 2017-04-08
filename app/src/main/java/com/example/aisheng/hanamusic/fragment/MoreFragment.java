package com.example.aisheng.hanamusic.fragment;

import android.os.Bundle;

import com.example.aisheng.hanamusic.info.MusicInfo;

/**
 * Created by Aisheng on 2017/4/8.
 */

public class MoreFragment extends AttachDialogFragment {


    public static MoreFragment newInstance(String id, int startFrom, String albumId, String artistId) {
        MoreFragment fragment = new MoreFragment();
        Bundle args = new Bundle();
        args.putString("id", id);
        args.putString("albumid", albumId);
        args.putString("artistid", artistId);
        args.putInt("type", startFrom);
        fragment.setArguments(args);
        return fragment;
    }


    public static MoreFragment newInstance(String id, int startFrom) {
        MoreFragment fragment = new MoreFragment();
        Bundle args = new Bundle();
        args.putString("id", id);
        args.putInt("type", startFrom);
        fragment.setArguments(args);
        return fragment;
    }


    public static MoreFragment newInstance(MusicInfo info, int startFrom) {
        MoreFragment fragment = new MoreFragment();
        Bundle args = new Bundle();
        args.putParcelable("music", info);
        args.putInt("type", startFrom);
        fragment.setArguments(args);
        return fragment;
    }

    public static MoreFragment newInstance(MusicInfo info, long playlistid) {
        MoreFragment fragment = new MoreFragment();
        Bundle args = new Bundle();
        args.putParcelable("music", info);
        args.putLong("playlistid", playlistid);
        fragment.setArguments(args);
        return fragment;
    }
}
