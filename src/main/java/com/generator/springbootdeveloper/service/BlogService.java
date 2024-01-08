package com.generator.springbootdeveloper.service;

import com.generator.springbootdeveloper.domain.Article2;
import com.generator.springbootdeveloper.dto.AddArticleRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.generator.springbootdeveloper.repository.BlogRepository;

import java.util.List;

@RequiredArgsConstructor        // final이 붙거나 @NotNull이 붙은 필드의 생성자 생성 추가
@Service                        // 빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article2 save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    // 저장 되어 있는 글 모두 가져오기
    public List<Article2> findAll() {
        return blogRepository.findAll();
    }
}






















