package com.jingyunbank.etrade.api.user.bo;

import java.io.Serializable;
import java.util.Date;

public class QQLogin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2836403978880988439L;
	public static final String APP_ID = "101288386";
	public static final String APP_KEY = "6e820c34284b24e6ccf89a82c45d518d";
	public static final String REDIRECT_URL = "http://www.zhonghuaejiao.com/";
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
