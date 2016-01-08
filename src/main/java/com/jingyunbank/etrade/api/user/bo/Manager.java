package com.jingyunbank.etrade.api.user.bo;

import java.io.Serializable;


public class Manager implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3746917024574977531L;
	private String ID;
	private String mname;//登录名
	private String password;
	private boolean valid;
	private String remark;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	

}
