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
import com.jingyunbank.etrade.api.vip.coupon.bo.CashCoupon;

/**
 * 现金抵用券
 * @author Lenovo
 *
 */
public interface ICashCouponService {
	

	/**
	 * 管理员新增一张代金券
	 * @param cashCoupon
	 * @param manager 记录日志做准备
	 * @return
	 * 2015年11月14日 qxs
	 */
	public CashCoupon save(CashCoupon cashCoupon, Users manager) throws DataSavingException;
	
	/**
	 * 新增多张券
	 * @param cashCoupon
	 * @param manager
	 * @param amount
	 * 2015年12月9日 qxs
	 * @throws DataSavingException 
	 */
	public List<CashCoupon> saveMuti(CashCoupon cashCoupon, Users manager, int amount) throws DataSavingException;
	
	/**
	 * 逻辑删除
	 * @param code 编码
	 * @param manager 记录日志做准备
	 * @return
	 * 2015年11月14日 qxs
	 */
	public boolean remove(String code, Users manager) throws DataRemovingException;
	
	/**
	 * 判断是否可被激活 
	 * 未删除、未使用、未过期
	 * @param code
	 * @return
	 * 2015年11月14日 qxs
	 */
	public Result<CashCoupon> canActive(String code);
	
	/**
	 * 查看详情
	 * @param code
	 * @return
	 * 2015年11月14日 qxs
	 */
	public CashCoupon singleByCode(String cashCoupon);
	/**
	 * 查看详情
	 * @param code
	 * @return
	 * 2015年11月14日 qxs
	 */
	public CashCoupon singleByID(String id);
	/**
	 * 查询一段时间内新增的券
	 * @param addTimeFrom
	 * @param addTimeTo
	 * @param range
	 * @return
	 * 2015年12月14日 qxs
	 */
	public List<CashCoupon> list(Date addTimeFrom, Date addTimeTo, Range range);
	/**
	 * 查询数量
	 * @param cashCoupon
	 * @return
	 * 2015年11月19日 qxs
	 */
	public int count(Date addTimeFrom, Date addTimeTo);
	
	/**
	 * 激活一张卡 将其改为已使用状态
	 * @param code
	 * @return
	 * 2015年11月17日 qxs
	 * @throws DataRefreshingException 
	 */
	public boolean activeCoupon(String code) throws DataRefreshingException;

	/**
	 * 列表展示
	 * @param cardNum
	 * @param value
	 * @param locked
	 * @param range
	 * @return
	 * 2015年12月29日 qxs
	 */
	public List<CashCoupon> list(String cardNum, BigDecimal value,
			Boolean locked, Range range);
	
	/**
	 * 查询数量
	 * @param cashCoupon
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

	public List<CashCoupon> list(String cardNum,
			String cardNumStart, String cardNumEnd, BigDecimal value,
			Boolean locked, Range range);

	public int count(String cardNum, String cardNumStart, String cardNumEnd,
			BigDecimal value, Boolean locked);

}

