package com.example.aisheng.hanamusic.uitl.Comparator;

import com.example.aisheng.hanamusic.info.AlbumInfo;

import java.util.Comparator;

/**
 * Created by Aisheng on 2017/4/9.
 */

public class AlbumComparator implements Comparator<AlbumInfo> {

    @Override
    public int compare(AlbumInfo a1, AlbumInfo a2) {
        String py1 = a1.album_sort;
        String py2 = a2.album_sort;
        // 判断是否为空""
        if (isEmpty(py1) && isEmpty(py2))
            return 0;
        if (isEmpty(py1))
            return -1;
        if (isEmpty(py2))
            return 1;
        return py1.compareTo(py2);
    }

    private boolean isEmpty(String str) {
        return "".equals(str.trim());
    }
}
