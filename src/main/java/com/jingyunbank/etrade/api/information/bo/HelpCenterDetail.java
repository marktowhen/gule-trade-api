package com.jingyunbank.etrade.api.information.bo;

import java.io.Serializable;
import java.util.Date;

public class HelpCenterDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7572475128385909716L;
	
	private String ID;
	//父级菜单id
	private String parentID;
	//名称
	private String name;
	//内容
	private String content;
	//是否有效
	private boolean valid;
	//排序
	private int sort;
	//添加时间
	private Date addTime;
	//修改时间
	private Date updateTime;
	//修改人
	private Date updateUID;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getParentID() {
		return parentID;
	}
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getUpdateUID() {
		return updateUID;
	}
	public void setUpdateUID(Date updateUID) {
		this.updateUID = updateUID;
	}
	
	

}
