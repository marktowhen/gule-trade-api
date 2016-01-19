package com.jingyunbank.etrade.api.goods.bo;

import java.io.Serializable;
/**
 * 商品类型  业务类
 * @author liug
 *
 */
public class GoodsType implements Serializable{

	private static final long serialVersionUID = 1L;
	/**主键*/
	private String ID;
	/**类型名称*/
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
