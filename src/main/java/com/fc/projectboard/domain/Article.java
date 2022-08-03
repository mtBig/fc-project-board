package com.fc.projectboard.domain;

import com.fc.projectboard.common.dto.MetaData;

public class Article extends MetaData {
    private Long id;
    private String title;   // 게시글 제목
    private String content; // 게시글 내용
    private String hashtag; // 해시태그
}
