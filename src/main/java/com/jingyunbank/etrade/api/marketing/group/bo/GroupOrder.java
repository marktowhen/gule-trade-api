package com.jingyunbank.etrade.api.marketing.group.bo;

import java.io.Serializable;

public class GroupOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3590695560755407669L;

	/**
	 * 全额
	 */
	public static final String TYPE_FULL = "FULL";
	private String ID;
	private String groupID;
	private String groupUserID; //group_user表 id
	private String OID;
	private long orderno;
	private String type;//指明是押金、尾款等
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getGroupID() {
		return groupID;
	}
	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}
	public String getGroupUserID() {
		return groupUserID;
	}
	public void setGroupUserID(String groupUserID) {
		this.groupUserID = groupUserID;
	}
	public String getOID() {
		return OID;
	}
	public void setOID(String oID) {
		OID = oID;
	}
	public long getOrderno() {
		return orderno;
	}
	public void setOrderno(long orderno) {
		this.orderno = orderno;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
