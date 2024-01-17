package com.blogapp.payloads;

import lombok.Data;

@Data
public class CategoryDto {

	private int categoryId;
	private String categoryTitle;
	private String categoryDescription;
}
