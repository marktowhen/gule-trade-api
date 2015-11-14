package com.jingyunbank.etrade.api.pay.service;

public interface PayHandlerResolver {

	public PayHandler resolve(String platformcode) throws IllegalArgumentException;
	
}
