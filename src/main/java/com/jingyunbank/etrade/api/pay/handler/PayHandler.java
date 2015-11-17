package com.jingyunbank.etrade.api.pay.handler;

import java.util.List;
import java.util.Map;

import com.jingyunbank.etrade.api.pay.bo.OrderPayment;

public interface PayHandler {

	public Map<String, String> handle(List<OrderPayment> payments) throws Exception;
	
}
