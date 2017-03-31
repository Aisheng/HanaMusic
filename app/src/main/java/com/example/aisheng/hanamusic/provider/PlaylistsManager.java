package com.example.aisheng.hanamusic.provider;

import android.content.Context;

/**
 * Created by Administrator on 2017/3/31.
 */
public class PlaylistsManager {


    private static PlaylistsManager sInstance = null;

    //private MusicDB mMusicDatabase = null;
   // private long favPlaylistId = IConstants.FAV_PLAYLIST;

    private PlaylistsManager(final Context context) {
     //   mMusicDatabase = MusicDB.getInstance(context);
    }

    public static final synchronized PlaylistsManager getInstance(final Context context) {
        if (sInstance == null) {
            sInstance = new PlaylistsManager(context.getApplicationContext());
        }
        return sInstance;
    }


    public void delete(final long PlaylistId) {

    }
}
