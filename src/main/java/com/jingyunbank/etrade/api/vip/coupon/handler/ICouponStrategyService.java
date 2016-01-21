package com.jingyunbank.etrade.api.vip.coupon.handler;

import java.math.BigDecimal;
import java.util.List;

import com.jingyunbank.core.Result;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.order.presale.bo.Orders;
import com.jingyunbank.etrade.api.vip.coupon.bo.BaseCoupon;
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
	 * @param couponid 卡券id
	 * @return 
	 */
	public Result<BigDecimal> calculate(String UID, String couponID, BigDecimal originprice);
	/**
	 * 计算卡券优惠的订单价格。存在卡券并且计算成功后返回true，否则返回false
	 * @param UID
	 * @param couponID
	 * @param orders
	 * @return
	 */
	public boolean calculate(String UID, String couponID, List<Orders> orders);
	
	/**
	 * 消费指定类型的指定优惠卡券.
	 * <p>
	 * 该方法当在用户支付后调用。
	 * @param UID
	 * @param couponID
	 * @param couponType
	 * @throws DataRefreshingException
	 */
	public void consume(String UID, String couponID) throws DataRefreshingException;
	/**
	 * 冻结某用户得某优惠券，以防止统一优惠券多次使用
	 * @param UID
	 * @param couponID
	 * @throws DataRefreshingException
	 */
	public void lock(String UID, String couponID) throws DataRefreshingException;
	/**
	 * 接触优惠券的冻结
	 * @param UID
	 * @param couponID
	 * @throws DataRefreshingException
	 */
	public void unlock(String UID, String couponID) throws DataRefreshingException;
}
