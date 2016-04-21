package com.jingyunbank.etrade.api.marketing.group.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupOrder;

public interface IGroupOrderService {
	
	public boolean save(GroupOrder groupOrder) throws DataSavingException;
	
	public Optional<GroupOrder> single(String ID);
	
	public List<GroupOrder> list(String groupUserID);
	

}
