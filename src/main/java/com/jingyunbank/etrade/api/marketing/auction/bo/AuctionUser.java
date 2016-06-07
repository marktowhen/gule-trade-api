package com.jingyunbank.etrade.api.marketing.auction.bo;

import java.io.Serializable;
import java.util.Date;

public class AuctionUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7354951716685336111L;
	public static final String STATUS_NEW="NEW"; //报名
	public static final String STATUS_PAID="PAID";//支付报名  锁定定金
	public static final String STATUS_AUCTIONING="AUCTIONING";//参拍出价
	public static final String STATUS_UP="UP"; //胜出
	public static final String STATUS_OUT="OUT";//出局
	public static final String STATUS_OVER="OVER"; //竞拍结束  定金释放
	private String ID;
	private String auctionGoodsID;
	private String UID;
	private String status;
	private Date joinTime;
	private Date lockTime;
	private Date releaseTime;
	private String depositStatus;
	public Date getLockTime() {
		return lockTime;
	}
	public void setLockTime(Date lockTime) {
		this.lockTime = lockTime;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public String getDepositStatus() {
		return depositStatus;
	}
	public void setDepositStatus(String depositStatus) {
		this.depositStatus = depositStatus;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getAuctionGoodsID() {
		return auctionGoodsID;
	}
	public void setAuctionGoodsID(String auctionGoodsID) {
		this.auctionGoodsID = auctionGoodsID;
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
	public Date getJoinTime() {
		return joinTime;
	}
	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}
	
	

}
