package com.cookpang.app.comment.dto;



public class CommentDTO {
    private int commentNumber;
    private String commentContent;
    private int userNumber;
    private int postNumber;
    private String commentTime;
    
    public CommentDTO() {}

	@Override
	public String toString() {
		return "CommentDTO [commentNumber=" + commentNumber + ", commentContent=" + commentContent + ", userNumber="
				+ userNumber + ", postNumber=" + postNumber + ", commentTime=" + commentTime + "]";
	}

	public int getCommentNumber() {
		return commentNumber;
	}

	public void setCommentNumber(int commentNumber) {
		this.commentNumber = commentNumber;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
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

	public String getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}

}