package com.example.aisheng.hanamusic.lastfmapi.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Aisheng on 2017/4/9.
 */

public class ArtistInfo {

    private static final String ARTIST = "artist";

    @SerializedName(ARTIST)
    public LastfmArtist mArtist;

}
