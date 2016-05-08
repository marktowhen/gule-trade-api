package com.jingyunbank.etrade.api.marketing.rankgroup.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jingyunbank.etrade.api.user.bo.Users;

public class RankGroup {
	
	private String ID;
	private String leaderUID;//团长id
	private Date start;
	private String groupGoodsID;  //团购商品id
	private String status;//该团的状态
	private RankGroupGoods rankGoods;
	private Users leader;
	private List<RankGroupUser> buyers = new ArrayList<RankGroupUser>();
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getLeaderUID() {
		return leaderUID;
	}
	public void setLeaderUID(String leaderUID) {
		this.leaderUID = leaderUID;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
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
	public RankGroupGoods getRankGoods() {
		return rankGoods;
	}
	public void setRankGoods(RankGroupGoods rankGoods) {
		this.rankGoods = rankGoods;
	}
	public Users getLeader() {
		return leader;
	}
	public void setLeader(Users leader) {
		this.leader = leader;
	}
	public List<RankGroupUser> getBuyers() {
		return buyers;
	}
	public void setBuyers(List<RankGroupUser> buyers) {
		this.buyers = buyers;
	}

}
