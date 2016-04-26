package com.jingyunbank.etrade.api.marketing.group.service.context;

import java.util.List;

import com.jingyunbank.core.Result;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.group.bo.Group;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupGoods;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupUser;
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
	public void start(Users leader, Group group, Orders orders) throws DataSavingException, DataRefreshingException;
	/**
	 * 加入该团
	 * @param user
	 * @param group
	 * @throws DataSavingException 
	 * @throws DataRefreshingException 
	 */
	public void join(Users user, Group group, Orders orders) throws DataSavingException, DataRefreshingException;
	
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
	
	/**
	 * 支付成功/失败
	 * @param order
	 * 2016年4月22日 qxs
	 * @throws DataRefreshingException 
	 */
	public void payFinish(Orders order) throws DataRefreshingException;
	
	/**
	 * 退款 并提醒用户
	 * @param groupUserList
	 * 2016年4月25日 qxs
	 * @throws DataRefreshingException 
	 * @throws DataSavingException 
	 */
	public void refound(List<GroupUser> groupUserList) throws DataRefreshingException, DataSavingException;
	
	/**
	 * 满团
	 * @param group
	 * 2016年4月26日 qxs
	 * @throws DataRefreshingException 
	 */
	public void fullMission(Group group) throws DataRefreshingException;
	
	
	/**
	 * 解散
	 * @param group
	 * 2016年4月26日 qxs
	 * @throws DataRefreshingException 
	 * @throws DataSavingException 
	 */
	public void dismiss(Group group) throws DataRefreshingException, DataSavingException;
	
	/**
	 * 支付超时
	 * @param group
	 * 2016年4月26日 qxs
	 * @throws DataSavingException 
	 * @throws DataRefreshingException 
	 */
	public void payTimeout(GroupUser groupUser) throws DataRefreshingException, DataSavingException;
	/**
	 * 开团
	 * @param group
	 * 2016年4月26日 qxs
	 * @throws DataRefreshingException 
	 */
	public void startSuccess(Group group) throws DataRefreshingException;
	
	
	
}
