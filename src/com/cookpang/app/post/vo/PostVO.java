package com.cookpang.app.post.vo;

import java.util.List;

import com.cookpang.app.post.file.dto.PostFileDTO;

public class PostVO {
	private int postNumber;
    private String postTitle;
    private String postContent;
    private String postDate;
    private int postViewCount;
    private int userNumber;
    private List<PostFileDTO> files; 
    
    public PostVO() {}

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

	public List<PostFileDTO> getFiles() {
		return files;
	}

	public void setFiles(List<PostFileDTO> files) {
		this.files = files;
	}

	@Override
	public String toString() {
		return "PostVo [postNumber=" + postNumber + ", postTitle=" + postTitle + ", postContent=" + postContent
				+ ", postDate=" + postDate + ", postViewCount=" + postViewCount + ", userNumber=" + userNumber
				+ ", files=" + files + "]";
	}
    
    
	
    
    
}
