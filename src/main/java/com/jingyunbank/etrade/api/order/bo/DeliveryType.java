package com.jingyunbank.etrade.api.order.bo;

import java.io.Serializable;

/**
 * 配送方式 业务类
 * 如申通快递，韵达，顺丰等
 *
 */
public class DeliveryType implements Serializable{
	
	private static final long serialVersionUID = 3644175367717895095L;
	
	private String id;
	private String type;
	private String code;
	private String name;
	private String description;
	private boolean disable;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public boolean isDisable() {
		return disable;
	}
	public void setDisable(boolean disable) {
		this.disable = disable;
	}
	
}
