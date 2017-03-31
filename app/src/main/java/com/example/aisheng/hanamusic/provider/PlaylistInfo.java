package com.example.aisheng.hanamusic.provider;

import android.content.Context;
import android.database.Cursor;

import com.example.aisheng.hanamusic.info.Playlist;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/31.
 */
public class PlaylistInfo {

    private static PlaylistInfo sInstance = null;

   // private MusicDB mMusicDatabase = null;

    private PlaylistInfo(final Context context) {
       // mMusicDatabase = MusicDB.getInstance(context);
    }

    public static final synchronized PlaylistInfo getInstance(final Context context) {
        if (sInstance == null) {
            sInstance = new PlaylistInfo(context.getApplicationContext());
        }

        return sInstance;
    }

    public void deletePlaylist(final long PlaylistId) {

    }

    public synchronized ArrayList<Playlist> getPlaylist() {

        return null;
    }

    public synchronized ArrayList<Playlist> getNetPlaylist() {
        return null;
    }

}
