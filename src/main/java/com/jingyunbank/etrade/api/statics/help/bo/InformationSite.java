package com.jingyunbank.etrade.api.statics.help.bo;

import java.io.Serializable;


public class InformationSite implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7666242204430885334L;
	private String ID;
	private String SiteID;
	private String name;
	private String titles;
	private String did;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getSiteID() {
		return SiteID;
	}
	public void setSiteID(String siteID) {
		SiteID = siteID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitles() {
		return titles;
	}
	public void setTitles(String titles) {
		this.titles = titles;
	}
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	
	
	
	
}
