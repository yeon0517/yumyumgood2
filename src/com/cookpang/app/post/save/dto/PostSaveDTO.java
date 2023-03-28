package com.cookpang.app.post.save.dto;


public class PostSaveDTO {
    private int postSaveNumber;
    private int userNumber;
    private int postNumber;
    
    public PostSaveDTO() {
    }
    
    public int getPostSaveNumber() {
        return postSaveNumber;
    }
    
    public void setPostSaveNumber(int postSaveNumber) {
        this.postSaveNumber = postSaveNumber;
    }
    
    public int getUserNumber() {
        return userNumber;
    }
    
    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }
    
    public int getPostNumber() {
        return postNumber;
    }
    
    public void setPostNumber(int postNumber) {
        this.postNumber = postNumber;
    }

	@Override
	public String toString() {
		return "PostSaveDTO [postSaveNumber=" + postSaveNumber + ", userNumber=" + userNumber + ", postNumber="
				+ postNumber + "]";
	}
    
    
}
