package com.cookpang.app.recipe.category.dto;


public class RecipeCategoryDTO {
	private int postNumber;
	private String categoryName;
	
	public RecipeCategoryDTO() {}

	public int getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "RecipeCategoryDTO [postNumber=" + postNumber + ", categoryName=" + categoryName + "]";
	}

		
	
	
	
	}
