package com.jingyunbank.etrade.api.marketing.rankgroup.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupUser;
import com.jingyunbank.etrade.api.marketing.rankgroup.bo.RankGroupUser;
import com.jingyunbank.etrade.api.user.bo.Users;

public interface IRankGroupUserService {
	
	
	/**
	 * 查询团购数量 
	 * @param groupID
	 * @param status
	 * @return
	 */
	public Integer count(String groupID, String status);
	
	/**
	 * 发送通知到用户
	 * @param user
	 * @param message
	 * @return
	 */
	public boolean sendMessage(Users user,String message);
	
	public boolean save(RankGroupUser groupUser) throws DataSavingException;
	
    public Optional<RankGroupUser> single(String ID);
	
	public List<RankGroupUser> list(String groupID);
	
	public List<RankGroupUser> list(String groupID, String status);
	
	public boolean refreshStatus(String ID, String status) throws DataRefreshingException;
	
    /**
     * 更新参团人状态
     * @param ID
     * @param currentStatus
     * @param flowStatusFlag
     * @return
     * @throws DataRefreshingException
     */
	public boolean refreshStatus(String ID, String currentStatus, String flowStatusFlag) throws DataRefreshingException;
	/**
	 * 发送用户通知
	 * @param user
	 * @param message
	 */
	public void notice(RankGroupUser user, String message);
	/**
	 * 查询未支付的参团人
	 * @return
	 */
	public List<RankGroupUser> listUnPay();
	
	/**
	 * 根据团购id和参团人支付状态 查询未支付订金或未支付尾款人
	 * @param gid
	 * @param status
	 * @return
	 */
	public List<RankGroupUser> listUnPay(String gid,String status);
}
