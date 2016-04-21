package com.jingyunbank.etrade.api.marketing.group.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupUser;

public interface IGroupUserService {

	public boolean save(GroupUser groupUser) throws DataSavingException;
	
	public Optional<GroupUser> single(String ID);
	
	public List<GroupUser> list(String groupID);
}
