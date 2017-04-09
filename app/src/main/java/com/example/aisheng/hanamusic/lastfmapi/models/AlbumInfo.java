package com.example.aisheng.hanamusic.lastfmapi.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Aisheng on 2017/4/9.
 */

public class AlbumInfo {

    private static final String ALBUM = "album";


    @SerializedName(ALBUM)
    public LastfmAlbum mAlbum;
}
