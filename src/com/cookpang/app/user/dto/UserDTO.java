package com.cookpang.app.user.dto;

public class UserDTO {
	private int userNumber;
	private String userId;
	private String userPassword;
	private String userNickName;
	private String userName;
	private String userBirth;
	private String userPhoneNumber;
	private String userEmail;
	private String userStatus;
	private String userAddress;
	private String userSelfIntroduction;
	
	public UserDTO() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserDTO [userNumber=" + userNumber + ", userId=" + userId + ", userPassword=" + userPassword
				+ ", userNickName=" + userNickName + ", userName=" + userName + ", userBirth=" + userBirth
				+ ", userPhoneNumber=" + userPhoneNumber + ", userEmail=" + userEmail + ", userStatus=" + userStatus
				+ ", userAddress=" + userAddress + ", userSelfIntroduction=" + userSelfIntroduction + "]";
	}
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
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
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserSelfIntroduction() {
		return userSelfIntroduction;
	}
	public void setUserSelfIntroduction(String userSelfIntroduction) {
		this.userSelfIntroduction = userSelfIntroduction;
	}
}
	