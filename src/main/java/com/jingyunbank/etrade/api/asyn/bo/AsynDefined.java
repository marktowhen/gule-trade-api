package com.jingyunbank.etrade.api.asyn.bo;

import java.io.Serializable;

public class AsynDefined implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1783526365743376692L;
	private String ID;
	private String serviceName;
	private boolean valid;
	private String remark;
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
