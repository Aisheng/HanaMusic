package com.example.aisheng.hanamusic.uitl.Comparator;

import com.example.aisheng.hanamusic.info.ArtistInfo;

import java.util.Comparator;

/**
 * Created by Aisheng on 2017/4/9.
 */

public class ArtistComparator implements Comparator<ArtistInfo> {

    @Override
    public int compare(ArtistInfo a1, ArtistInfo a2) {
        String py1 = a1.artist_sort;
        String py2 = a2.artist_sort;
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