package com.example.aisheng.hanamusic.lastfmapi.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Aisheng on 2017/4/9.
 */

public class ArtistQuery {

    private static final String ARTIST_NAME = "artist";

    @SerializedName(ARTIST_NAME)
    public String mArtist;

    public ArtistQuery(String artist) {
        this.mArtist = artist;
    }
}
