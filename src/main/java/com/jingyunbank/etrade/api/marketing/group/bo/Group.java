package com.jingyunbank.etrade.api.marketing.group.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jingyunbank.etrade.api.user.bo.Users;

public class Group {

	private GroupGoods goods;
	private String ID;
	private Users leader;
	private Date start;
	private List<GroupUser> buyers = new ArrayList<GroupUser>();
	
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
