package com.fc.projectboard.domain;


import com.fc.projectboard.common.dto.MetaData;

public class ArticleComment extends MetaData {
    private Long id;
    private Article article;    // 게시글(id)
    private String content;     // 댓글 내용
}
