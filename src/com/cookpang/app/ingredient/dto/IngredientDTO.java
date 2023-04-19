package com.cookpang.app.ingredient.dto;


public class IngredientDTO {
    private int ingredientNumber;
    private String ingredientName;
    private int ingredientPrice;
    private int ingredientSmallestUnit;
    private int ingredientCategoryNumber;
    private String ingredientMoreInfo;
    
    public IngredientDTO() {}

	public int getIngredientNumber() {
		return ingredientNumber;
	}

	public void setIngredientNumber(int ingredientNumber) {
		this.ingredientNumber = ingredientNumber;
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public int getIngredientPrice() {
		return ingredientPrice;
	}

	public void setIngredientPrice(int ingredientPrice) {
		this.ingredientPrice = ingredientPrice;
	}

	public int getIngredientSmallestUnit() {
		return ingredientSmallestUnit;
	}

	public void setIngredientSmallestUnit(int ingredientSmallestUnit) {
		this.ingredientSmallestUnit = ingredientSmallestUnit;
	}

	public int getIngredientCategoryNumber() {
		return ingredientCategoryNumber;
	}

	public void setIngredientCategoryNumber(int ingredientCategoryNumber) {
		this.ingredientCategoryNumber = ingredientCategoryNumber;
	}

	public String getIngredientMoreInfo() {
		return ingredientMoreInfo;
	}

	public void setIngredientMoreInfo(String ingredientMoreInfo) {
		this.ingredientMoreInfo = ingredientMoreInfo;
	}

	@Override
	public String toString() {
		return "IngredientDTO [ingredientNumber=" + ingredientNumber + ", ingredientName=" + ingredientName
				+ ", ingredientPrice=" + ingredientPrice + ", ingredientSmallestUnit=" + ingredientSmallestUnit
				+ ", ingredientCategoryNumber=" + ingredientCategoryNumber + ", ingredientMoreInfo="
				+ ingredientMoreInfo + "]";
	}
    
    
   
}
