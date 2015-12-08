package com.jingyunbank.etrade.api.order.bo;

import java.io.Serializable;



/**
 * 购物车 领域对象类
 */
public class Cart implements Serializable{

	private static final long serialVersionUID = 1628693720175112831L;
	
	private String ID;
	private String UID;

	public Cart() {
		super();
	}
	public Cart(String iD, String uID) {
		super();
		ID = iD;
		UID = uID;
	}
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
}
