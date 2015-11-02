package com.jingyunbank.etrade.api.order.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单退款领域对象<br>
 * 该类描述了，用户的订单退款请求信息
 *
 */
public class Refund implements Serializable{

	private static final long serialVersionUID = 6270362729008555666L;
	
	private String ID;
	private String GID;//商品id
	private String OID;//所退商品订单号
	private double money;//退款金额申请
	private String reasonID;
	private String reasonName;
	private Date addtime;//申请时间
	private String statusID;
	private String statusName;//OrderStatusDesc
	private boolean returnGoods;//是否退货
	private String description;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getGID() {
		return GID;
	}
	public void setGID(String gID) {
		GID = gID;
	}
	public String getOID() {
		return OID;
	}
	public void setOID(String oID) {
		OID = oID;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getReasonID() {
		return reasonID;
	}
	public void setReasonID(String reasonID) {
		this.reasonID = reasonID;
	}
	public String getReasonName() {
		return reasonName;
	}
	public void setReasonName(String reasonName) {
		this.reasonName = reasonName;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
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
	
}
