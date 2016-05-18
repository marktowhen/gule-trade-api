package com.jingyunbank.etrade.api.marketing.rankgroup.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jingyunbank.etrade.api.marketing.group.bo.Group;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupGoodsPriceSetting;

public class RankGroupGoods {
	
	private String ID;
	private String SKUID;
	private long duration;//开团后团的时间长度，second
	private Date deadline;//参加团购截止日期
	//团购阶梯价
	private List<RankGroupGoodsPriceSetting> priceSettings = new ArrayList<RankGroupGoodsPriceSetting>();
	private BigDecimal deposit;//订金，（多退少补）
	private boolean show;//是否上架
	private Date addtime;
	private String GID;
	private String groupID;  //所属团购团ID
    
	
	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	private List<RankGroup> groups = new ArrayList<RankGroup>();
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getSKUID() {
		return SKUID;
	}

	public void setSKUID(String sKUID) {
		SKUID = sKUID;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}



	public BigDecimal getDeposit() {
		return deposit;
	}

	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	public boolean isShow() {
		return show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}



	public List<RankGroupGoodsPriceSetting> getPriceSettings() {
		return priceSettings;
	}

	public void setPriceSettings(List<RankGroupGoodsPriceSetting> priceSettings) {
		this.priceSettings = priceSettings;
	}

	public List<RankGroup> getGroups() {
		return groups;
	}

	public void setGroups(List<RankGroup> groups) {
		this.groups = groups;
	}

	public String getGID() {
		return GID;
	}

	public void setGID(String gID) {
		GID = gID;
	}

	

}
