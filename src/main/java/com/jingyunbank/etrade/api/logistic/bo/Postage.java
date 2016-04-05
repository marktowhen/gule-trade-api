package com.jingyunbank.etrade.api.logistic.bo;

import java.io.Serializable;
import java.math.BigDecimal;


public class Postage implements Serializable{
	
	private static final long serialVersionUID = 1765751272587097762L;
	
	private String ID;
	private String MID;//商家id
	private String title;//标题
	private String expressCode; //快递公司
	private String type;//收费类型 number:按件计费 weight:按重量 volume:体积
	private boolean valid;
	private BigDecimal postage;
	private BigDecimal price;
	private int province;
	
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getMID() {
		return MID;
	}
	public void setMID(String mID) {
		MID = mID;
	}
	public String getExpressCode() {
		return expressCode;
	}
	public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
}
