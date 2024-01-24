package com.generator.springbootdeveloper.dto;

import com.generator.springbootdeveloper.domain.Article2;
import lombok.Getter;

@Getter
public class ArticleListViewResponse {

    private final Long id;
    private final String title;
    private final String content;

    public ArticleListViewResponse(Article2 article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}



















