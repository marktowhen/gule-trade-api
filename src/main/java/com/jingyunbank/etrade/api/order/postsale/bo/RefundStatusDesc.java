package com.jingyunbank.etrade.api.order.postsale.bo;


/**
* <table border=1>
* <tr><td>退款申请</td><td>REQUEST</td><td>买家申请退款</td></tr>
* <tr><td>退款取消</td><td>CANCEL</td><td>买家取消申请退款</td></tr>
* <tr><td>退款批准</td><td>ACCEPT</td><td>卖家接受退款申请</td></tr>
* <tr><td>退款驳回</td><td>DENIED</td><td>卖家驳回退款申请</td></tr>
* <tr><td>开始退货</td><td>RETURN</td><td>买家退货给卖家</td></tr>
* <tr><td>退货完成</td><td>DONE</td><td>退货退款完成</td></tr>
* </table>
*/
public class RefundStatusDesc {
	public final static String REQUEST_CODE 			= "RREQUEST";
	public final static String CANCEL_CODE				= "RCANCEL";
	public final static String ACCEPT_CODE 				= "RACCEPT";
	public final static String DENIED_CODE 				= "RDENIED";
	public final static String RETURN_CODE				= "RRETURN";
	public final static String DONE_CODE 				= "RDONE";
	
	public final static RefundStatusDesc			REQUEST		= new RefundStatusDesc(REQUEST_CODE, "买家退款申请", 0, "买家申请退款", true);
	public final static RefundStatusDesc			CANCEL		= new RefundStatusDesc(CANCEL_CODE, "买家取消退款申请", 0, "买家取消退款申请", true);
	public final static RefundStatusDesc			ACCEPT		= new RefundStatusDesc(ACCEPT_CODE, "卖家同意退款申请", 0, "卖家同意退款申请", true);
	public final static RefundStatusDesc			DENIED		= new RefundStatusDesc(DENIED_CODE, "卖家驳回退款申请", 0, "卖家驳回退款申请", true);
	public final static RefundStatusDesc			RETURN		= new RefundStatusDesc(RETURN_CODE, "买家退货给卖家", 0, "买家退货给卖家", true);
	public final static RefundStatusDesc			DONE		= new RefundStatusDesc(DONE_CODE, "退货退款完成", 0, "退货退款完成", true);
	
	private String name;
	private String code;
	private int orders;
	private String description;
	private boolean visible;//该状态下的订单买家是否可见
	
	public RefundStatusDesc() {
		super();
	}
	public RefundStatusDesc(String name, String code, int orders,
			String description, boolean visible) {
		super();
		this.name = name;
		this.code = code;
		this.orders = orders;
		this.description = description;
		this.visible = visible;
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
	public int getOrders() {
		return orders;
	}
	public void setOrders(int orders) {
		this.orders = orders;
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
