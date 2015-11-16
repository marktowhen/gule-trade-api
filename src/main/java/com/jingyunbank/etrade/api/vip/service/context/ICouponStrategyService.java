package com.jingyunbank.etrade.api.vip.service.context;

import java.math.BigDecimal;

import com.jingyunbank.etrade.api.vip.bo.BaseCoupon;
/**
 * 优惠券（购物金，抵扣券）的优惠策略。
 */
public interface ICouponStrategyService {

	/**
	 * 判断该策略是否支持某种卡券优惠。
	 * @param coupon
	 * @return
	 */
	public boolean support(BaseCoupon coupon);
	/**
	 * 计算指定卡券优惠活动的活动价格。
	 * @param originCost 原始价格
	 * @param coupon 卡券优惠活动
	 * @return
	 */
	public BigDecimal calculate(BigDecimal originCost, BaseCoupon coupon) throws UnsupportedOperationException;
	
}
