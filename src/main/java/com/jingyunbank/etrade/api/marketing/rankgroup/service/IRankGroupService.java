package com.jingyunbank.etrade.api.marketing.rankgroup.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Result;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.group.bo.Group;
import com.jingyunbank.etrade.api.marketing.rankgroup.bo.RankGroup;
import com.jingyunbank.etrade.api.marketing.rankgroup.bo.RankGroupGoods;
import com.jingyunbank.etrade.api.order.presale.bo.Orders;
import com.jingyunbank.etrade.api.user.bo.Users;

public interface IRankGroupService {
	
	/**
	 * 团长开团
	 * @param leader
	 * @param group
	 * @param orders
	 * @throws DataSavingException
	 * @throws DataRefreshingException
	 */
	public void start(Users leader, RankGroup group, Orders orders) throws DataSavingException, DataRefreshingException;
	
	
	/**
	 * 参团
	 * @param user
	 * @param group
	 * @param orders
	 * @throws DataSavingException
	 * @throws DataRefreshingException
	 */
	public void join(Users user, RankGroup group, Orders orders) throws DataSavingException, DataRefreshingException;
	
	/**
	 * 查询截止日期团购
	 * @return
	 */
	public List<RankGroup> listOnDeadline();
	
	/**
	 * 验证开团条件
	 * @param groupGoods
	 * @return
	 */
	public Result<String> startMatch(RankGroupGoods groupGoods);
	
	/**
	 * 查询团购信息
	 * @param groupid
	 * @return
	 */
	public Optional<RankGroup> single(String groupid) ;

	/**
	 * 验证参团条件
	 * @param group
	 * @return
	 */
	public Result<String> joinMatch(RankGroup group);
	
	/**
	 * 是否满团  用于在支付尾款前判断
	 * @param groupID
	 * @return
	 */
	public boolean full(String groupID);
	
	public boolean save(RankGroup group) throws DataSavingException;
}
