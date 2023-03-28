package com.cookpang.app.post.like.dto;


public class PostLikeDTO {
    private int postLikeNumber;
    private int postNumber;
    private int userNumber;

    public PostLikeDTO() {}
    
    public int getPostLikeNumber() {
        return postLikeNumber;
    }

    public void setPostLikeNumber(int postLikeNumber) {
        this.postLikeNumber = postLikeNumber;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(int postNumber) {
        this.postNumber = postNumber;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

	@Override
	public String toString() {
		return "PostLikeDTO [postLikeNumber=" + postLikeNumber + ", postNumber=" + postNumber + ", userNumber="
				+ userNumber + "]";
	}

   
}

