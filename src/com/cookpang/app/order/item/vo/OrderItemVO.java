package com.cookpang.app.order.item.vo;


public class OrderItemVO {
    private int orderItemNumber;
    private int orderNumber;
    private int ingredientNumber;
    private int orderItemQuantity;
    private String ingredientName;
    private int ingredientSmallestUnit;
    private int ingredientPrice;

    public OrderItemVO() {
    }

	public int getOrderItemNumber() {
		return orderItemNumber;
	}

	public void setOrderItemNumber(int orderItemNumber) {
		this.orderItemNumber = orderItemNumber;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getIngredientNumber() {
		return ingredientNumber;
	}

	public void setIngredientNumber(int ingredientNumber) {
		this.ingredientNumber = ingredientNumber;
	}

	public int getOrderItemQuantity() {
		return orderItemQuantity;
	}

	public void setOrderItemQuantity(int orderItemQuantity) {
		this.orderItemQuantity = orderItemQuantity;
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

	@Override
	public String toString() {
		return "OrderItemVO [orderItemNumber=" + orderItemNumber + ", orderNumber=" + orderNumber
				+ ", ingredientNumber=" + ingredientNumber + ", orderItemQuantity=" + orderItemQuantity
				+ ", ingredientName=" + ingredientName + ", ingredientSmallestUnit=" + ingredientSmallestUnit
				+ ", ingredientPrice=" + ingredientPrice + "]";
	}

    
}
