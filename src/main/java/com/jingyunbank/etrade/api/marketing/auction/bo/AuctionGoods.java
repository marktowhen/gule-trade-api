package com.jingyunbank.etrade.api.marketing.auction.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.jingyunbank.etrade.api.wap.goods.bo.Goods;
import com.jingyunbank.etrade.api.wap.goods.bo.GoodsSku;

public class AuctionGoods implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4960056804016800973L;
	
	public static final String TYPE_DELAY = "DELAY";
	public static final String TYPE_ON_TIME = "ON_TIME";
	
	public static final String STATUS_NEW = "NEW";
	public static final String STATUS_AUCTIONING = "AUCTIONING";
	public static final String STATUS_OVER = "OVER";
	
	
	private String ID;
	private String GID;
	private String SKUID;
	private Date startTime; //开始时间
	private Date endTime;//结束时间
	private int delaySecond;//当到达截止时间前有人出价 延迟结束秒数
	private int delayAmount; //延迟次数
	private String type;//类型  到期结束还是结束前有延迟
	private String status;//状态 
	private BigDecimal deposit;//定金
	private BigDecimal startPrice;//起拍价
	private BigDecimal addPrice;//每次最低加价
	private BigDecimal soldPrice;//成交价
	private String soldUID; //买家id
	
	private Goods goods;
	private GoodsSku sku;
	private int userAmount;
	
	public int getUserAmount() {
		return userAmount;
	}
	public void setUserAmount(int userAmount) {
		this.userAmount = userAmount;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public GoodsSku getSku() {
		return sku;
	}
	public void setSku(GoodsSku sku) {
		this.sku = sku;
	}
	public String getSoldUID() {
		return soldUID;
	}
	public void setSoldUID(String soldUID) {
		this.soldUID = soldUID;
	}
	public int getDelaySecond() {
		return delaySecond;
	}
	public void setDelaySecond(int delaySecond) {
		this.delaySecond = delaySecond;
	}
	public int getDelayAmount() {
		return delayAmount;
	}
	public void setDelayAmount(int delayAmount) {
		this.delayAmount = delayAmount;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getGID() {
		return GID;
	}
	public void setGID(String gID) {
		GID = gID;
	}
	public String getSKUID() {
		return SKUID;
	}
	public void setSKUID(String sKUID) {
		SKUID = sKUID;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public BigDecimal getDeposit() {
		return deposit;
	}
	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}
	public BigDecimal getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(BigDecimal startPrice) {
		this.startPrice = startPrice;
	}
	public BigDecimal getAddPrice() {
		return addPrice;
	}
	public void setAddPrice(BigDecimal addPrice) {
		this.addPrice = addPrice;
	}
	public BigDecimal getSoldPrice() {
		return soldPrice;
	}
	public void setSoldPrice(BigDecimal soldPrice) {
		this.soldPrice = soldPrice;
	}
	
	
	
	
}
