package com.jingyunbank.etrade.api.pay.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jingyunbank.etrade.api.pay.bo.OrderPayment;

public interface PayHandler {

	public void handle(List<OrderPayment> payments, 
				HttpServletRequest request,
				HttpServletResponse response) throws Exception;
	
}
