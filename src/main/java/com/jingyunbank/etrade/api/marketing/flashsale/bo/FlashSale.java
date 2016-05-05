package com.jingyunbank.etrade.api.marketing.flashsale.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class FlashSale implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 395783659124982162L;

	private String id;
	
	private String gid;
	
	private String skuId;
	
	private int stock;
	
	private Date showTime;//上架的时间
	
	private Date activityTime;//活动时间
	
	private double currentPrice;//现在的价格
	
	private int flashStatus;
	
	private boolean shows;
	
	
	
	/**
	 * @return the showTime
	 */
	public Date getShowTime() {
		return showTime;
	}

	/**
	 * @param showTime the showTime to set
	 */
	public void setShowTime(Date showTime) {
		this.showTime = showTime;
	}

	
	/**
	 * @return the shows
	 */
	public boolean isShows() {
		return shows;
	}

	/**
	 * @param shows the shows to set
	 */
	public void setShows(boolean shows) {
		this.shows = shows;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	
	/**
	 * @return the gid
	 */
	public String getGid() {
		return gid;
	}

	/**
	 * @param gid the gid to set
	 */
	public void setGid(String gid) {
		this.gid = gid;
	}

	/**
	 * @return the skuId
	 */
	public String getSkuId() {
		return skuId;
	}

	/**
	 * @param skuId the skuId to set
	 */
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * @return the activityTime
	 */
	public Date getActivityTime() {
		return activityTime;
	}

	/**
	 * @param activityTime the activityTime to set
	 */
	public void setActivityTime(Date activityTime) {
		this.activityTime = activityTime;
	}


	/**
	 * @return the currentPrice
	 */
	public double getCurrentPrice() {
		return currentPrice;
	}

	/**
	 * @param currentPrice the currentPrice to set
	 */
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	/**
	 * @return the flashStatus
	 */
	public int getFlashStatus() {
		return flashStatus;
	}

	/**
	 * @param flashStatus the flashStatus to set
	 */
	public void setFlashStatus(int flashStatus) {
		this.flashStatus = flashStatus;
	}
	
	
}
