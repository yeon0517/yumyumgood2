package com.cookpang.app.order.vo;


public class OrderVO {
    private int orderNumber;
    private int userNumber;
    private int userPhoneNumber;
    private String userEmail;
    private String userAddress;
    private String orderMessage;
    private int orderTotalCost;
    private String orderStatus;

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

	public int getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(int userPhoneNumber) {
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

	@Override
	public String toString() {
		return "OrderVO [orderNumber=" + orderNumber + ", userNumber=" + userNumber + ", userPhoneNumber="
				+ userPhoneNumber + ", userEmail=" + userEmail + ", userAddress=" + userAddress + ", orderMessage="
				+ orderMessage + ", orderTotalCost=" + orderTotalCost + ", orderStatus=" + orderStatus + "]";
	}

	


}