package com.jingyunbank.etrade.api.order.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单物流信息，卖家将发送的快递单号填入该
 *
 */
public class OrderLogistic implements Serializable{
	private static final long serialVersionUID = -1424634030820474079L;
	private String ID;
	private String OID;
	private String expressno;
	private String expressName;
	private Date addtime;
	private String typeCode;
	private String typeName;
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
	public String getExpressno() {
		return expressno;
	}
	public void setExpressno(String expressno) {
		this.expressno = expressno;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public String getExpressName() {
		return expressName;
	}
	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
}
