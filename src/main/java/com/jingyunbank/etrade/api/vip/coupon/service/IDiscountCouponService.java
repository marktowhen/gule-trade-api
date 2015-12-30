package com.jingyunbank.etrade.api.vip.coupon.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.core.Result;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.user.bo.Users;
import com.jingyunbank.etrade.api.vip.coupon.bo.DiscountCoupon;

public interface IDiscountCouponService {
	
	/**
	 * 50元抵用券卡号前缀
	 */
	String CARD_NUM_PRIFIX_50 = "D";
	/**
	 * 管理员新增一张抵用券
	 * @param DiscountCoupon
	 * @return
	 * 2015年11月14日 qxs
	 * @throws DataSavingException 
	 */
	public boolean save(DiscountCoupon discountCoupon, Users manager) throws DataSavingException;
	
	/**
	 * 新增多张券
	 * @param discountCoupon
	 * @param manager
	 * @param amount
	 * @return
	 * @throws DataSavingException
	 * 2015年12月9日 qxs
	 */
	public boolean saveMuti(DiscountCoupon discountCoupon, Users manager, int amount) throws DataSavingException;
	
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
	public Result<DiscountCoupon> canActive(String code);
	
	/**
	 * 查看详情
	 * @param code
	 * @return
	 * 2015年11月14日 qxs
	 */
	public DiscountCoupon singleByCode(String code);
	
	/**
	 * 查看详情
	 * @param id
	 * @return
	 * 2015年11月14日 qxs
	 */
	public DiscountCoupon singleByID(String id);
	/**
	 * 列表查询 不关注是否有效
	 * @param DiscountCoupon
	 * @param range
	 * @return
	 * 2015年11月14日 qxs
	 */
	public List<DiscountCoupon> list(Date addTimeFrom, Date addTImeTo, Range range);
	
	/**
	 * 查询数量
	 * @param DiscountCoupon
	 * @return
	 * 2015年11月19日 qxs
	 */
	public int count(Date addTimeFrom, Date addTImeTo);
	/**
	 * 激活
	 * @param code
	 * @return
	 * @throws DataRefreshingException
	 * 2015年11月17日 qxs
	 */
	public boolean active(String code) throws DataRefreshingException ;

	/**
	 * 列表展示
	 * @param cardNum
	 * @param value
	 * @param locked
	 * @param range
	 * @return
	 * 2015年12月29日 qxs
	 */
	public List<DiscountCoupon> list(String cardNum, BigDecimal value,
			Boolean locked, Range range);
	
	/**
	 * 查询数量
	 * @param DiscountCoupon
	 * @return
	 * 2015年11月19日 qxs
	 */
	public int count(String cardNum, BigDecimal value,Boolean locked);

	/**
	 * 解锁
	 * @param ids
	 * 2015年12月29日 qxs
	 */
	public boolean unlock(String[] ids);

}
