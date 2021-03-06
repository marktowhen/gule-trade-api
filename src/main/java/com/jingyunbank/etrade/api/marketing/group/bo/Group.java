package com.jingyunbank.etrade.api.marketing.group.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jingyunbank.etrade.api.user.bo.Users;

public class Group {
	
	public static final String FLOW_TYPE = "GROUP_FLOW";
	/**
	 * 新建团购 团长未支付定金
	 */
	public static final String STATUS_NEW = "NEW";
	/**
	 * 召集中
	 */
	public static final String STATUS_CONVENING = "CONVENING";
	
	/**
	 * 支付完成
	 */
	public static final String STATUS_PAID = "PAID";
	
	/**
	 * 已退款
	 */
	public static final String STATUS_REFUNED = "REFUNED";
	/**
	 * 参团失败 如定金支付超时等
	 */
	public static final String STATUS_CLOSED = "CLOSED";
	
	

	private String ID;
	private String leaderUID;
	private Date start;
	private String groupGoodsID;
	private String status;//该团的状态
	private GroupGoods goods;
	private String path;
	private String propertyValue;
	private String gname;
	private Users leader;
	private List<GroupUser> buyers = new ArrayList<GroupUser>();
	
	/**
	 * @return the gname
	 */
	public String getGname() {
		return gname;
	}
	/**
	 * @param gname the gname to set
	 */
	public void setGname(String gname) {
		this.gname = gname;
	}
	/**
	 * @return the propertyValue
	 */
	public String getPropertyValue() {
		return propertyValue;
	}
	/**
	 * @param propertyValue the propertyValue to set
	 */
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}
	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	public String getLeaderUID() {
		return leaderUID;
	}
	public void setLeaderUID(String leaderUID) {
		this.leaderUID = leaderUID;
	}
	public String getGroupGoodsID() {
		return groupGoodsID;
	}
	public void setGroupGoodsID(String groupGoodsID) {
		this.groupGoodsID = groupGoodsID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public GroupGoods getGoods() {
		return goods;
	}
	public void setGoods(GroupGoods goods) {
		this.goods = goods;
	}
	public Users getLeader() {
		return leader;
	}
	public void setLeader(Users leader) {
		this.leader = leader;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public List<GroupUser> getBuyers() {
		return buyers;
	}
	public void setBuyers(List<GroupUser> buyers) {
		this.buyers = buyers;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
}
