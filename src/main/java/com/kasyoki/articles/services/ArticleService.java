package com.kasyoki.articles.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kasyoki.articles.model.Article;
import com.kasyoki.articles.repositories.ArticleRepository;

@Service
public class ArticleService {

	@Autowired
	ArticleRepository articleRepository;
	
	public ResponseEntity<List<Article>> getAllArticles () {
		try {
			return new ResponseEntity<>(articleRepository.findAll(), HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
	}
	
	public ResponseEntity<Optional<Article>> getOneArticle(Integer id){
		Optional<Article> article = articleRepository.findById(id);
		return new ResponseEntity<>(article, HttpStatus.OK);
	}
}
