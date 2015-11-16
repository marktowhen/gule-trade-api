package com.jingyunbank.etrade.api.vip.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.user.bo.Users;
import com.jingyunbank.etrade.api.vip.bo.CashCoupon;

/**
 * 现金抵用券
 * @author Lenovo
 *
 */
public interface ICashCouponService {

	/**
	 * 管理员新增一张代金券
	 * @param cashCoupon
	 * @return
	 * 2015年11月14日 qxs
	 */
	public boolean save(CashCoupon cashCoupon, Users manager);
	
	/**
	 * 逻辑删除
	 * @param cashCoupon
	 * @param manager
	 * @return
	 * 2015年11月14日 qxs
	 */
	public boolean remove(CashCoupon cashCoupon, Users manager);
	
	/**
	 * 判断是否有效 包括时间和状态
	 * @param code
	 * @return
	 * 2015年11月14日 qxs
	 */
	public boolean isValid(String code);
	
	/**
	 * 查看详情
	 * @param cashCoupon
	 * @return
	 * 2015年11月14日 qxs
	 */
	public CashCoupon getSingle(CashCoupon cashCoupon);
	/**
	 * 查询 不关注是否有效
	 * @param cashCoupon
	 * @return
	 * 2015年11月14日 qxs
	 */
	public List<CashCoupon> listAll(CashCoupon cashCoupon);
	/**
	 * 列表查询 不关注是否有效
	 * @param cashCoupon
	 * @param range
	 * @return
	 * 2015年11月14日 qxs
	 */
	public List<CashCoupon> listAll(CashCoupon cashCoupon, Range range);
	/**
	 * 查询 有效期内未删除的
	 * @param cashCoupon
	 * @return
	 * 2015年11月14日 qxs
	 */
	public List<CashCoupon> listValid(CashCoupon cashCoupon);
	/**
	 * 查询 有效期内未删除的
	 * @param cashCoupon
	 * @param range
	 * @return
	 * 2015年11月14日 qxs
	 */
	public List<CashCoupon> listValid(CashCoupon cashCoupon, Range range);
}

