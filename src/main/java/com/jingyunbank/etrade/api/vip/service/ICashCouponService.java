package com.jingyunbank.etrade.api.vip.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.core.Result;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
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
	public boolean save(CashCoupon cashCoupon, Users manager) throws DataSavingException;
	
	/**
	 * 逻辑删除
	 * @param cashCoupon
	 * @param manager
	 * @return
	 * 2015年11月14日 qxs
	 */
	public boolean remove(String code, Users manager) throws DataRemovingException;
	
	/**
	 * 判断是否可被激活 
	 * 未删除、未使用、在有效期内
	 * @param code
	 * @return
	 * 2015年11月14日 qxs
	 */
	public Result isValid(String code);
	
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
	 * 激活一张卡 将其改为已使用状态
	 * @param code
	 * @return
	 * 2015年11月17日 qxs
	 * @throws DataRefreshingException 
	 */
	public boolean activeCoupon(String code) throws DataRefreshingException;
}

