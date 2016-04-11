package com.jingyunbank.etrade.api.group.service.context;

import java.util.List;

import com.jingyunbank.etrade.api.group.bo.Group;
import com.jingyunbank.etrade.api.group.bo.GroupGoods;
import com.jingyunbank.etrade.api.user.bo.Users;

public interface IGroupPurchaseContextService {

	public void start(Users leader, Group group);
	
	public void join(Users user, Group group);
	
	public void expire(Group group);
	
}
