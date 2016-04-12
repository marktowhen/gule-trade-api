package com.jingyunbank.etrade.api.pay.handler;

import java.util.List;
import java.util.Map;

import com.jingyunbank.etrade.api.pay.bo.OrderPayment;

public interface IPayHandler {

	/**
	 * 准备指定订单的支付表单信息，该接口实现类应该返回相应支付平台需要的支付表单信息。
	 * @param payments
	 * @return
	 * @throws Exception
	 */
	public Map<String, String> prepare(List<OrderPayment> payments) throws Exception;
	
}
