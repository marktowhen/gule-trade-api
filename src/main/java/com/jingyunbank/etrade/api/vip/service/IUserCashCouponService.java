package com.jingyunbank.etrade.api.vip.service;

import java.util.List;

import com.jingyunbank.core.Range;
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
	 * 查询未使用的有效抵用券
	 * @param cashCoupon
	 * @return
	 * 2015年11月14日 qxs
	 */
	public List<UserCashCoupon> getUnusedCoupon(UserCashCoupon userCoupon, Range range);

	/**
	 * 消费
	 * @param couponId
	 * @param oid
	 * @return
	 * 2015年11月17日 qxs
	 * @throws DataRefreshingException 
	 */
	public boolean consume(String couponId, String oid) throws DataRefreshingException;
	
	
}
