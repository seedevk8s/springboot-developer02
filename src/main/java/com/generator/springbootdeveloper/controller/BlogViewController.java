package com.generator.springbootdeveloper.controller;

import com.generator.springbootdeveloper.domain.Article2;
import com.generator.springbootdeveloper.dto.ArticleListViewResponse;
import com.generator.springbootdeveloper.dto.ArticleViewResponse;
import com.generator.springbootdeveloper.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BlogViewController {

    private  final BlogService blogService;

    @GetMapping("/articles")
    public String getArticles(Model model) {
        List<ArticleListViewResponse> articles = blogService.findAll().stream()
                .map(ArticleListViewResponse::new)
                .toList();
        model.addAttribute("articles", articles);       //블로그 글 리스트 저장

        return "articleList";               // articleList.html라는 뷰 조회
    }

    @GetMapping("/articles/{id}")
    public String getArticle(@PathVariable Long id, Model model) {
        Article2 article = blogService.findById(id);
        model.addAttribute("article", new ArticleViewResponse(article));

        return "article";
    }

}









































