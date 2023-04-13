package com.cookpang.app.recipe.category.vo;


public class RecipeCategoryVO {
	private int postNumber;
	private int categoryNumber;
	private String categoryName;
	
	
	public RecipeCategoryVO() {}


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


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	@Override
	public String toString() {
		return "RecipeCategoryVO [postNumber=" + postNumber + ", categoryNumber=" + categoryNumber + ", categoryName="
				+ categoryName + "]";
	}

	
	
	
	
	}
