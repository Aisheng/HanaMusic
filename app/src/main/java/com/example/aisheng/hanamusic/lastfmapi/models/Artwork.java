package com.example.aisheng.hanamusic.lastfmapi.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Aisheng on 2017/4/9.
 */

public class Artwork {

    private static final String URL = "#text";
    private static final String SIZE = "size";

    @SerializedName(URL)
    public String mUrl;

    @SerializedName(SIZE)
    public String mSize;
}
