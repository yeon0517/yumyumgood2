package com.cookpang.app.recipe.category.dto;


public class RecipeCategoryDTO {
	private int postNumber;
	private int categoryNumber;
	
	public RecipeCategoryDTO() {}

	public int getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
	}

	public int getCategoryNumber() {
		return categoryNumber;
	}

	public void setCategoryNumber(int categoryNumber) {
		this.categoryNumber = categoryNumber;
	}

	@Override
	public String toString() {
		return "RecipeCategoryDTO [postNumber=" + postNumber + ", categoryNumber=" + categoryNumber + "]";
	}
	}
