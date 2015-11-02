package com.jingyunbank.etrade.api.order.bo;

import java.util.Date;

/**
 * 追踪订单变更的业务对象<br>
 * 该类描述了订单的整个生命周期的变更史，包括下单，支付，发货，收货，评价，取消等等状态的详细信息
 */
public class OrderTrace {

	private String ID;
	private String OID;//订单id
	private String operator;//操作者（区分买家卖家）
	private String statusID;//
	private String statusName;//
	private Date addtime;//发生时间
	private String note;//
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getOID() {
		return OID;
	}
	public void setOID(String oID) {
		OID = oID;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getStatusID() {
		return statusID;
	}
	public void setStatusID(String statusID) {
		this.statusID = statusID;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
}
