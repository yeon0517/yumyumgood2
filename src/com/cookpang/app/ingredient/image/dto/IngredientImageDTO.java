package com.cookpang.app.ingredient.image.dto;


public class IngredientImageDTO {
    private String ingredientImageSystemName; // 재료 이미지 시스템 파일명
    private String ingredientImageOriginalName; // 재료 이미지 원본 파일명
    private int ingredientNumber; // 재료 고유 번호

    public IngredientImageDTO() {
    }

    public String getIngredientImageSystemName() {
        return ingredientImageSystemName;
    }

    public void setIngredientImageSystemName(String ingredientImageSystemName) {
        this.ingredientImageSystemName = ingredientImageSystemName;
    }

    public String getIngredientImageOriginalName() {
        return ingredientImageOriginalName;
    }

    public void setIngredientImageOriginalName(String ingredientImageOriginalName) {
        this.ingredientImageOriginalName = ingredientImageOriginalName;
    }

    public int getIngredientNumber() {
        return ingredientNumber;
    }

    public void setIngredientNumber(int ingredientNumber) {
        this.ingredientNumber = ingredientNumber;
    }

	@Override
	public String toString() {
		return "IngredientImageDTO [ingredientImageSystemName=" + ingredientImageSystemName
				+ ", ingredientImageOriginalName=" + ingredientImageOriginalName + ", ingredientNumber="
				+ ingredientNumber + "]";
	}

   
}
