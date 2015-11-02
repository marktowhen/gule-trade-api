package com.jingyunbank.etrade.api.pay.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * 付款业务对象（领域对象）<br>
 * 该类描述了某个订单的支付信息，<br>
 * 包括支付金额，付款人，订单号，交易号，付款状态，付款方式等<br>
 *
 */
public class Payment implements Serializable{

	private static final long serialVersionUID = -3921574891883345912L;
	
	private String ID;
	private String OID;
	private String UID;
	private String transno;
	private double money;
	private String description;
	private boolean success;
	private String paytypeID;
	private String paytypeName;
	private Date addtime;
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
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public String getTransno() {
		return transno;
	}
	public void setTransno(String transno) {
		this.transno = transno;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
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
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	
}
