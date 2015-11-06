package com.jingyunbank.etrade.api.order.bo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 购物车 领域对象类
 */
public class Cart {

	private String ID;
	private String UID;
	private Date addtime;
	private String GID;//商品id
	private int count;
	private BigDecimal price;//加入购物车时的价格
	
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
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
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
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
