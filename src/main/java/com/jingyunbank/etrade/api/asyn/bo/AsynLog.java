package com.jingyunbank.etrade.api.asyn.bo;

import java.io.Serializable;
import java.util.Date;

public class AsynLog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6891405643500364310L;
	private String ID;
	private String scheduleID;
	private String status;
	private Date addtime;
	private String remark;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	
}
