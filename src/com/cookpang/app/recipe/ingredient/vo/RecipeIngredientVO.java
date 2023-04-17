package com.cookpang.app.recipe.ingredient.vo;


public class RecipeIngredientVO {
    private int postNumber; // 레시피 게시물 고유 번호
    private int ingredientNumber; // 레시피에 사용된 재료 고유 번호
    private String IngredientName; // 레시피 재료 이름
    private String recipeIngredientQuantity; // 레시피 재료 수량
    private int ingredientPrice; // 재료가격
    private int ingredientSmallestUnit; // 재료 최소 단위
    private int ingredientCategoryNumber; // 재료 카테고리 번호
    
    
    

    public RecipeIngredientVO() {}




	public int getPostNumber() {
		return postNumber;
	}




	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
	}




	public int getIngredientNumber() {
		return ingredientNumber;
	}




	public void setIngredientNumber(int ingredientNumber) {
		this.ingredientNumber = ingredientNumber;
	}




	public String getIngredientName() {
		return IngredientName;
	}




	public void setIngredientName(String ingredientName) {
		IngredientName = ingredientName;
	}




	public String getRecipeIngredientQuantity() {
		return recipeIngredientQuantity;
	}




	public void setRecipeIngredientQuantity(String recipeIngredientQuantity) {
		this.recipeIngredientQuantity = recipeIngredientQuantity;
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




	@Override
	public String toString() {
		return "RecipeIngredientVO [postNumber=" + postNumber + ", ingredientNumber=" + ingredientNumber
				+ ", IngredientName=" + IngredientName + ", recipeIngredientQuantity=" + recipeIngredientQuantity
				+ ", ingredientPrice=" + ingredientPrice + ", ingredientSmallestUnit=" + ingredientSmallestUnit
				+ ", ingredientCategoryNumber=" + ingredientCategoryNumber + "]";
	}

	


}