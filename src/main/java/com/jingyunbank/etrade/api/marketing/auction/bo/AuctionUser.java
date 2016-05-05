package com.jingyunbank.etrade.api.marketing.auction.bo;

import java.io.Serializable;
import java.util.Date;

public class AuctionUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7354951716685336111L;
	
	private String ID;
	private String auctionGoodsID;
	private String UID;
	private String status;
	private Date joinTime;
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
