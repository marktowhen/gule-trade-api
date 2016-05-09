package com.jingyunbank.etrade.api.marketing.flashsale.bo;

import java.io.Serializable;
import java.util.Date;

import com.jingyunbank.etrade.api.user.bo.Users;

public class FlashSaleUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4213207910987325099L;
	
	public static final String TIMEOUT = "TIMEOUT";//支付超时的状态
	
	private String id;
	
	private String flashId;
	
	private String uid;
	
	private String orderStatus;
	
	private String paid;
	
	private Users user;
	
	private FlashSale flashSale;
	
	private Date orderTime;
	
	/**
	 * @return the orderTime
	 */
	public Date getOrderTime() {
		return orderTime;
	}

	/**
	 * @param orderTime the orderTime to set
	 */
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	/**
	 * @return the user
	 */
	public Users getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(Users user) {
		this.user = user;
	}

	/**
	 * @return the flashSale
	 */
	public FlashSale getFlashSale() {
		return flashSale;
	}

	/**
	 * @param flashSale the flashSale to set
	 */
	public void setFlashSale(FlashSale flashSale) {
		this.flashSale = flashSale;
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
	 * @return the flashId
	 */
	public String getFlashId() {
		return flashId;
	}

	/**
	 * @param flashId the flashId to set
	 */
	public void setFlashId(String flashId) {
		this.flashId = flashId;
	}

	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the paid
	 */
	public String getPaid() {
		return paid;
	}

	/**
	 * @param paid the paid to set
	 */
	public void setPaid(String paid) {
		this.paid = paid;
	}
	
	
}
