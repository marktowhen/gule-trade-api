package com.jingyunbank.etrade.api.statics.area.bo;

import java.io.Serializable;

public class Province implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1505171959647518656L;
	
	private int provinceID;
	private String provinceName;
	private int countryID;
	//偏远地区
	private boolean faraway;
	
	public boolean isFaraway() {
		return faraway;
	}
	public void setFaraway(boolean faraway) {
		this.faraway = faraway;
	}
	public int getProvinceID() {
		return provinceID;
	}
	public void setProvinceID(int provinceID) {
		this.provinceID = provinceID;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public int getCountryID() {
		return countryID;
	}
	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}
	
	
	

}
