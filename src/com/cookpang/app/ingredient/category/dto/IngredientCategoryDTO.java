package com.cookpang.app.ingredient.category.dto;


public class IngredientCategoryDTO {
  int IngredientCategoryNumber;
  String IngredientCategoryName;
  
  public IngredientCategoryDTO() {}
  
public int getIngredientCategoryNumber() {
	return IngredientCategoryNumber;
}

public void setIngredientCategoryNumber(int ingredientCategoryNumber) {
	IngredientCategoryNumber = ingredientCategoryNumber;
}

public String getIngredientCategoryName() {
	return IngredientCategoryName;
}

public void setIngredientCategoryName(String ingredientCategoryName) {
	IngredientCategoryName = ingredientCategoryName;
}

public String toString() {
	return "IngredientCategoryDTO [IngredientCategoryNumber=" + IngredientCategoryNumber + ", IngredientCategoryName="
			+ IngredientCategoryName + "]";
}


}