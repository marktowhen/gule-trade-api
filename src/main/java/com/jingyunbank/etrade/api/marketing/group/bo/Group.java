package com.jingyunbank.etrade.api.marketing.group.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jingyunbank.etrade.api.user.bo.Users;

public class Group {
	
	public static final String FLOW_TYPE = "GROUP_FLOW";
	public static final String NEW_STATUS = "NEW";

	private String ID;
	private String leaderUID;
	private Date start;
	private String groupGoodsID;
	private String status;//该团的状态
	private GroupGoods goods;
	private Users leader;
	private List<GroupUser> buyers = new ArrayList<GroupUser>();
	
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
