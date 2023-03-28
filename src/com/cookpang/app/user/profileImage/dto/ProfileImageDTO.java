package com.cookpang.app.user.profileImage.dto;


public class ProfileImageDTO {
    private String userProfileImageSystemName;
    private String userProfileOriginalName;
    private int userNumber;

    public ProfileImageDTO() {}
    
    public String getUserProfileImageSystemName() {
        return userProfileImageSystemName;
    }

    public void setUserProfileImageSystemName(String userProfileImageSystemName) {
        this.userProfileImageSystemName = userProfileImageSystemName;
    }

    public String getUserProfileOriginalName() {
        return userProfileOriginalName;
    }

    public void setUserProfileOriginalName(String userProfileOriginalName) {
        this.userProfileOriginalName = userProfileOriginalName;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

	@Override
	public String toString() {
		return "ProfileImageDTO [userProfileImageSystemName=" + userProfileImageSystemName
				+ ", userProfileOriginalName=" + userProfileOriginalName + ", userNumber=" + userNumber + "]";
	}

 
    
}
