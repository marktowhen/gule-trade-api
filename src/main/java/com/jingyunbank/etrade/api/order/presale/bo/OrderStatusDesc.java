package com.jingyunbank.etrade.api.order.presale.bo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

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
 * <tr><td>卖家发货中，商品出库中</td><td>ACCEPT</td><td>卖家确认用户已经付款,并准备发货,该状态中的，及状态后的产品不允许用户直接退款，必须发起退款申请，得到卖家同意方可退款</td></tr>
 * <tr><td>卖家已发货</td><td>DELIVERED</td><td>卖家已发货</td></tr>
 * <tr><td>交易成功</td><td>RECEIVED</td><td>买家确认收到货品，意味着<strong><i>交易成功</i></strong></td></tr>
 * <tr><td>买家已评价</td><td>COMMENTED</td><td>买家已经评价了该商品</td></tr>
 * <tr><td>退款中</td><td>REFUNDING</td><td>退款中，买家没有确认收货而是发出退款退货申请</td></tr>
 * <tr><td>交易关闭</td><td>CLOSED</td><td>订单被取消（原因可能有 买家主动取消， 买家付款超时取消，买家退款成功）</td></tr>
 * <tr><td>订单移除</td><td>REMOVED</td><td>已取消的订单被用户删除</td></tr>
 * 	</table>
 */
public final class OrderStatusDesc implements Serializable{

	private static final long serialVersionUID = 7805539891696735065L;
	public final static String NEW_CODE 				= "NEW";
	public final static String PAYING_CODE 				= "PAYING";
	public final static String PAID_CODE 				= "PAID";
	public final static String PAYFAIL_CODE 			= "PAYFAIL";
	public final static String ACCEPT_CODE 				= "ACCEPT";
	public final static String DELIVERED_CODE 			= "DELIVERED";
	public final static String RECEIVED_CODE 			= "RECEIVED";
	public final static String COMMENTED_CODE 			= "COMMENTED";
	public final static String CLOSED_CODE 				= "CLOSED";
	public final static String REMOVED_CODE 			= "REMOVED";
	public final static String REFUNDING_CODE 			= "REFUNDING";
	public final static String REFUNDED_CODE 			= "REFUNDED";
	
	public final static OrderStatusDesc			NEW				= new OrderStatusDesc(NEW_CODE, "待付款", 0, "买家下单，但是还没有付款", true);
	public final static OrderStatusDesc			PAYING			= new OrderStatusDesc(PAYING_CODE, "支付结果确认中", 1, "支付结果确认中， 已调用第三方或者银行支付接口，等待对方确认支付结果", false);
	public final static OrderStatusDesc			PAID			= new OrderStatusDesc(PAID_CODE, "已付款", 2, "买家完成支付", true);
	public final static OrderStatusDesc			PAYFAIL			= new OrderStatusDesc(PAYFAIL_CODE, "支付失败", 2, "第三方或者银行告知支付失败", true);
	public final static OrderStatusDesc			ACCEPT			= new OrderStatusDesc(ACCEPT_CODE, "出库中", 3, "卖家确认用户已经付款,并准备发货,该状态中的，及状态后的产品不允许用户直接退款，必须发起退款申请，得到卖家同意方可退款", true);
	public final static OrderStatusDesc			DELIVERED		= new OrderStatusDesc(DELIVERED_CODE, "卖家已发货", 4, "卖家已发货", true);
	public final static OrderStatusDesc			RECEIVED		= new OrderStatusDesc(RECEIVED_CODE, "交易成功", 5, "买家确认收到货品，意味着交易成功", true);
	public final static OrderStatusDesc			COMMENTED		= new OrderStatusDesc(COMMENTED_CODE, "买家已评价", 6, "买家已经评价了该商品", true);
	public final static OrderStatusDesc			CLOSED			= new OrderStatusDesc(CLOSED_CODE, "交易关闭", 0, "订单被取消", true);
	public final static OrderStatusDesc			REMOVED			= new OrderStatusDesc(REMOVED_CODE, "订单移除", 0, "已取消的订单被用户删除", true);
	public final static OrderStatusDesc			REFUNDING		= new OrderStatusDesc(REFUNDING_CODE, "退款中", 0, "买家申请退款中", true);
	public final static OrderStatusDesc			REFUNDED		= new OrderStatusDesc(REFUNDING_CODE, "退款完成", 0, "完成退款", true);
	
	private final static Map<String, OrderStatusDesc> caches = new HashMap<String, OrderStatusDesc>();
	static{
		caches.put(ACCEPT_CODE, ACCEPT);
		caches.put(CLOSED_CODE, CLOSED);
		caches.put(COMMENTED_CODE, COMMENTED);
		caches.put(DELIVERED_CODE, DELIVERED);
		caches.put(NEW_CODE, NEW);
		caches.put(PAID_CODE, PAID);
		caches.put(PAYFAIL_CODE, PAYFAIL);
		caches.put(PAYING_CODE, PAYING);
		caches.put(RECEIVED_CODE, RECEIVED);
		caches.put(REFUNDING_CODE, REFUNDING);
		caches.put(REMOVED_CODE, REMOVED);
		caches.put(REFUNDED_CODE, REFUNDED);
	}
	
	private String name;
	private String code;
	private int orders;
	private String description;
	private boolean visible;//该状态下的订单买家是否可见
	
	public OrderStatusDesc() {
		super();
	}

	public OrderStatusDesc(String code, String name, int orders,
			String desc, boolean visible) {
		super();
		this.name = name;
		this.code = code;
		this.orders = orders;
		this.description = desc;
		this.visible = visible;
	}
	
	public static OrderStatusDesc resolve(String code){
		return caches.getOrDefault(code, new OrderStatusDesc("NULL", "未定义", 999, "未定义的状态，程序异常", false));
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

	public int getOrders() {
		return orders;
	}

	public void setOrders(int orders) {
		this.orders = orders;
	}

	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
