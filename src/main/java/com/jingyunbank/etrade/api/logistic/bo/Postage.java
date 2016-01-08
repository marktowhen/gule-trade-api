package com.jingyunbank.etrade.api.logistic.bo;

import java.io.Serializable;
import java.math.BigDecimal;


public class Postage implements Serializable{
	
	private static final long serialVersionUID = 1765751272587097762L;
	private String MID;
	private BigDecimal price;
	private int province;
	private BigDecimal postage;
	
	public String getMID() {
		return MID;
	}
	public void setMID(String mID) {
		MID = mID;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getProvince() {
		return province;
	}
	public void setProvince(int province) {
		this.province = province;
	}
	public BigDecimal getPostage() {
		return postage;
	}
	public void setPostage(BigDecimal postage) {
		this.postage = postage;
	}
}
