package com.example.aisheng.hanamusic.service;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

import com.example.aisheng.hanamusic.MediaAidlInterface;

import java.util.WeakHashMap;


public class MusicPlayer {

    private static final WeakHashMap<Context, ServiceBinder> mConnectionMap;
    private static final long[] sEmptyList;
    public static MediaAidlInterface mService = null;
    private static ContentValues[] mContentValuesCache = null;

    static {
        mConnectionMap = new WeakHashMap<Context, ServiceBinder>();
        sEmptyList = new long[0];
    }

    public static final ServiceToken bindToService(final Context context,
                                                   final ServiceConnection callback) {

        Activity realActivity = ((Activity) context).getParent();
        if (realActivity == null) {
            realActivity = (Activity) context;
        }
        final ContextWrapper contextWrapper = new ContextWrapper(realActivity);
        contextWrapper.startService(new Intent(contextWrapper, MediaService.class));
        final ServiceBinder binder = new ServiceBinder(callback,
                contextWrapper.getApplicationContext());
        if (contextWrapper.bindService(
                new Intent().setClass(contextWrapper, MediaService.class), binder, 0)) {
            mConnectionMap.put(contextWrapper, binder);
            return new ServiceToken(contextWrapper);
        }
        return null;
    }

    public static void unbindFromService(final ServiceToken token) {
        if (token == null) {
            return;
        }
        final ContextWrapper mContextWrapper = token.mWrappedContext;
        final ServiceBinder mBinder = mConnectionMap.remove(mContextWrapper);
        if (mBinder == null) {
            return;
        }
        mContextWrapper.unbindService(mBinder);
        if (mConnectionMap.isEmpty()) {
            mService = null;
        }
    }


    public static void initPlaybackServiceWithSettings(final Context context) {
        setShowAlbumArtOnLockscreen(true);
    }

    public static void setShowAlbumArtOnLockscreen(final boolean enabled) {
        try {
            if (mService != null) {
                mService.setLockscreenAlbumArt(enabled);
            }
        } catch (final RemoteException ignored) {
        }
    }

    public static final class ServiceBinder implements ServiceConnection {
        private final ServiceConnection mCallback;
        private final Context mContext;


        public ServiceBinder(final ServiceConnection callback, final Context context) {
            mCallback = callback;
            mContext = context;
        }

        @Override
        public void onServiceConnected(final ComponentName className, final IBinder service) {
            mService = MediaAidlInterface.Stub.asInterface(service);
            if (mCallback != null) {
                mCallback.onServiceConnected(className, service);
            }
            initPlaybackServiceWithSettings(mContext);
        }

        @Override
        public void onServiceDisconnected(final ComponentName className) {
            if (mCallback != null) {
                mCallback.onServiceDisconnected(className);
            }
            mService = null;
        }
    }

    public static final class ServiceToken {
        public ContextWrapper mWrappedContext;

        public ServiceToken(final ContextWrapper context) {
            mWrappedContext = context;
        }
    }
}
