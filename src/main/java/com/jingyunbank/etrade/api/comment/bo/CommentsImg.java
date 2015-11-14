package com.jingyunbank.etrade.api.comment.bo;

import java.io.Serializable;

public class CommentsImg implements Serializable{

	private static final long serialVersionUID = -419272920271007319L;
	private String id;
	private String imgid;
	private String picture;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImgid() {
		return imgid;
	}
	public void setImgid(String imgid) {
		this.imgid = imgid;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
}
