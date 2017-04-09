package com.example.aisheng.hanamusic.uitl.Comparator;

import com.example.aisheng.hanamusic.info.FolderInfo;

import java.util.Comparator;

/**
 * Created by Aisheng on 2017/4/9.
 */

public class FolderCountComparator implements Comparator<FolderInfo> {

    @Override
    public int compare(FolderInfo a1, FolderInfo a2) {
        Integer py1 = a1.folder_count;
        Integer py2 = a2.folder_count;
        return py2.compareTo(py1);
    }

    private boolean isEmpty(String str) {
        return "".equals(str.trim());
    }
}
