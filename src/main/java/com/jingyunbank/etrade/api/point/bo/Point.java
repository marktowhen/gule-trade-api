package com.jingyunbank.etrade.api.point.bo;

import java.io.Serializable;

/**
 * 用户积分
 */
public class Point implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2826753449202610157L;
	private String UID;
	private int point; //用户积分
	
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
