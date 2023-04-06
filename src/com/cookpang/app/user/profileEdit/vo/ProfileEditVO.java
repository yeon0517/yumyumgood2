package com.cookpang.app.user.profileEdit.vo;

import java.util.List;

import com.cookpang.app.user.profileImage.dto.ProfileImageDTO;

public class ProfileEditVO {
	private int userNumber;
	private String userId;
	private String userPassword;
	private String userNickName;
	private String userName;
	private String userPhoneNumber;
	private String userEmail;
	private String userAddress;
	private String userSelfIntroduction;
	private List<ProfileImageDTO> files;

	public ProfileEditVO() {}
	
	@Override
	public String toString() {
		return "ProfileEditVO [userNumber=" + userNumber + ", userId=" + userId + ", userPassword=" + userPassword
				+ ", userNickName=" + userNickName + ", userName=" + userName + ", userPhoneNumber=" + userPhoneNumber
				+ ", userEmail=" + userEmail + ", userAdress=" + userAddress + ", userSelfIntroduction="
				+ userSelfIntroduction + ", files=" + files + "]";
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
	public String getUserAdress() {
		return userAddress;
	}
	public void setUserAdress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserSelfIntroduction() {
		return userSelfIntroduction;
	}
	public void setUserSelfIntroduction(String userSelfIntroduction) {
		this.userSelfIntroduction = userSelfIntroduction;
	}
	public List<ProfileImageDTO> getFiles() {
		return files;
	}
	public void setFiles(List<ProfileImageDTO> files) {
		this.files = files;
	}
	
	
}
