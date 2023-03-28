package com.cookpang.app.order.item.dto;


public class OrderItemDTO {
    private int orderItemNumber;
    private int orderNumber;
    private int ingredientNumber;
    private int orderItemQuantity;

    public OrderItemDTO() {
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

	@Override
	public String toString() {
		return "OrderItemDTO [orderItemNumber=" + orderItemNumber + ", orderNumber=" + orderNumber
				+ ", ingredientNumber=" + ingredientNumber + ", orderItemQuantity=" + orderItemQuantity + "]";
	}

  
}
