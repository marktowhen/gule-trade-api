package com.jingyunbank.etrade.api.order.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.jingyunbank.etrade.api.product.bo.Goods;

public class Orders  implements Serializable{

	private static final long serialVersionUID = 2563253149671693408L;
	private String ID;
	private String orderno;
	private String receiver;//收货人
	private String addressID;//收货地址->address id
	private String UID;//下单人
	private Date addtime;//下单时间
	private String paytypeID;//支付方式 id
	private String paytypeName;
	private BigDecimal price;//订单总价
	private String statusID;//订单状态id
	private String statusName;
	private BigDecimal postage;
	
	private List<Goods> goods = new LinkedList<Goods>();

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

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
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

	public String getPaytypeID() {
		return paytypeID;
	}

	public void setPaytypeID(String paytypeID) {
		this.paytypeID = paytypeID;
	}

	public String getPaytypeName() {
		return paytypeName;
	}

	public void setPaytypeName(String paytypeName) {
		this.paytypeName = paytypeName;
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

	public List<Goods> getGoods() {
		return goods;
	}

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
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
	
}
