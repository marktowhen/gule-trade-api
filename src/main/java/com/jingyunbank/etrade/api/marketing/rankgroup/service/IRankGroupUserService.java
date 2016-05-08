package com.jingyunbank.etrade.api.marketing.rankgroup.service;

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

}
