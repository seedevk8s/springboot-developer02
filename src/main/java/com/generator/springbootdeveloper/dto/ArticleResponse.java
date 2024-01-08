package com.generator.springbootdeveloper.dto;

import com.generator.springbootdeveloper.domain.Article2;
import lombok.Getter;

@Getter
public class ArticleResponse {

    private final String title;
    private final String content;

    public ArticleResponse(Article2 article2) {
        this.title = article2.getTitle();
        this.content = article2.getContent();
    }

}













































