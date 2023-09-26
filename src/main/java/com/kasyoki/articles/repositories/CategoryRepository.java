package com.kasyoki.articles.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kasyoki.articles.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

//	@Query("SELECT NEW com.kasyoki.articles.model.Category FROM Category c")
//	List<Category> findAddCategoriesSummary();
}
