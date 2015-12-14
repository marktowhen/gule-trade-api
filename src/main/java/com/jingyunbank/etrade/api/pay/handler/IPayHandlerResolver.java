package com.jingyunbank.etrade.api.pay.handler;


public interface IPayHandlerResolver {

	public IPayHandler resolve(String platformcode) throws IllegalArgumentException;
	
}
