package com.jingyunbank.etrade.api.logistic.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class Postage implements Serializable{
	
	private static final long serialVersionUID = 1765751272587097762L;
	
	public static final String TYPE_NUMBER = "number";
	public static final String TYPE_WEIGHT = "weight";
	public static final String TYPE_VOLUME = "volume";
	
	private String ID;
	private String MID;//商家id
	private String title;//标题
	private String type;//收费类型 number:按件计费 weight:按重量 volume:体积
	private boolean valid;
	private BigDecimal postage;
	private PostageDetail postageDetail;
	private List<PostageDetail> postageDetailList;
	
	
	public PostageDetail getPostageDetail() {
		return postageDetail;
	}
	public void setPostageDetail(PostageDetail postageDetail) {
		this.postageDetail = postageDetail;
	}
	public List<PostageDetail> getPostageDetailList() {
		return postageDetailList;
	}
	public void setPostageDetailList(List<PostageDetail> postageDetailList) {
		this.postageDetailList = postageDetailList;
	}
	public BigDecimal getPostage() {
		return postage;
	}
	public void setPostage(BigDecimal postage) {
		this.postage = postage;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getMID() {
		return MID;
	}
	public void setMID(String mID) {
		MID = mID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
}
