package com.kasyoki.articles.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Article {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String link;
	private String date_modified;
	private String title;
	private String date_published;
	private String image_file;
	@Column(columnDefinition = "TEXT")
	private String content;

}
