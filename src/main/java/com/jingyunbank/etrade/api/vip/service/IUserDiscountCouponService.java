package com.jingyunbank.etrade.api.vip.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.vip.bo.UserDiscountCoupon;

/**
 * @author Lenovo
 *
 */
public interface IUserDiscountCouponService {

	/**
	 * 获取用户可用的券
	 * @param bo
	 * @param range
	 * @return
	 * 2015年11月17日 qxs
	 */
	List<UserDiscountCoupon> getUnusedCoupon(UserDiscountCoupon bo, Range range);

	/**
	 * 获取用户可用的券数量
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
	 * 消费
	 * @param couponId
	 * @param oid
	 * @return
	 * 2015年11月17日 qxs
	 * @throws DataRefreshingException 
	 */
	boolean consume(String couponId, String oid) throws DataRefreshingException;

	

}
