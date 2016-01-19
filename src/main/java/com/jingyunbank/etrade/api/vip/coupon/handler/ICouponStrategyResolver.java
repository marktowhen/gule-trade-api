package com.jingyunbank.etrade.api.vip.coupon.handler;

public interface ICouponStrategyResolver {

	public ICouponStrategyService resolve(String coupontype) throws IllegalArgumentException;
	
}
