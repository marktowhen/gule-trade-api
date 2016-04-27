package com.jingyunbank.etrade.api.flow.bo;

import java.io.Serializable;

/**
 * 流程状态
 * 
 * flowType currentStatus flag唯一确定一条记录
 */
public class FlowStatus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -542412530246268709L;
	
	private String ID;
	private String flowType;
	private String currentStatus;
	private String nextStatus;
	private String flag;
	private String remark;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getFlowType() {
		return flowType;
	}
	public void setFlowType(String flowType) {
		this.flowType = flowType;
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	public String getNextStatus() {
		return nextStatus;
	}
	public void setNextStatus(String nextStatus) {
		this.nextStatus = nextStatus;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

}
