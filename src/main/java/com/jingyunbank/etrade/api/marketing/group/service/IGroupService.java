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
	 * 查询出 到期的团购
	 * @param minute 分钟数
	 * @return
	 * 2016年4月26日 qxs
	 */
	public List<Group> listOnDeadline();

	/**
	 * 查出刚刚召集成功的团
	 * @return
	 * 2016年4月26日 qxs
	 */
	public List<Group> listOnSuccess();

	/**
	 * 查出开团失败的  即团长支付失败
	 * @return
	 * 2016年4月26日 qxs
	 */
	public List<Group> listStartFail();
	/**
	 * 召集超时
	 * @return
	 * 2016年4月26日 qxs
	 */
	public List<Group> listConveneTimeOut();

	/**
	 * 开团成功的
	 * @return
	 * 2016年4月26日 qxs
	 */
	public List<Group> listStartSuccess();
	/**
	 * 查出对应团的信息和团商品的信息
	 * @param id
	 * @param status
	 * @return
	 */
	public Optional<Group> getGroupGoods(String id);
}
