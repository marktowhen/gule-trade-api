package com.jingyunbank.etrade.api.pay.bo;

import java.io.Serializable;

/**
 * 
 * 支付方式领域类
 *
 */
public class PayType implements Serializable{

	private static final long serialVersionUID = -5467713442211706253L;
	
	private String id;
	private String code;
	private String name;
	private String description;
	private boolean disable;
	private boolean online;
	private String url;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
