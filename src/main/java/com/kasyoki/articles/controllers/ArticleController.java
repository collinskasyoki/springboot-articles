package com.kasyoki.articles.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kasyoki.articles.model.Article;
import com.kasyoki.articles.services.ArticleService;

@RestController
@RequestMapping("articles")
public class ArticleController {

	@Autowired
	ArticleService articleService;
	
	@GetMapping("all")
	public ResponseEntity<List<Article>> getAllArticles() {
		return articleService.getAllArticles();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Optional<Article>> getOneArticle(@PathVariable Integer id){
		return articleService.getOneArticle(id);
	}
}
