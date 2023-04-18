package com.cookpang.app.post.save.vo;


public class PostSaveVO {

    private String postThumbnail;
    private int postSaveNumber;
    private int postNumber;
    private int userNumber;
    private String postTitle;
    private String postContent;
    private String postDate;
    private int postViewCount;
    private String postRecipeContent;
 
    

    

	@Override
	public String toString() {
		return "PostSaveVO [postThumbnail=" + postThumbnail + ", postSaveNumber=" + postSaveNumber + ", postNumber="
				+ postNumber + ", userNumber=" + userNumber + ", postTitle=" + postTitle + ", postContent="
				+ postContent + ", postDate=" + postDate + ", postViewCount=" + postViewCount + ", postRecipeContent="
				+ postRecipeContent + "]";
	}





	public String getPostThumbnail() {
		return postThumbnail;
	}





	public void setPostThumbnail(String postThumbnail) {
		this.postThumbnail = postThumbnail;
	}





	public int getPostSaveNumber() {
		return postSaveNumber;
	}





	public void setPostSaveNumber(int postSaveNumber) {
		this.postSaveNumber = postSaveNumber;
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





	public String getPostTitle() {
		return postTitle;
	}





	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}





	public String getPostContent() {
		return postContent;
	}





	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}





	public String getPostDate() {
		return postDate;
	}





	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}





	public int getPostViewCount() {
		return postViewCount;
	}





	public void setPostViewCount(int postViewCount) {
		this.postViewCount = postViewCount;
	}





	public String getPostRecipeContent() {
		return postRecipeContent;
	}





	public void setPostRecipeContent(String postRecipeContent) {
		this.postRecipeContent = postRecipeContent;
	}





	public PostSaveVO() {}




	


}