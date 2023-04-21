package com.cookpang.app.follow.vo;

public class FollowVO {
	private int userNumber;
	private String userNickName;
	private String userName;
	private int followNumber;
	private int followingNumber;
	private String userProfileImageSystemName;
	
	public FollowVO() {
		// TODO Auto-generated constructor stub
	}
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
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
	public int getFollowNumber() {
		return followNumber;
	}
	public void setFollowNumber(int followNumber) {
		this.followNumber = followNumber;
	}
	public int getFollowingNumber() {
		return followingNumber;
	}
	public void setFollowingNumber(int followingNumber) {
		this.followingNumber = followingNumber;
	}
	public String getUserProfileImageSystemName() {
		return userProfileImageSystemName;
	}
	public void setUserProfileImageSystemName(String userProfileImageSystemName) {
		this.userProfileImageSystemName = userProfileImageSystemName;
	}
	@Override
	public String toString() {
		return "FollowVO [userNumber=" + userNumber + ", userNickName=" + userNickName + ", userName=" + userName
				+ ", followNumber=" + followNumber + ", followingNumber=" + followingNumber
				+ ", userProfileImageSystemName=" + userProfileImageSystemName + "]";
	}
}
