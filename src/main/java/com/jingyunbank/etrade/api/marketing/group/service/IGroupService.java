package com.jingyunbank.etrade.api.marketing.group.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.group.bo.Group;

public interface IGroupService {

	public Optional<Group> single(String groupid) ;
	
	public boolean save(Group group) throws DataSavingException;
	
	public boolean refreshStatus(String ID, String status) throws DataRefreshingException;
	
	/**
	 * 根据currentStatus和flowStatusFlag去flow_status表中查询出下一状态并修改group的状态
	 * @param ID
	 * @param currentStatus
	 * @param flowStatusFlag
	 * @return
	 * @throws DataRefreshingException
	 * 2016年4月25日 qxs
	 */
	public boolean refreshStatus(String ID, String currentStatus, String flowStatusFlag) throws DataRefreshingException;
	
	/**
	 * 是否团长
	 * @param groupID
	 * @param uid
	 * @return
	 * 2016年4月25日 qxs
	 */
	public boolean isLeader(String groupID, String uid);
	/**
	 * 是否满团  用于在支付尾款前判断
	 * @param groupID
	 * @return
	 * 2016年4月25日 qxs
	 */
	public boolean full(String groupID);
	/**
	 * 根据状态查询
	 * @param status
	 * @return
	 * 2016年4月25日 qxs
	 */
	public List<Group> list(String status);

	/**
	 * 形成尾款订单
	 * @param group
	 * 2016年4月25日 qxs
	 */
	public void addBalancePayment(Group group);
}
