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
	public List<UserDiscountCoupon> listUnusedCoupon(String uid, Range range);


	/**
	 * 用户未使用的未过期抵用券数量
	 * @param bo
	 * @return
	 * 2015年11月19日 qxs
	 */
	int countUnusedCoupon(String uid);
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
	 * @return UserDiscountCoupon 附: 其中的discountCoupon属性包含抵用券信息
	 * 2015年11月20日 qxs
	 */
	public Result<UserDiscountCoupon> canConsume(String couponId, String uid, BigDecimal orderPrice);
	
	/**
	 * 消费
	 * @param couponId
	 * @param uid
	 * @return
	 * 2015年11月17日 qxs
	 * @throws DataRefreshingException 
	 */
	boolean consume(String couponId, String uid) throws DataRefreshingException;

	
	/**
	 * 已消费的数量
	 * @param uid
	 * @return
	 * 2015年12月3日 qxs
	 */
	int countConsumedCoupon(String uid);
	/**
	 * 已消费的列表
	 * @param uid
	 * @param range
	 * @return
	 * 2015年12月3日 qxs
	 */
	List<UserDiscountCoupon> listConsumedCoupon(String uid, Range range);
	
	/**
	 * 已过期的数量
	 * @param uid
	 * @return
	 * 2015年12月3日 qxs
	 */
	int countOverdueCoupon(String uid);
	/**
	 * 已过期的列表
	 * @param uid
	 * @param range
	 * @return
	 * 2015年12月4日 qxs
	 */
	List<UserDiscountCoupon> listOverdueCoupon(String uid, Range range);
	
	/**
	 * 当前可用数量
	 * @param uid
	 * @return
	 * 2015年12月3日 qxs
	 */
	int countUseableCoupon(String uid);
	
	/**
	 * 当前可用的列表
	 * @param uid
	 * @param range
	 * @return
	 * 2015年12月4日 qxs
	 */
	List<UserDiscountCoupon> listUseableCoupon(String uid, Range range);
	

}
