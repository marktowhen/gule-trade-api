package com.jingyunbank.etrade.api.order.bo;

/**
 * 订单状态描述定义业务类。<br><br>
 * 该类定义了整个订单的生命周期中各个节点的状态<br><br>
 * 包括状态名，状态描述
 *
 *<br>
 * 	<table border=1>
 * <tr><td>name</td><td>code</td><td>desc</td></tr>
 * <tr><td></td><td></td><td></td></tr>
 * <tr><td>待付款</td><td>NEW</td><td>买家下单，但是还没有付款</td></tr>
 * <tr><td>支付结果确认</td><td>PAYING</td><td>支付结果确认中， 已调用第三方或者银行支付接口，等待对方确认支付结果</td></tr>
 * <tr><td>已付款</td><td>PAID</td><td>买家完成支付</td></tr>
 * <tr><td>支付失败</td><td>PAYFAIL</td><td>第三方或者银行告知支付失败</td></tr>
 * <tr><td>卖家发货中，商品出库中</td><td>DELIVERING</td><td>卖家确认用户已经付款,并准备发货,该状态中的，及状态后的产品不允许用户直接退款，必须发起退款申请，得到卖家同意方可退款</td></tr>
 * <tr><td>卖家已发货</td><td>DELIVERED</td><td>卖家已发货</td></tr>
 * <tr><td>买家已收货</td><td>RECEIVED</td><td>买家确认收到货品，意味着交易成功</td></tr>
 * <tr><td>买家已评价</td><td>COMMENTED</td><td>买家已经评价了该商品</td></tr>
 * <tr><td>订单取消</td><td>CANCELED</td><td>订单被取消</td></tr>
 * <tr><td>订单移除</td><td>REMOVED</td><td>已取消的订单被用户删除</td></tr>
 * <tr><td>退款中</td><td>REFUNDING</td><td>买家申请退款中</td></tr>
 * <tr><td>退款驳回</td><td>RFDDENIED</td><td>卖家驳回退款申请</td></tr>
 * <tr><td>退款失败</td><td>RFDFAIL</td><td>卖家退款同意，但是退款失败</td></tr>
 * <tr><td>退款完成</td><td>REFUNDED</td><td>退款完成</td></tr>
 * 	</table>
 */
public final class OrderStatusDesc {

	public final static String NEW_CODE 				= "NEW";
	public final static String PAYING_CODE 				= "PAYING";
	public final static String PAID_CODE 				= "PAID";
	public final static String PAYFAIL_CODE 			= "PAYFAIL";
	public final static String DELIVERING_CODE 			= "DELIVERING";
	public final static String DELIVERED_CODE 			= "DELIVERED";
	public final static String RECEIVED_CODE 			= "RECEIVED";
	public final static String COMMENTED_CODE 			= "COMMENTED";
	public final static String CANCELED_CODE 			= "CANCELED";
	public final static String REMOVED_CODE 			= "REMOVED";
	public final static String REFUNDING_CODE 			= "REFUNDING";
	public final static String RFDDENIED_CODE 			= "REFUNDDENIED";
	public final static String RFDFAIL_CODE 			= "REFUNDFAIL";
	public final static String REFUNDED_CODE 			= "REFUNDED";
	
	public final static OrderStatusDesc			NEW				= new OrderStatusDesc(NEW_CODE, "待付款", 0, "买家下单，但是还没有付款", true);
	public final static OrderStatusDesc			PAYING			= new OrderStatusDesc(PAYING_CODE, "支付结果确认中", 1, "支付结果确认中， 已调用第三方或者银行支付接口，等待对方确认支付结果", false);
	public final static OrderStatusDesc			PAID			= new OrderStatusDesc(PAID_CODE, "已付款", 2, "买家完成支付", true);
	public final static OrderStatusDesc			PAYFAIL			= new OrderStatusDesc(PAYFAIL_CODE, "支付失败", 2, "第三方或者银行告知支付失败", true);
	public final static OrderStatusDesc			DELIVERING		= new OrderStatusDesc(DELIVERING_CODE, "卖家发货中/商品出库中", 3, "卖家确认用户已经付款,并准备发货,该状态中的，及状态后的产品不允许用户直接退款，必须发起退款申请，得到卖家同意方可退款", true);
	public final static OrderStatusDesc			DELIVERED		= new OrderStatusDesc(DELIVERED_CODE, "卖家已发货", 4, "卖家已发货", true);
	public final static OrderStatusDesc			RECEIVED		= new OrderStatusDesc(RECEIVED_CODE, "买家已收货", 5, "买家确认收到货品，意味着交易成功", true);
	public final static OrderStatusDesc			COMMENTED		= new OrderStatusDesc(COMMENTED_CODE, "买家已评价", 6, "买家已经评价了该商品", true);
	public final static OrderStatusDesc			CANCELED		= new OrderStatusDesc(CANCELED_CODE, "订单取消", 0, "订单被取消", true);
	public final static OrderStatusDesc			REMOVED			= new OrderStatusDesc(REMOVED_CODE, "订单移除", 0, "已取消的订单被用户删除", true);
	public final static OrderStatusDesc			REFUNDING		= new OrderStatusDesc(REFUNDING_CODE, "退款中", 0, "买家申请退款中", true);
	public final static OrderStatusDesc			RFDDENIED		= new OrderStatusDesc(RFDDENIED_CODE, "退款驳回", 0, "卖家驳回退款申请", true);
	public final static OrderStatusDesc			RFDFAIL			= new OrderStatusDesc(RFDFAIL_CODE, "退款失败", 0, "卖家退款同意，但是退款失败", true);
	public final static OrderStatusDesc			REFUNDED		= new OrderStatusDesc(REFUNDED_CODE, "退款完成", 0, "退款完成", true);
	
	private String name;
	private String code;
	private int order;
	private String desc;
	private boolean visible;//该状态下的订单买家是否可见
	
	public OrderStatusDesc(String code, String name, int order,
			String desc, boolean visible) {
		super();
		this.name = name;
		this.code = code;
		this.order = order;
		this.desc = desc;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
