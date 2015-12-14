package com.jingyunbank.etrade.api.vip.service;

import java.math.BigDecimal;
import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.core.Result;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.user.bo.Users;
import com.jingyunbank.etrade.api.vip.bo.CashCoupon;
import com.jingyunbank.etrade.api.vip.bo.UserCashCoupon;


public interface IUserCashCouponService {
	
	/**
	 * 激活
	 * @param code
	 * @param uid
	 * @return
	 * 2015年11月14日 qxs
	 */
	public boolean active(String code, String uid) throws DataRefreshingException, DataSavingException;

	/**
	 * 激活
	 * @param cashCoupon
	 * @param user
	 * @return
	 * 2015年11月14日 qxs
	 * @throws DataRefreshingException 
	 */
	public boolean active(CashCoupon cashCoupon, Users user) throws DataRefreshingException, DataSavingException;
	
	/**
	 * 用户未使用的未过期抵用券
	 * @param uid
	 * @param range
	 * @return
	 * 2015年11月20日 qxs
	 */
	public List<UserCashCoupon> listUnusedCoupon(String uid, Range range);
	
	
	/**
	 * 查询未使用的未过期抵用券
	 * @param boFromVo
	 * @return
	 * 2015年11月19日 qxs
	 */
	public int countUnusedCoupon(String uid);

	/**
	 * 是否可以消费
	 * @param couponId
	 * @param uid
	 * @param orderPrice
	 * @return UserCashCoupon 返回对象中的cashCoupon属性包含购物金信息
	 * 2015年11月20日 qxs
	 */
	public Result<UserCashCoupon> canConsume(String couponId, String uid, BigDecimal orderPrice);
	/**
	 * 消费
	 * @param couponId
	 * @param uid
	 * @return
	 * 2015年11月17日 qxs
	 * @throws DataRefreshingException 
	 */
	public boolean consume(String couponId, String uid) throws DataRefreshingException;
	
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
	List<UserCashCoupon> listConsumedCoupon(String uid, Range range);
	
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
	List<UserCashCoupon> listOverdueCoupon(String uid, Range range);
	
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
	List<UserCashCoupon> listUseableCoupon(String uid, Range range);
	


	
	
	
}
