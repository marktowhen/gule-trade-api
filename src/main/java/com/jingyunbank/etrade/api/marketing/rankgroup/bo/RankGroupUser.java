package com.jingyunbank.etrade.api.marketing.rankgroup.bo;

import java.math.BigDecimal;
import java.util.Date;

import com.jingyunbank.etrade.api.user.bo.Users;

public class RankGroupUser {

	
	public static final String FLOW_TYPE = "GROUP_USER_FLOW";
	/**
	 * 新建团购
	 */
	public static final String STATUS_NEW = "NEW";
	/**
	 * 支付成功
	 */
	public static final String STATUS_PAID = "PAID";
	/**
	 * 订金支付成功
	 */
	public static final String STATUS_PAID_DEPOSIT = "DEPOSIT";
	/**
	 * 尾款支付成功
	 */
	public static final String STATUS_PAID_FINAL_PAYMENT = "FINALPAYMENT";
	/**
	 * 支付失败
	 */
	public static final String STATUS_PAYFAIL = "PAYFAIL";
	/**
	 * 退款
	 */
	public static final String STATUS_REFUNED = "REFUNED";
	
	/**
	 * 团购关闭 未创建成功
	 */
	public static final String STATUS_CLOSED = "CLOSED";
	
	private String ID;
	private String groupID;
	private String UID;
	private Date jointime;
	private BigDecimal paid;
	private String status;
	
	private Users user;
	private RankGroup rankGroup;
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
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public Date getJointime() {
		return jointime;
	}
	public void setJointime(Date jointime) {
		this.jointime = jointime;
	}
	public BigDecimal getPaid() {
		return paid;
	}
	public void setPaid(BigDecimal paid) {
		this.paid = paid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public RankGroup getRankGroup() {
		return rankGroup;
	}
	public void setRankGroup(RankGroup rankGroup) {
		this.rankGroup = rankGroup;
	}
	
}
