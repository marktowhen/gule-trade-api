package com.jingyunbank.etrade.api.user.bo;

import java.io.Serializable;

/**
 *	角色
 */

public class Role implements Serializable {

	public static final String MANAGER_CODE = "MANAGER";
	public static final String MANAGER_NAME = "管理员";
	/**
	 * 
	 */
	private static final long serialVersionUID = -2869699964558998184L;
	
	private String ID;
	private String code;//角色编码
	private String name;//角色名称
	private boolean valid; //是否有效
	private String remark;//备注
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

}
