package com.jingyunbank.etrade.api.vip.handler;

public interface ICouponStrategyResolver {

	public ICouponStrategyService resolve(String coupontype) throws IllegalArgumentException;
	
}
