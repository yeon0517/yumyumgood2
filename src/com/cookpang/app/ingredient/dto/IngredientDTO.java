package com.cookpang.app.ingredient.dto;


public class IngredientDTO {
    private int ingredientNumber;
    private String ingredientName;
    private int ingredientPrice;
    private int ingredientSmallestUnit;
    
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

	@Override
	public String toString() {
		return "IngredientDTO [ingredientNumber=" + ingredientNumber + ", ingredientName=" + ingredientName
				+ ", ingredientPrice=" + ingredientPrice + ", ingredientSmallestUnit=" + ingredientSmallestUnit + "]";
	}
    
   
}
