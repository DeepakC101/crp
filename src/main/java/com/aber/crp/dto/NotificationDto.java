package com.aber.crp.dto;

public class NotificationDto  extends BaseEntityDto {
	
	private Long id;
	private String userName;
	private Long postId;
	private String msg;
	
	public Long getId() {
		return id;
	}
	public void setid(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setuserName(Long userName) {
		this.id = userName;
	}	
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	

}
