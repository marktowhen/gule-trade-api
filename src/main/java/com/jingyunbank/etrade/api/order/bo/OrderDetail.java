package com.jingyunbank.etrade.api.order.bo;

import java.io.Serializable;

/**
 * 订单详情业务对象<br>
 * 改对象定义订单中包含的商品以及下单时的商品价格等信息
 *
 */
public class OrderDetail implements Serializable{

	private static final long serialVersionUID = -3377063429817839243L;
	
	private String ID;
	private String OID;//订单id
	private String GID;//商品id
	private double price;//订单生成时的商品价格
	private int count;
	private int points;//赠送积分
	private double postage;//邮费
	private String note;
	private String statusID;//状态id，用户支持订单中某个商品的退款
	private double payout;//实际付款
	private double reduce;//优惠减免价格
	
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
	public String getGID() {
		return GID;
	}
	public void setGID(String gID) {
		GID = gID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public double getPostage() {
		return postage;
	}
	public void setPostage(double postage) {
		this.postage = postage;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getStatusID() {
		return statusID;
	}
	public void setStatusID(String statusID) {
		this.statusID = statusID;
	}
	public double getPayout() {
		return payout;
	}
	public void setPayout(double payout) {
		this.payout = payout;
	}
	public double getReduce() {
		return reduce;
	}
	public void setReduce(double reduce) {
		this.reduce = reduce;
	}
	
}
