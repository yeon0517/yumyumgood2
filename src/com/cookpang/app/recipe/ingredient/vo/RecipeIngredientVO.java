package com.cookpang.app.recipe.ingredient.vo;

public class RecipeIngredientVO {
	private int postNumber; // 레시피 게시물 고유 번호
	private int ingredientNumber; // 레시피에 사용된 재료 고유 번호
	private String recipeIngredientName; // 레시피 재료 이름
	private String recipeIngredientQuantity; // 레시피 재료 수량
	private String ingredientName;
	private int ingredientSmallestUnit ;
	private int ingredientPrice;
	private String ingredientImageSystemName; 
	
	
	public RecipeIngredientVO() {
	}


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


	public String getRecipeIngredientName() {
		return recipeIngredientName;
	}


	public void setRecipeIngredientName(String recipeIngredientName) {
		this.recipeIngredientName = recipeIngredientName;
	}


	public String getRecipeIngredientQuantity() {
		return recipeIngredientQuantity;
	}


	public void setRecipeIngredientQuantity(String recipeIngredientQuantity) {
		this.recipeIngredientQuantity = recipeIngredientQuantity;
	}


	public String getIngredientName() {
		return ingredientName;
	}


	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}


	public int getIngredientSmallestUnit() {
		return ingredientSmallestUnit;
	}


	public void setIngredientSmallestUnit(int ingredientSmallestUnit) {
		this.ingredientSmallestUnit = ingredientSmallestUnit;
	}


	public int getIngredientPrice() {
		return ingredientPrice;
	}


	public void setIngredientPrice(int ingredientPrice) {
		this.ingredientPrice = ingredientPrice;
	}


	public String getIngredientImageSystemName() {
		return ingredientImageSystemName;
	}


	public void setIngredientImageSystemName(String ingredientImageSystemName) {
		this.ingredientImageSystemName = ingredientImageSystemName;
	}


	@Override
	public String toString() {
		return "RecipeIngredientVO [postNumber=" + postNumber + ", ingredientNumber=" + ingredientNumber
				+ ", recipeIngredientName=" + recipeIngredientName + ", recipeIngredientQuantity="
				+ recipeIngredientQuantity + ", ingredientName=" + ingredientName + ", ingredientSmallestUnit="
				+ ingredientSmallestUnit + ", ingredientPrice=" + ingredientPrice + ", ingredientImageSystemName="
				+ ingredientImageSystemName + "]";
	}


	

	
}