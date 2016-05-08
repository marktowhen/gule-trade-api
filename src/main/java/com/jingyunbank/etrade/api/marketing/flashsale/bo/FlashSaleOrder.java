package com.jingyunbank.etrade.api.marketing.flashsale.bo;

import java.io.Serializable;

public class FlashSaleOrder implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7818081282024780584L;
	
	private String id;
	
	private String flashId;
	
	private String uid;//关联的那个FlashSaleUser的id
	
	private String oid;
	
	private long orderno;
	
	private String type;
	
	

	/**
	 * @return the orderno
	 */
	public long getOrderno() {
		return orderno;
	}

	/**
	 * @param orderno the orderno to set
	 */
	public void setOrderno(long orderno) {
		this.orderno = orderno;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
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
	 * @return the oid
	 */
	public String getOid() {
		return oid;
	}

	/**
	 * @param oid the oid to set
	 */
	public void setOid(String oid) {
		this.oid = oid;
	}

	
	

}
