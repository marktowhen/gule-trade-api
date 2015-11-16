package com.jingyunbank.etrade.api.vip.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.user.bo.Users;
import com.jingyunbank.etrade.api.vip.bo.CashCoupon;


public interface IUserCashCouponService {
	
	/**
	 * 激活
	 * @param code
	 * @param uid
	 * @return
	 * 2015年11月14日 qxs
	 */
	public boolean active(String code, String uid);

	/**
	 * 激活
	 * @param cashCoupon
	 * @param user
	 * @return
	 * 2015年11月14日 qxs
	 */
	public boolean active(CashCoupon cashCoupon, Users user);
	
	/**
	 * 查询未使用的有效抵用券
	 * @param cashCoupon
	 * @return
	 * 2015年11月14日 qxs
	 */
	public List<CashCoupon> unusedCashCoupon(CashCoupon cashCoupon, Range range);
	
	
}
