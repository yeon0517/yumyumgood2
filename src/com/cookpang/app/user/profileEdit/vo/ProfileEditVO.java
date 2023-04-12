package com.cookpang.app.user.profileEdit.vo;

import java.util.List;

import com.cookpang.app.user.profileImage.dto.ProfileImageDTO;

public class ProfileEditVO {
	private int userNumber;
	private String userId;
	private String userPassword;
	private String userNickname;
	private String userName;
	private String userPhoneNumber;
	private String userEmail;
	private String userAddress;
	private String userSelfIntroduction;
	private ProfileImageDTO profileImageDTO;
	private List<ProfileImageDTO> files;

	@Override
	public String toString() {
		return "ProfileEditVO [userNumber=" + userNumber + ", userId=" + userId + ", userPassword=" + userPassword
				+ ", userNickname=" + userNickname + ", userName=" + userName + ", userPhoneNumber=" + userPhoneNumber
				+ ", userEmail=" + userEmail + ", userAddress=" + userAddress + ", userSelfIntroduction="
				+ userSelfIntroduction + ", profileImageDTO=" + profileImageDTO + ", files=" + files + "]";
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

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
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

	public ProfileImageDTO getProfileImageDTO() {
		return profileImageDTO;
	}

	public void setProfileImageDTO(ProfileImageDTO profileImageDTO) {
		this.profileImageDTO = profileImageDTO;
	}

	public List<ProfileImageDTO> getFiles() {
		return files;
	}

	public void setFiles(List<ProfileImageDTO> files) {
		this.files = files;
	}

	public ProfileEditVO() {}
}