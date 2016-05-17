package com.jingyunbank.etrade.api.marketing.rankgroup.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Result;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupUser;
import com.jingyunbank.etrade.api.marketing.rankgroup.bo.RankGroup;
import com.jingyunbank.etrade.api.marketing.rankgroup.bo.RankGroupGoods;
import com.jingyunbank.etrade.api.marketing.rankgroup.bo.RankGroupUser;
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
	 * 根据团购商品ID  rankgroupgoods 表 ID 查询团购信息
	 * @param groupid
	 * @return
	 */
	public Optional<RankGroup> singleByGroupGoodID(String groupGoodID) ;
	
	/**
	 * 参团页详情
	 * @param groupid
	 * @return
	 */
	public Optional<RankGroup> joinDetail(String groupGoodID) ;

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
	
	/**
	 * 保存团购
	 * @param group
	 * @return
	 * @throws DataSavingException
	 */
	public boolean save(RankGroup group) throws DataSavingException;
	/**
	 * 支付失败
	 * @param order
	 * @throws DataRefreshingException
	 */
	public void payFail(Orders order) throws DataRefreshingException;
	
	/**
	 * 支付成功
	 * @param order
	 * @throws DataRefreshingException
	 */
	public void paySuccess(Orders order) throws DataRefreshingException;
	
	/**
	 * 解散
	 * @param group
	 * @throws DataRefreshingException
	 * @throws DataSavingException
	 */
	public void dismiss(RankGroup group) throws DataRefreshingException, DataSavingException;
	
	 /**
	  * 支付超时
	  * @param groupUser
	  * @throws DataRefreshingException
	  * @throws DataSavingException
	  */
	public void payTimeout(RankGroupUser groupUser) throws DataRefreshingException, DataSavingException;
	/**
	 * 开团成功
	 * @param group
	 * @throws DataRefreshingException
	 */
	public void startSuccess(RankGroup group) throws DataRefreshingException;
	/**
	 * 更新团购状态
	 * @param ID
	 * @param status
	 * @return
	 * @throws DataRefreshingException
	 */
	public boolean refreshStatus(String ID, String status) throws DataRefreshingException;
	
 
	 /**
	  * 退款并通知
	  * @param groupUserList
	  * @throws DataRefreshingException
	  * @throws DataSavingException
	  */
	public void refound(List<RankGroupUser> groupUserList) throws DataRefreshingException, DataSavingException;
	
	
	
	
}
