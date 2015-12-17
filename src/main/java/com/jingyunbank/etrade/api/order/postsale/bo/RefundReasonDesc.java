package com.jingyunbank.etrade.api.order.postsale.bo;

/**
 * 退款原因描述的领域对象<br>
 * 该类主要描述了有哪些可能的退款原因
 */
public class RefundReasonDesc {

	private String ID;
	private String name;
	private String code;
	private String description;
	private boolean visible;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
}
