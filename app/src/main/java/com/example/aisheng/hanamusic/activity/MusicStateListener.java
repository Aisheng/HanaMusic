package com.example.aisheng.hanamusic.activity;

/**
 * Created by Administrator on 2017/3/29.
 */
public interface MusicStateListener {

    /**
     * 更新歌曲状态信息
     */
    void updateTrackInfo();

    void updateTime();

    void changeTheme();

    void reloadAdapter();
}
