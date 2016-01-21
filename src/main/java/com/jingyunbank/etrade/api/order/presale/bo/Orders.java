package com.jingyunbank.etrade.api.order.presale.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jingyunbank.etrade.api.pay.bo.OrderPayment;

public class Orders  implements Serializable{

	//订单有效期
	public static final long VALID_TIME_IN_SECOND = 30/**分*/ * 60 /**秒*/ ;
	
	private static final long serialVersionUID = 2563253149671693408L;
	private String ID;
	private long orderno;
	private int province;
	private String receiver;//收货人
	private String address;//收货地址
	private String mobile ;//收货人电话
	private String zipcode;
	private String UID;//下单人
	private String uname;
	private String MID;
	private String mname;
	private Date addtime;//下单时间
	private String paytypeCode;//支付方式code
	private String paytypeName;
	private String deliveryTypeCode;
	private String deliveryTypeName;
	private String invoiceType;//发票类型（个人，企业）
	private String invoiceTitle;
	private String couponID;//优惠卡券Id
	private String couponType;//优惠卡券类型 （DISCOUNTCOUPON, CACHCOUPON）
	private BigDecimal couponReduce;
	private BigDecimal price;//订单使用卡券前的总价（包含邮费）
	private BigDecimal payout;//优惠后的总价(实际支付，去掉卡券优惠)
	private String statusCode;//订单状态code
	private String statusName;
	private BigDecimal postage;//订单计算出的邮费（主要用于数据校验）
	private String note;
	private boolean employee;
	
	private List<OrderGoods> goods = new ArrayList<OrderGoods>();
	private List<OrderTrace> traces = new ArrayList<OrderTrace>();
	private OrderPayment payment = new OrderPayment();
	
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

	public long getOrderno() {
		return orderno;
	}

	public void setOrderno(long orderno) {
		this.orderno = orderno;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public String getPaytypeCode() {
		return paytypeCode;
	}

	public void setPaytypeCode(String paytypeCode) {
		this.paytypeCode = paytypeCode;
	}

	public String getPaytypeName() {
		return paytypeName;
	}

	public void setPaytypeName(String paytypeName) {
		this.paytypeName = paytypeName;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String code) {
		this.statusCode = code;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public BigDecimal getPostage() {
		return postage;
	}

	public void setPostage(BigDecimal postage) {
		this.postage = postage;
	}

	public String getMID() {
		return MID;
	}

	public void setMID(String mID) {
		MID = mID;
	}

	public String getDeliveryTypeCode() {
		return deliveryTypeCode;
	}

	public void setDeliveryTypeCode(String deliveryTypeCode) {
		this.deliveryTypeCode = deliveryTypeCode;
	}

	public String getDeliveryTypeName() {
		return deliveryTypeName;
	}

	public void setDeliveryTypeName(String deliveryTypeName) {
		this.deliveryTypeName = deliveryTypeName;
	}

	public List<OrderGoods> getGoods() {
		return goods;
	}

	public void setGoods(List<OrderGoods> goods) {
		this.goods = goods;
	}

	public List<OrderTrace> getTraces() {
		return traces;
	}

	public void setTraces(List<OrderTrace> traces) {
		this.traces = traces;
	}

	public OrderPayment getPayment() {
		return payment;
	}

	public void setPayment(OrderPayment payment) {
		this.payment = payment;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
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
	public String getCouponID() {
		return couponID;
	}

	public void setCouponID(String couponID) {
		this.couponID = couponID;
	}

	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getInvoiceTitle() {
		return invoiceTitle;
	}

	public void setInvoiceTitle(String invoiceTitle) {
		this.invoiceTitle = invoiceTitle;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}

	public BigDecimal getCouponReduce() {
		return couponReduce;
	}

	public void setCouponReduce(BigDecimal couponReduce) {
		this.couponReduce = couponReduce;
	}

	public int getProvince() {
		return province;
	}

	public void setProvince(int province) {
		this.province = province;
	}

	public boolean isEmployee() {
		return employee;
	}

	public void setEmployee(boolean employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Orders [ID=" + ID + ", orderno=" + orderno + ", province="
				+ province + ", receiver=" + receiver + ", address=" + address
				+ ", mobile=" + mobile + ", zipcode=" + zipcode + ", UID="
				+ UID + ", uname=" + uname + ", MID=" + MID + ", mname="
				+ mname + ", addtime=" + addtime + ", paytypeCode="
				+ paytypeCode + ", paytypeName=" + paytypeName
				+ ", deliveryTypeCode=" + deliveryTypeCode
				+ ", deliveryTypeName=" + deliveryTypeName + ", invoiceType="
				+ invoiceType + ", invoiceTitle=" + invoiceTitle
				+ ", couponID=" + couponID + ", couponType=" + couponType
				+ ", couponReduce=" + couponReduce + ", price=" + price
				+ ", payout=" + payout + ", statusCode=" + statusCode
				+ ", statusName=" + statusName + ", postage=" + postage
				+ ", note=" + note + ", goods=" + goods + ", traces=" + traces
				+ ", payment=" + payment + "]";
	}
}
