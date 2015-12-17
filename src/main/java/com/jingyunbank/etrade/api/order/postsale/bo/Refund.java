package com.jingyunbank.etrade.api.order.postsale.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 退单领域对象<br>
 * 该类描述了，用户的退单请求信息
 *
 */
public class Refund implements Serializable{

	private static final long serialVersionUID = 6270362729008555666L;
	
	private String ID;
	private String OGID;//订单商品id
	private String OID;//所退商品订单号
	private String MID;//商家
	private String UID;
	private BigDecimal orderMoney;
	private BigDecimal returnMoney;//退款金额申请
	private String reason;//退款退货原因
	private String description;//说明
	private Date addtime;//申请时间
	private String statusCode;
	private String statusName;//RefundStatusDesc
	private boolean returnGoods;//是否退货
	
	
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
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public boolean isReturnGoods() {
		return returnGoods;
	}
	public void setReturnGoods(boolean returnGoods) {
		this.returnGoods = returnGoods;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOGID() {
		return OGID;
	}
	public void setOGID(String oGID) {
		OGID = oGID;
	}
	public String getMID() {
		return MID;
	}
	public void setMID(String mID) {
		MID = mID;
	}
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public BigDecimal getOrderMoney() {
		return orderMoney;
	}
	public void setOrderMoney(BigDecimal orderMoney) {
		this.orderMoney = orderMoney;
	}
	public BigDecimal getReturnMoney() {
		return returnMoney;
	}
	public void setReturnMoney(BigDecimal returnMoney) {
		this.returnMoney = returnMoney;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
}
