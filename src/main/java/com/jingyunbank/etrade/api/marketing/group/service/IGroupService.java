package com.jingyunbank.etrade.api.marketing.group.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.group.bo.Group;

public interface IGroupService {

	public Optional<Group> single(String groupid) ;
	
	public boolean save(Group group) throws DataSavingException;
	
	public boolean refreshStatus(String ID, String status) throws DataRefreshingException;
	
	public boolean isLeader(String groupID, String uid);
	
	public boolean full(String groupID);
}
