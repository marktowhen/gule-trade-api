package com.jingyunbank.etrade.api.merchant.bo;

import java.io.Serializable;
/**
 * 快递类型业务类
 * @author liug
 *
 */
public class DeliveryType implements Serializable {

	private static final long serialVersionUID = 1L;
	/**快递类型编码*/
	private String code;
	/**快递类型名称*/
	private String name;
	/**快递类型备注*/
	private String description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
