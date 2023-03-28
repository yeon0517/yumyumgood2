package com.cookpang.app.post.file.dto;


public class PostFileDTO {
    private String postFileSystemName;
    private String postFileOriginalName;
    private int postNumber;

    public PostFileDTO() {}
    
    public String getPostFileSystemName() {
        return postFileSystemName;
    }

    public void setPostFileSystemName(String postFileSystemName) {
        this.postFileSystemName = postFileSystemName;
    }

    public String getPostFileOriginalName() {
        return postFileOriginalName;
    }

    public void setPostFileOriginalName(String postFileOriginalName) {
        this.postFileOriginalName = postFileOriginalName;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(int postNumber) {
        this.postNumber = postNumber;
    }

	@Override
	public String toString() {
		return "PostFileDTO [postFileSystemName=" + postFileSystemName + ", postFileOriginalName="
				+ postFileOriginalName + ", postNumber=" + postNumber + "]";
	}


}
