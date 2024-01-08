package com.generator.springbootdeveloper.repository;

import com.generator.springbootdeveloper.domain.Article2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article2, Long> {

}
