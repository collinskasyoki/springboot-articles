package com.kasyoki.articles.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kasyoki.articles.model.Category;
import com.kasyoki.articles.services.CategoryService;

@RestController
@RequestMapping("categories")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;

	@GetMapping("all")
	public ResponseEntity<List<Category>> getAllCategories() {
		return categoryService.getAllCategories();
	}
}
