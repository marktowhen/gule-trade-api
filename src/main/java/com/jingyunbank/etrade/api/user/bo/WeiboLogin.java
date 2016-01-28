package com.jingyunbank.etrade.api.user.bo;

import java.io.Serializable;
import java.util.Date;

public class WeiboLogin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6461459811930998576L;
	
	private String ID;
	private String weiboUID;
	private String accessToken;
	private String UID;
	private Date loginTime;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getWeiboUID() {
		return weiboUID;
	}
	public void setWeiboUID(String weiboUID) {
		this.weiboUID = weiboUID;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	

}
