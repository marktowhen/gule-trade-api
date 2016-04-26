package com.jingyunbank.etrade.api.marketing.group.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupUser;

public interface IGroupUserService {

	public boolean save(GroupUser groupUser) throws DataSavingException;
	
	public Optional<GroupUser> single(String ID);
	
	public List<GroupUser> list(String groupID);
	
	public List<GroupUser> list(String groupID, String status);
	
	public boolean refreshStatus(String ID, String status) throws DataRefreshingException;
	
	/**
	 * 根据currentStatus和flowStatusFlag去flow_status表中查询出下一状态并修改group_user的状态
	 * @param ID
	 * @param currentStatus
	 * @param flowStatusFlag
	 * @return
	 * @throws DataRefreshingException
	 * 2016年4月25日 qxs
	 */
	public boolean refreshStatus(String ID, String currentStatus, String flowStatusFlag) throws DataRefreshingException;

	public Optional<GroupUser> single(String groupID, String uid);

	/**
	 * 未支付的用户
	 * @return
	 * 2016年4月25日 qxs
	 */
	public List<GroupUser> listUnPay();

	
	/**
	 * 通知
	 * @param user
	 * @param message
	 * 2016年4月26日 qxs
	 */
	public void notice(GroupUser user, String message);


}
