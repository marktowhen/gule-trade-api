package com.jingyunbank.etrade.api.order.bo;

import java.util.Date;

/**
 * 订单生命状态记录的业务对象<br>
 * 该类描述了订单的整个生命周期的变更史，包括下单，支付，发货，收货，评价，取消等等状态的详细信息
 */
public class OrderLifeCycle {

	private String id;
	private String orderno;
	private String operator;//操作者
	private String status;// 状态码 OrderStatusDesc.code
	private Date addtime;//发生时间
	private String note;//
}
