package com.cookpang.app.category.dto;


public class CategoryDTO {
	int categoryNumber;
	String categoryName;
	
	public CategoryDTO() {}

	@Override
	public String toString() {
		return "CategoryDTO [categoryNumber=" + categoryNumber + ", categoryName=" + categoryName + "]";
	}

	public int getCategoryNumber() {
		return categoryNumber;
	}

	public void setCategoryNumber(int categoryNumber) {
		this.categoryNumber = categoryNumber;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	}
