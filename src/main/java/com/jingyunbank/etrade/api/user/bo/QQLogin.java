package com.jingyunbank.etrade.api.user.bo;

import java.io.Serializable;
import java.util.Date;

public class QQLogin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2836403978880988439L;
	
	private String ID;
	private String accessToken;
	private String UID;
	private Date loginTime;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
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
