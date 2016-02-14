package com.jingyunbank.etrade.api.posts.area.bo;

import java.io.Serializable;

public class Country implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8218618260078051732L;
	
	private int countryID;
	private String countryName;
	
	public int getCountryID() {
		return countryID;
	}
	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	

}
