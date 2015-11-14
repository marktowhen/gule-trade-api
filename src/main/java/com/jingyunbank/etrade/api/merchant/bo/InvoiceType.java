package com.jingyunbank.etrade.api.merchant.bo;

import java.io.Serializable;
/**
 * 发票类型业务类
 * @author liug
 *
 */
public class InvoiceType implements Serializable {

	private static final long serialVersionUID = 1L;
	/**发票类型编码*/
	private String code;
	/**发票类型名称*/
	private String name;
	/**发票类型备注*/
	private String remark;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
