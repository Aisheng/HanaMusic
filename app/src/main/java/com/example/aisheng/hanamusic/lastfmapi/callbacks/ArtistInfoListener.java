package com.example.aisheng.hanamusic.lastfmapi.callbacks;

import com.example.aisheng.hanamusic.lastfmapi.models.LastfmArtist;

/**
 * Created by Aisheng on 2017/4/9.
 */

public interface ArtistInfoListener {

    void artistInfoSucess(LastfmArtist artist);

    void artistInfoFailed();
}
