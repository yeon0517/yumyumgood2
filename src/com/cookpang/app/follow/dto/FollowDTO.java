package com.cookpang.app.follow.dto;


public class FollowDTO {
	private int followNumber;
	private int followingNumber;
	
	public FollowDTO() {}

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

	@Override
	public String toString() {
		return "FollowDTO [followNumber=" + followNumber + ", followingNumber=" + followingNumber + "]";
	}
	}
