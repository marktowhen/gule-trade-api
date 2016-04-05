package com.jingyunbank.etrade.api.asyn.bo;

import java.io.Serializable;
import java.util.Date;

public class AsynSchedule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7963338444054722458L;
	
	public static final String INIT = "INIT";
	public static final String PROCESSING = "PROCESSING";
	public static final String SUCCESS = "SUCCESS";
	public static final String ERROR = "ERROR";

	private String ID;
	private String definedID;
	private String status;
	private Date addtime;
	private Date updatetime;
	private String remark;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getDefinedID() {
		return definedID;
	}
	public void setDefinedID(String definedID) {
		this.definedID = definedID;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
}
