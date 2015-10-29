package com.jingyunbank.etrade.api.order.bo;

import java.util.Date;

/**
 * 订单退款领域对象<br>
 * 该类描述了，用户的订单退款请求信息，及其状态
 *
 */
public class OrderRefund {

	private String id;
	private String gid;//商品id
	private String orderno;//
	private double money;//申请退款金额
	private double finalMoney;//最终退款额
	private Date addtime;//申请时间
	private int reason;
	private String exprno;//快递单号
	private String status;//OrderStatusDesc
}
