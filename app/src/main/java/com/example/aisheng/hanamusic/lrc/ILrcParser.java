package com.example.aisheng.hanamusic.lrc;

import java.util.List;

/**
 * 歌词解析器
 *
 * Created by Administrator on 2017/4/10.
 */
public interface ILrcParser {

    List<LrcRow> getLrcRows(String str);
}
