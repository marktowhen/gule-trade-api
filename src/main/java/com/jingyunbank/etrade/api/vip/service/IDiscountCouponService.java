package com.jingyunbank.etrade.api.vip.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.core.Result;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.user.bo.Users;
import com.jingyunbank.etrade.api.vip.bo.DiscountCoupon;

public interface IDiscountCouponService {
	/**
	 * 管理员新增一张代金券
	 * @param DiscountCoupon
	 * @return
	 * 2015年11月14日 qxs
	 * @throws DataSavingException 
	 */
	public boolean save(DiscountCoupon discountCoupon, Users manager) throws DataSavingException;
	
	/**
	 * 逻辑删除
	 * @param DiscountCoupon
	 * @param manager
	 * @return
	 * 2015年11月14日 qxs
	 * @throws DataRemovingException 
	 */
	public boolean remove(String code, Users manager) throws DataRemovingException;
	
	/**
	 * 是否可被激活
	 * @param code
	 * @return
	 * 2015年11月14日 qxs
	 */
	public Result canActive(String code);
	
	/**
	 * 查看详情
	 * @param code
	 * @return
	 * 2015年11月14日 qxs
	 */
	public DiscountCoupon getSingleByCode(String code);
	
	/**
	 * 查看详情
	 * @param id
	 * @return
	 * 2015年11月14日 qxs
	 */
	public DiscountCoupon getSingleByID(String id);
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
	 * 查询数量
	 * @param cashCoupon
	 * @return
	 * 2015年11月19日 qxs
	 */
	public int getAmount(DiscountCoupon cashCoupon);
	/**
	 * 激活
	 * @param code
	 * @return
	 * @throws DataRefreshingException
	 * 2015年11月17日 qxs
	 */
	public boolean active(String code) throws DataRefreshingException ;

}
