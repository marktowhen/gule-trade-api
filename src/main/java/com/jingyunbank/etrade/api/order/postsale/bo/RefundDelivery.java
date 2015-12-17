package com.jingyunbank.etrade.api.order.postsale.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * 退单物流信息，卖家将发送的快递单号填入该
 */
public class RefundDelivery implements Serializable{

	private static final long serialVersionUID = -4594783799882727342L;

	private String ID;
	private String RID;
	private String expressno;
	private Date addtime;
	private String typeID;
	private String typeName;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getRID() {
		return RID;
	}
	public void setRID(String rID) {
		RID = rID;
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
	public String getTypeID() {
		return typeID;
	}
	public void setTypeID(String typeID) {
		this.typeID = typeID;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
}
