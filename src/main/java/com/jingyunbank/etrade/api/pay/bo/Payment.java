package com.jingyunbank.etrade.api.pay.bo;

/**
 * 付款业务对象（领域对象）<br>
 * 该类描述了某个订单的支付信息，<br>
 * 包括支付金额，付款人，订单号，交易号，付款状态，付款方式等<br>
 *
 */
public class Payment {

	private String transno;
	private double money;
	private String uid;
	private String desc;
	private String orderno;
	private boolean success;
	private PayType type;
}
