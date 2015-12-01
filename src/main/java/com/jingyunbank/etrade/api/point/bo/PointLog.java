package com.jingyunbank.etrade.api.point.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * 积分日志
 */
public class PointLog implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1642346868184863984L;
	private String ID;
	private String UID;
	private int point; //变动数额
	private Date addTime; //变动时间
	private String remark; //变动原因
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
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
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

}
