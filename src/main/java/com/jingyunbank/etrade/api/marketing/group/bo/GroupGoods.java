package com.jingyunbank.etrade.api.marketing.group.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupGoods {

	private String ID;
	private String SKUID;
	private long duration;//开团后团的时间长度，second
	private Date deadline;//团购截止日期
	private boolean upperlimit;//是否设置人数上限 
	private int minpeople;//最少成团人数 分享团成团人数
	//团购阶梯价
	private List<GroupGoodsPriceSetting> priceSettings = new ArrayList<GroupGoodsPriceSetting>();
	private BigDecimal deposit;//订金，（多退少补）
	//团长佣金
	private BigDecimal commission;
	private boolean show;//是否上架
	private Date addtime;
	
	private List<Group> groups = new ArrayList<Group>();
	
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
	public boolean isUpperlimit() {
		return upperlimit;
	}
	public void setUpperlimit(boolean upperlimit) {
		this.upperlimit = upperlimit;
	}
	public List<GroupGoodsPriceSetting> getPriceSettings() {
		return priceSettings;
	}
	public void setPriceSettings(List<GroupGoodsPriceSetting> priceSettings) {
		this.priceSettings = priceSettings;
	}
	public BigDecimal getDeposit() {
		return deposit;
	}
	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}
	public BigDecimal getCommission() {
		return commission;
	}
	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}
	public boolean isShow() {
		return show;
	}
	public void setShow(boolean show) {
		this.show = show;
	}
	public List<Group> getGroups() {
		return groups;
	}
	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}
	public int getMinpeople() {
		return minpeople;
	}
	public void setMinpeople(int minpeople) {
		this.minpeople = minpeople;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public String getSKUID() {
		return SKUID;
	}
	public void setSKUID(String sKUID) {
		SKUID = sKUID;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	
}
