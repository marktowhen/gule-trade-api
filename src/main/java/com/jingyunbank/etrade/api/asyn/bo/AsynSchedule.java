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
	
	public static final String SALES_REGISTER_SERVICE_NAME = "salseRegesterService";

	private String ID;
	private String serviceName;
	private String status;
	private Date addtime;
	private Date updatetime;
	private String remark;
	private String UID; //该任务关联的用户
	
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
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
