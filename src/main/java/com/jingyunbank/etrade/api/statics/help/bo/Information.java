package com.jingyunbank.etrade.api.statics.help.bo;

import java.io.Serializable;

public class Information implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2259900226922898943L;
	private String ID;
	private String name;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
}
