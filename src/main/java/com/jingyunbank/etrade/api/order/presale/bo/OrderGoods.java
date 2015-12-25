package com.jingyunbank.etrade.api.order.presale.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单详情业务对象<br>
 * 改对象定义订单中包含的商品以及下单时的商品价格等信息
 *	价格计算公式：payout = (pprice? pprice:price) - couponReduce
 */
public class OrderGoods implements Serializable{

	private static final long serialVersionUID = -3377063429817839243L;
	private String ID;
	private String UID;
	private String OID;//订单id
	private long orderno;
	private String GID;//商品id
	private String gname;
	private BigDecimal pprice;//promotion price//促销价格
	private BigDecimal price;//订单生成时的商品原价格
	private int count;
	private String statusCode;//状态id，用户支持订单中某个商品的退款
	private BigDecimal payout;//实际付款
	private BigDecimal couponReduce;//卡券优惠减免价格
	private Date addtime;
	
	private String MID;
	private String mname;
	private String imgpath;
	
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public long getOrderno() {
		return orderno;
	}
	public void setOrderno(long orderno) {
		this.orderno = orderno;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getPayout() {
		return payout;
	}
	public void setPayout(BigDecimal payout) {
		this.payout = payout;
	}
	public BigDecimal getCouponReduce() {
		return couponReduce;
	}
	public void setCouponReduce(BigDecimal couponReduce) {
		this.couponReduce = couponReduce;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public String getImgpath() {
		return imgpath;
	}
	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public BigDecimal getPprice() {
		return pprice;
	}
	public void setPprice(BigDecimal pprice) {
		this.pprice = pprice;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMID() {
		return MID;
	}
	public void setMID(String mID) {
		MID = mID;
	}
}
