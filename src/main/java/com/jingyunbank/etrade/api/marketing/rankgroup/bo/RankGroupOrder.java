package com.jingyunbank.etrade.api.marketing.rankgroup.bo;

public class RankGroupOrder {

	/**
	 * 订金
	 */
	public static final String TYPE_DEPOSIT = "DEPOSIT";
	/**
	 * 尾款
	 */
	public static final String TYPE_FINAL_PAYMENT = "TYPE_FINAL_PAYMENT";
	private String ID;
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
	private String groupID;  //所属团购团id
	private String groupUserID; //group_user表 id
	private String OID;  //订单id
	private long orderno;   //订单号
	private String type;//指明是押金、尾款等
}
