package com.jingyunbank.etrade.api.comment.bo;

import java.io.Serializable;

public class CommentsImg implements Serializable{

	private static final long serialVersionUID = -419272920271007319L;
	private String ID;
	private String ImgID;
	private String picture;
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getImgID() {
		return ImgID;
	}
	public void setImgID(String imgID) {
		ImgID = imgID;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
}
