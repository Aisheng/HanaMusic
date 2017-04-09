package com.example.aisheng.hanamusic.uitl.Comparator;

import com.example.aisheng.hanamusic.info.FolderInfo;

import java.util.Comparator;

/**
 * Created by Aisheng on 2017/4/9.
 */

public class FolderComparator implements Comparator<FolderInfo> {

    @Override
    public int compare(FolderInfo a1, FolderInfo a2) {
        String py1 = a1.folder_sort;
        String py2 = a2.folder_sort;
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
