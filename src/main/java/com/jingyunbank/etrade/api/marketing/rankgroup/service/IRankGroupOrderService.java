package com.jingyunbank.etrade.api.marketing.rankgroup.service;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.rankgroup.bo.RankGroupOrder;

public interface IRankGroupOrderService {
	
	
	public boolean save(RankGroupOrder groupOrder) throws DataSavingException;

}
