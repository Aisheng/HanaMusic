package com.example.aisheng.hanamusic.service;

import android.app.Service;

/**
 * Created by Administrator on 2017/3/29.
 */
public class MediaService {

    public static final String PLAYSTATE_CHANGED = "com.wm.remusic.playstatechanged";
    public static final String POSITION_CHANGED = "com.wm.remusic.positionchanged";
    public static final String META_CHANGED = "com.wm.remusic.metachanged";
    public static final String PLAYLIST_ITEM_MOVED = "com.wm.remusic.mmoved";
    public static final String QUEUE_CHANGED = "com.wm.remusic.queuechanged";
    public static final String PLAYLIST_CHANGED = "com.wm.remusic.playlistchanged";
    public static final String REPEATMODE_CHANGED = "com.wm.remusic.repeatmodechanged";
    public static final String SHUFFLEMODE_CHANGED = "com.wm.remusic.shufflemodechanged";
    public static final String TRACK_ERROR = "com.wm.remusic.trackerror";
    public static final String TIMBER_PACKAGE_NAME = "com.wm.remusic";
    public static final String MUSIC_PACKAGE_NAME = "com.android.music";
    public static final String SERVICECMD = "com.wm.remusic.musicservicecommand";
    public static final String TOGGLEPAUSE_ACTION = "com.wm.remusic.togglepause";
    public static final String PAUSE_ACTION = "com.wm.remusic.pause";
    public static final String STOP_ACTION = "com.wm.remusic.stop";
    public static final String PREVIOUS_ACTION = "com.wm.remusic.previous";
    public static final String PREVIOUS_FORCE_ACTION = "com.wm.remusic.previous.force";
    public static final String NEXT_ACTION = "com.wm.remusic.next";
    public static final String MUSIC_CHANGED = "com.wm.remusi.change_music";
    public static final String REPEAT_ACTION = "com.wm.remusic.repeat";
    public static final String SHUFFLE_ACTION = "com.wm.remusic.shuffle";
    public static final String FROM_MEDIA_BUTTON = "frommediabutton";
    public static final String REFRESH = "com.wm.remusic.refresh";
    public static final String LRC_UPDATED = "com.wm.remusic.updatelrc";
    public static final String UPDATE_LOCKSCREEN = "com.wm.remusic.updatelockscreen";
    public static final String CMDNAME = "command";
    public static final String CMDTOGGLEPAUSE = "togglepause";
    public static final String CMDSTOP = "stop";
    public static final String CMDPAUSE = "pause";
    public static final String CMDPLAY = "play";
    public static final String CMDPREVIOUS = "previous";
    public static final String CMDNEXT = "next";
    public static final String CMDNOTIF = "buttonId";
    public static final String TRACK_PREPARED = "com.wm.remusic.prepared";
    public static final String TRY_GET_TRACKINFO = "com.wm.remusic.gettrackinfo";
    public static final String BUFFER_UP = "com.wm.remusic.bufferup";
    public static final String LOCK_SCREEN = "com.wm.remusic.lock";
    public static final String SEND_PROGRESS = "com.wm.remusic.progress";
    public static final String MUSIC_LODING = "com.wm.remusic.loading";
    private static final String SHUTDOWN = "com.wm.remusic.shutdown";
    public static final String SETQUEUE = "com.wm.remusic.setqueue";
    public static final int NEXT = 2;
    public static final int LAST = 3;
    public static final int SHUFFLE_NONE = 0;
    public static final int SHUFFLE_NORMAL = 1;
    public static final int SHUFFLE_AUTO = 2;
    public static final int REPEAT_NONE = 2;
    public static final int REPEAT_CURRENT = 1;
    public static final int REPEAT_ALL = 2;
    public static final int MAX_HISTORY_SIZE = 1000;
    private static final String TAG = "MusicPlaybackService";
    private static final boolean D = true;
    private static final int LRC_DOWNLOADED = -10;
    private static final int IDCOLIDX = 0;
    private static final int TRACK_ENDED = 1;
    private static final int TRACK_WENT_TO_NEXT = 2;
    private static final int RELEASE_WAKELOCK = 3;
    private static final int SERVER_DIED = 4;
    private static final int FOCUSCHANGE = 5;
    private static final int FADEDOWN = 6;
    private static final int FADEUP = 7;
    private static final int IDLE_DELAY = 5 * 60 * 1000;
    private static final long REWIND_INSTEAD_PREVIOUS_THRESHOLD = 3000;
}
