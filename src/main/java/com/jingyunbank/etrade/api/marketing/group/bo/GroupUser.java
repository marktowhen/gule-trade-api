package com.jingyunbank.etrade.api.marketing.group.bo;

import java.math.BigDecimal;
import java.util.Date;

import com.jingyunbank.etrade.api.user.bo.Users;

public class GroupUser {

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
	private String headImgUrl;
	private String nickname;
	private Users user;
	private Group group;
	
	
	/**
	 * @return the headImgUrl
	 */
	public String getHeadImgUrl() {
		return headImgUrl;
	}
	/**
	 * @param headImgUrl the headImgUrl to set
	 */
	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}
	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
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
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
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
	
}
