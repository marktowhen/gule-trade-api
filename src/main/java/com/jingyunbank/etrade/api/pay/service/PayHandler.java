package com.jingyunbank.etrade.api.pay.service;

import java.util.List;

import com.jingyunbank.etrade.api.pay.bo.OrderPayment;
import com.jingyunbank.etrade.api.pay.bo.PayPlatform;

public interface PayHandler {

	public void handle(PayPlatform platform, List<OrderPayment> payments) throws Exception;
	
}
