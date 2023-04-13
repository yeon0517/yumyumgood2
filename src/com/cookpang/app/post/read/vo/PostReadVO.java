package com.cookpang.app.post.read.vo;

import java.util.List;

import com.cookpang.app.post.file.dto.PostFileDTO;


public class PostReadVO {
	private int postNumber;
    private String postTitle;
    private String postContent;
    private String postDate;
    private int postViewCount;
    private int userNumber;
    private String userNickName;
    private List<PostFileDTO> files; 
    private int categoryNumber;
    private String userId;
    private String postThumbnail;
    private String postRecipeContent;
    private String userProfileImageSystemName;
    private int postLikeCount;
	
	public PostReadVO(){}

	public int getPostNumber() {
		return postNumber;
	}

	public void setPostNumber(int postNumber) {
		this.postNumber = postNumber;
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

	public List<PostFileDTO> getFiles() {
		return files;
	}

	public void setFiles(List<PostFileDTO> files) {
		this.files = files;
	}

	public int getCategoryNumber() {
		return categoryNumber;
	}

	public void setCategoryNumber(int categoryNumber) {
		this.categoryNumber = categoryNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPostThumbnail() {
		return postThumbnail;
	}

	public void setPostThumbnail(String postThumbnail) {
		this.postThumbnail = postThumbnail;
	}

	public String getPostRecipeContent() {
		return postRecipeContent;
	}

	public void setPostRecipeContent(String postRecipeContent) {
		this.postRecipeContent = postRecipeContent;
	}

	public String getUserProfileImageSystemName() {
		return userProfileImageSystemName;
	}

	public void setUserProfileImageSystemName(String userProfileImageSystemName) {
		this.userProfileImageSystemName = userProfileImageSystemName;
	}

	public int getPostLikeCount() {
		return postLikeCount;
	}

	public void setPostLikeCount(int postLikeCount) {
		this.postLikeCount = postLikeCount;
	}

	@Override
	public String toString() {
		return "PostReadVO [postNumber=" + postNumber + ", postTitle=" + postTitle + ", postContent=" + postContent
				+ ", postDate=" + postDate + ", postViewCount=" + postViewCount + ", userNumber=" + userNumber
				+ ", userNickName=" + userNickName + ", files=" + files + ", categoryNumber=" + categoryNumber
				+ ", userId=" + userId + ", postThumbnail=" + postThumbnail + ", postRecipeContent=" + postRecipeContent
				+ ", userProfileImageSystemName=" + userProfileImageSystemName + ", postLikeCount=" + postLikeCount
				+ "]";
	}

	
	
}
