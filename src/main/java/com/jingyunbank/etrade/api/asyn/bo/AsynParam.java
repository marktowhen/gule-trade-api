package com.jingyunbank.etrade.api.asyn.bo;

import java.io.Serializable;

public class AsynParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8356073218091326128L;

	private String ID;
	private String scheduleID;
	private String key;
	private String value;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getScheduleID() {
		return scheduleID;
	}
	public void setScheduleID(String scheduleID) {
		this.scheduleID = scheduleID;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
