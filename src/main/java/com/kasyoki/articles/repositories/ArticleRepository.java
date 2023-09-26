package com.kasyoki.articles.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kasyoki.articles.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
