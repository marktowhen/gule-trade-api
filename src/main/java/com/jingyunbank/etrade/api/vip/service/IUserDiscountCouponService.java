package com.jingyunbank.etrade.api.vip.service;

import java.math.BigDecimal;
import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.core.Result;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.vip.bo.UserDiscountCoupon;

/**
 * @author Lenovo
 *
 */
public interface IUserDiscountCouponService {
	
	/**
	 * 用户未使用的未过期抵用券
	 * @param uid
	 * @param range
	 * @return
	 * 2015年11月20日 qxs
	 */
	public List<UserDiscountCoupon> getUnusedCoupon(String uid, Range range);

	/**
	 * 用户未使用的未过期抵用券
	 * @param bo
	 * @param range
	 * @return
	 * 2015年11月17日 qxs
	 */
	List<UserDiscountCoupon> getUnusedCoupon(UserDiscountCoupon bo, Range range);

	/**
	 * 用户未使用的未过期抵用券数量
	 * @param bo
	 * @return
	 * 2015年11月19日 qxs
	 */
	int getUnusedCouponAmount(UserDiscountCoupon bo);
	/**
	 * 激活
	 * @param code
	 * @param uid
	 * @return
	 * 2015年11月17日 qxs
	 * @throws DataSavingException 
	 * @throws DataRefreshingException 
	 */
	boolean active(String code, String uid) throws DataSavingException, DataRefreshingException;

	/**
	 * 是否可以消费
	 * @param couponId
	 * @param uid
	 * @param orderPrice
	 * @return
	 * 2015年11月20日 qxs
	 */
	public Result canConsume(String couponId, String uid, BigDecimal orderPrice);
	
	/**
	 * 消费
	 * @param couponId
	 * @param oid
	 * @return
	 * 2015年11月17日 qxs
	 * @throws DataRefreshingException 
	 */
	boolean consume(String couponId, String oid) throws DataRefreshingException;

	

}
