package com.jingyunbank.etrade.api.vip.bo;

import java.io.Serializable;
import java.util.Date;

public class UserCashCoupon implements Serializable{

	private static final long serialVersionUID = 5233263454845130634L;
	private String ID;
	private String UID;
	private String couponID;
	private Date consumeTime;//消费使用时间
	private boolean consumed;
	private CashCoupon cashCoupon;
	private Date addTime;//激活时间
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public CashCoupon getCashCoupon() {
		return cashCoupon;
	}
	public void setCashCoupon(CashCoupon cashCoupon) {
		this.cashCoupon = cashCoupon;
	}
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
	public String getCouponID() {
		return couponID;
	}
	public void setCouponID(String couponID) {
		this.couponID = couponID;
	}
	public Date getConsumeTime() {
		return consumeTime;
	}
	public void setConsumeTime(Date consumeTime) {
		this.consumeTime = consumeTime;
	}
	public boolean isConsumed() {
		return consumed;
	}
	public void setConsumed(boolean consumed) {
		this.consumed = consumed;
	}
	
}
