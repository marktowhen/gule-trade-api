package com.jingyunbank.etrade.api.group.service.context;

import com.jingyunbank.etrade.api.group.bo.Group;
import com.jingyunbank.etrade.api.user.bo.Users;

public interface IGroupPurchaseContextService {

	/**
	 * 开团
	 * @param leader
	 * @param group
	 */
	public void start(Users leader, Group group);
	/**
	 * 加入该团
	 * @param user
	 * @param group
	 */
	public void join(Users user, Group group);
	/**
	 * 1，满团，提醒用户支付尾款
	 * 2，未满团，为用户退换订金，并提醒用户
	 * @param group
	 */
	public void expire(Group group);
	
}
