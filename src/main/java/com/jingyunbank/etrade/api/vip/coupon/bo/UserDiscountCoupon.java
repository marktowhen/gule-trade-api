package com.jingyunbank.etrade.api.vip.coupon.bo;

import java.io.Serializable;
import java.util.Date;

public class UserDiscountCoupon implements Serializable{
	
	private static final long serialVersionUID = 8884727410953571713L;
	private String ID;
	private String UID;
	private String couponID;
	private Date consumeTime;//消费使用时间
	private boolean consumed;
	private Date addTime;//激活时间
	private DiscountCoupon discountCoupon;
	private boolean locked;//是否被锁定
	
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	public DiscountCoupon getDiscountCoupon() {
		return discountCoupon;
	}
	public void setDiscountCoupon(DiscountCoupon discountCoupon) {
		this.discountCoupon = discountCoupon;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
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
