package com.jingyunbank.etrade.api.marketing.auction.bo;

import java.io.Serializable;

public class AuctionOrder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6728925264211583962L;
	
	private String ID;
	private String auctionGoodsID;
	private String auctionUserID;
	private long orderno;
	private String OID;
	private String type;
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
	public String getAuctionUserID() {
		return auctionUserID;
	}
	public void setAuctionUserID(String auctionUserID) {
		this.auctionUserID = auctionUserID;
	}
	public long getOrderno() {
		return orderno;
	}
	public void setOrderno(long orderno) {
		this.orderno = orderno;
	}
	public String getOID() {
		return OID;
	}
	public void setOID(String oID) {
		OID = oID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
