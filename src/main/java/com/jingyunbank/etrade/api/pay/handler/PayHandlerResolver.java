package com.jingyunbank.etrade.api.pay.handler;


public interface PayHandlerResolver {

	public PayHandler resolve(String platformcode) throws IllegalArgumentException;
	
}
