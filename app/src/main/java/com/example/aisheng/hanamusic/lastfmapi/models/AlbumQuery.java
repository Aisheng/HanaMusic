package com.example.aisheng.hanamusic.lastfmapi.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Aisheng on 2017/4/9.
 */

public class AlbumQuery {

    private static final String ALBUM_NAME = "album";
    private static final String ARTIST_NAME = "artist";

    @SerializedName(ALBUM_NAME)
    public String mALbum;

    @SerializedName(ARTIST_NAME)
    public String mArtist;

    public AlbumQuery(String album, String artist) {
        this.mALbum = album;
        this.mArtist = artist;
    }
}
