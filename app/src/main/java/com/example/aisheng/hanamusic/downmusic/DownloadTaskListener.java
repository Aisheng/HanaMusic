package com.example.aisheng.hanamusic.downmusic;

/**
 * Created by Aisheng on 2017/4/10.
 */

public interface DownloadTaskListener {

    void onPrepare(DownloadTask downloadTask);

    void onStart(DownloadTask downloadTask);

    void onDownloading(DownloadTask downloadTask);

    void onPause(DownloadTask downloadTask);

    void onCancel(DownloadTask downloadTask);

    void onCompleted(DownloadTask downloadTask);

    void onError(DownloadTask downloadTask, int errorCode);

    int DOWNLOAD_ERROR_FILE_NOT_FOUND = -1;
    int DOWNLOAD_ERROR_IO_ERROR = -2;
}
