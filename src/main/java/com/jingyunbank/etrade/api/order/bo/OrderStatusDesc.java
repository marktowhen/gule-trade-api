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
 * <tr><td>退款失败</td><td>REFUNDDENIED</td><td>卖家驳回退款申请</td></tr>
 * <tr><td>退款完成</td><td>REFUNDED</td><td>退款完成</td></tr>
 * 	</table>
 */
public class OrderStatusDesc {

	private String id;
	private String name;
	private String code;
	private String order;
	private String desc;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
}
