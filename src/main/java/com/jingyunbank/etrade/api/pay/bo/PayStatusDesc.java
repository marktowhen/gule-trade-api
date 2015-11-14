package com.jingyunbank.etrade.api.pay.bo;

import java.io.Serializable;


/**
 * 支付状态描述定义业务类。<br><br>
 *
 *<br>
 * 	<table border=1>
 * <tr><td>name</td><td>code</td><td>desc</td></tr>
 * <tr><td></td><td></td><td></td></tr>
 * <tr><td>未支付</td><td>NEW</td><td>未支付</td></tr>
 * <tr><td>支付成功</td><td>PAID</td><td>支付成功</td></tr>
 * <tr><td>支付失败</td><td>PAYFAIL</td><td>支付失败</td></tr>
 * 	</table>
 */
public final class PayStatusDesc implements Serializable{
	
	private static final long serialVersionUID = -4489509143626072361L;
	
	public final static String NEW_CODE 				= "NEW";
	public final static String PAID_CODE 				= "PAID";
	public final static String PAYFAIL_CODE 			= "PAYFAIL";
	
	public final static PayStatusDesc			NEW				= new PayStatusDesc(NEW_CODE, "未支付", 0, "还未支付，或者支付结果还未返回");
	public final static PayStatusDesc			PAID			= new PayStatusDesc(PAID_CODE, "支付成功", 2, "支付成功");
	public final static PayStatusDesc			PAYFAIL			= new PayStatusDesc(PAYFAIL_CODE, "支付失败", 2, "支付失败");
	
	private String name;
	private String code;
	private int order;
	private String desc;
	
	public PayStatusDesc(String code, String name, int order,
			String desc) {
		super();
		this.name = name;
		this.code = code;
		this.order = order;
		this.desc = desc;
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

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
