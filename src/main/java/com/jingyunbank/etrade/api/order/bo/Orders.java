package com.jingyunbank.etrade.api.order.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.jingyunbank.etrade.api.pay.bo.OrderPayment;

public class Orders  implements Serializable{

	//订单有效期
	public static final long VALID_TIME_IN_SECOND = 30/**分*/ * 60 /**秒*/ ;
	
	private static final long serialVersionUID = 2563253149671693408L;
	private String ID;
	private long orderno;
	private String receiver;//收货人
	private String addressID;//收货地址->address id
	private String UID;//下单人
	private String MID;
	private String mname;
	private Date addtime;//下单时间
	private String paytypeCode;//支付方式code
	private String paytypeName;
	private String deliveryTypeCode;
	private String deliveryTypeName;
	private BigDecimal price;//订单总价
	private String statusCode;//订单状态code
	private String statusName;
	private BigDecimal postage;
	private String note;
	
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

	public String getAddressID() {
		return addressID;
	}

	public void setAddressID(String addressID) {
		this.addressID = addressID;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
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
	public Date getExpireTime(){
		if(Objects.nonNull(this.addtime)){
			Instant i = this.addtime.toInstant();
			Instant e = i.plusSeconds(VALID_TIME_IN_SECOND);
			return Date.from(e);
		}
		return new Date();
	}
}
