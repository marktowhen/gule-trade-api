package com.jingyunbank.etrade.api.vip.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.user.bo.Users;
import com.jingyunbank.etrade.api.vip.bo.DiscountCoupon;

public interface IDiscountCouponService {
	/**
	 * 管理员新增一张代金券
	 * @param DiscountCoupon
	 * @return
	 * 2015年11月14日 qxs
	 */
	public boolean save(DiscountCoupon discountCoupon, Users manager);
	
	/**
	 * 逻辑删除
	 * @param DiscountCoupon
	 * @param manager
	 * @return
	 * 2015年11月14日 qxs
	 */
	public boolean remove(DiscountCoupon discountCoupon, Users manager);
	
	/**
	 * 判断是否有效 包括时间和状态
	 * @param code
	 * @return
	 * 2015年11月14日 qxs
	 */
	public boolean isValid(String code);
	
	/**
	 * 查看详情
	 * @param DiscountCoupon
	 * @return
	 * 2015年11月14日 qxs
	 */
	public DiscountCoupon getSingle(DiscountCoupon discountCoupon);
	/**
	 * 查询 不关注是否有效
	 * @param DiscountCoupon
	 * @return
	 * 2015年11月14日 qxs
	 */
	public List<DiscountCoupon> listAll(DiscountCoupon discountCoupon);
	/**
	 * 列表查询 不关注是否有效
	 * @param DiscountCoupon
	 * @param range
	 * @return
	 * 2015年11月14日 qxs
	 */
	public List<DiscountCoupon> listAll(DiscountCoupon discountCoupon, Range range);
	/**
	 * 查询 有效期内未删除的
	 * @param DiscountCoupon
	 * @return
	 * 2015年11月14日 qxs
	 */
	public List<DiscountCoupon> listValid(DiscountCoupon discountCoupon);
	/**
	 * 查询 有效期内未删除的
	 * @param DiscountCoupon
	 * @param range
	 * @return
	 * 2015年11月14日 qxs
	 */
	public List<DiscountCoupon> listValid(DiscountCoupon discountCoupon, Range range);
}
