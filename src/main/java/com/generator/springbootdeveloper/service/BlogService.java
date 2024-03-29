package com.generator.springbootdeveloper.service;

import com.generator.springbootdeveloper.domain.Article2;
import com.generator.springbootdeveloper.dto.AddArticleRequest;
import com.generator.springbootdeveloper.dto.UpdateArticleRequest;
import jakarta.transaction.Transactional;
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

    public Article2 findById(long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    public void delete(long id) {
        blogRepository.deleteById(id);
    }

    @Transactional      // 트랜잭션 매니저
    public Article2 update(long id, UpdateArticleRequest request) {
        Article2 article2 = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));

        article2.update(request.getTitle(), request.getContent());

        return article2;
    }
}






















