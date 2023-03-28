package com.cookpang.app.order.dto;


public class OrderDTO {
    private int orderNumber;
    private int userNumber;
    private String orderDate;
    private int orderZipCode;
    private String orderAddress;
    private String orderMessage;
    private int orderTotalCost;
    private String orderStatus;

    public OrderDTO() {}

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

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderZipCode() {
		return orderZipCode;
	}

	public void setOrderZipCode(int orderZipCode) {
		this.orderZipCode = orderZipCode;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
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
		return "OrderDTO [orderNumber=" + orderNumber + ", userNumber=" + userNumber + ", orderDate=" + orderDate
				+ ", orderZipCode=" + orderZipCode + ", orderAddress=" + orderAddress + ", orderMessage=" + orderMessage
				+ ", orderTotalCost=" + orderTotalCost + ", orderStatus=" + orderStatus + "]";
	}


}