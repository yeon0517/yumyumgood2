 package com.cookpang.app.order.vo;

import java.util.List;

public class OrderVO {
    private int orderNumber;
    private int userNumber; 
    private String userPhoneNumber;
    private String userEmail;
    private String userAddress;
    private String orderMessage;
    private int orderTotalCost;
    private String orderStatus;
    private String ingredientName;
    private int orderItemQuantity;
    private	int ingredientPrice ;
    private String userName;
    private String userId;
    private String orderDate;

    public OrderVO() {}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getOrderMessage() {
		return orderMessage;
	}

	public void setOrderMessage(String orderMessage) {
		this.orderMessage = orderMessage;
	}

	public int getOrderTotalCost() {
		return orderTotalCost;
	}

	public void setOrderTotalCost(int orderTotalCost) {
		this.orderTotalCost = orderTotalCost;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public int getOrderItemQuantity() {
		return orderItemQuantity;
	}

	public void setOrderItemQuantity(int orderItemQuantity) {
		this.orderItemQuantity = orderItemQuantity;
	}

	public int getIngredientPrice() {
		return ingredientPrice;
	}

	public void setIngredientPrice(int ingredientPrice) {
		this.ingredientPrice = ingredientPrice;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "OrderVO [orderNumber=" + orderNumber + ", userNumber=" + userNumber + ", userPhoneNumber="
				+ userPhoneNumber + ", userEmail=" + userEmail + ", userAddress=" + userAddress + ", orderMessage="
				+ orderMessage + ", orderTotalCost=" + orderTotalCost + ", orderStatus=" + orderStatus
				+ ", ingredientName=" + ingredientName + ", orderItemQuantity=" + orderItemQuantity
				+ ", ingredientPrice=" + ingredientPrice + ", userName=" + userName + ", userId=" + userId
				+ ", orderDate=" + orderDate + "]";
	}

	
    
	


}