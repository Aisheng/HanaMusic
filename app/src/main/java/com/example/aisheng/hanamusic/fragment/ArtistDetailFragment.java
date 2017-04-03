package com.example.aisheng.hanamusic.fragment;

import android.os.Bundle;

/**
 * Created by Aisheng on 2017/4/3.
 */

public class ArtistDetailFragment extends BaseFragment {

    public static ArtistDetailFragment newInstance(long id) {
        ArtistDetailFragment fragment = new ArtistDetailFragment();
        Bundle args = new Bundle();
        args.putLong("artist_id", id);
        fragment.setArguments(args);
        return fragment;
    }
}
