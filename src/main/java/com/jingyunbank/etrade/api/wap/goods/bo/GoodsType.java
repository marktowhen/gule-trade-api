package com.jingyunbank.etrade.api.wap.goods.bo;

import java.io.Serializable;

/**
 * 
* Title: GoodsType  商品类型
* @author    duanxf
* @date      2016年3月31日
 */
public class GoodsType implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String ID;
	private String name;
	private boolean status;
	private int adminsort;
	
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getAdminsort() {
		return adminsort;
	}
	public void setAdminsort(int adminsort) {
		this.adminsort = adminsort;
	}
	
	
}
