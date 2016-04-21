package com.jingyunbank.etrade.api.marketing.group.service.context;

import java.util.List;

import com.jingyunbank.core.Result;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.group.bo.Group;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupGoods;
import com.jingyunbank.etrade.api.order.presale.bo.Orders;
import com.jingyunbank.etrade.api.user.bo.Users;

public interface IGroupPurchaseContextService {

	/**
	 * 开团
	 * @param leader
	 * @param group
	 * @param orders 
	 * @throws DataSavingException 
	 * @throws DataRefreshingException 
	 */
	public void start(Users leader, Group group, List<Orders> orders) throws DataSavingException, DataRefreshingException;
	/**
	 * 加入该团
	 * @param user
	 * @param group
	 * @throws DataSavingException 
	 * @throws DataRefreshingException 
	 */
	public void join(Users user, Group group, List<Orders> orders) throws DataSavingException, DataRefreshingException;
	/**
	 * 1，满团，提醒用户支付尾款
	 * 2，未满团，为用户退换订金，并提醒用户
	 * @param group
	 */
	public void expire(Group group);
	
	/**
	 * 是否满足开团条件
	 * @param groupGoods
	 * @return
	 * 2016年4月21日 qxs
	 */
	public Result<String> startMatch(GroupGoods groupGoods);
	
	/**
	 * 是否满足开团条件
	 * @param groupGoods
	 * @return
	 * 2016年4月21日 qxs
	 */
	public Result<String> joinMatch(Group group);
	
	
	
}
