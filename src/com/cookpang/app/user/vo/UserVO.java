package com.cookpang.app.user.vo;

import com.cookpang.app.user.profileImage.dto.ProfileImageDTO;

public class UserVO {
	private int userNumber;
	   private String userId;
	   private String userNickName;
	   private int postCount;
	   private String userSelfIntroduction;
	   private ProfileImageDTO profileImage;
	   private int followersCount;   //팔로우하는 사용자 번호
	   private int followingCount; //팔로우 당하는 사용자 번호
	  
	   public UserVO() {
		// TODO Auto-generated constructor stub
	}
	   
	@Override
	public String toString() {
		return "UserVO [userNumber=" + userNumber + ", userId=" + userId + ", userNickName=" + userNickName
				+ ", postCount=" + postCount + ", userSelfIntroduction=" + userSelfIntroduction + ", profileImage="
				+ profileImage + ", followersCount=" + followersCount + ", followingCount=" + followingCount + "]";
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
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public int getPostCount() {
		return postCount;
	}
	public void setPostCount(int postCount) {
		this.postCount = postCount;
	}
	public String getUserSelfIntroduction() {
		return userSelfIntroduction;
	}
	public void setUserSelfIntroduction(String userSelfIntroduction) {
		this.userSelfIntroduction = userSelfIntroduction;
	}
	public ProfileImageDTO getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(ProfileImageDTO profileImage) {
		this.profileImage = profileImage;
	}
	public int getFollowersCount() {
		return followersCount;
	}
	public void setFollowersCount(int followersCount) {
		this.followersCount = followersCount;
	}
	public int getFollowingCount() {
		return followingCount;
	}
	public void setFollowingCount(int followingCount) {
		this.followingCount = followingCount;
	}
	   
}
