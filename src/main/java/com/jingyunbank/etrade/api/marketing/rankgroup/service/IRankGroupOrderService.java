package com.jingyunbank.etrade.api.marketing.rankgroup.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.rankgroup.bo.RankGroupOrder;

public interface IRankGroupOrderService {
	
	
	public boolean save(RankGroupOrder groupOrder) throws DataSavingException;
	
	public Optional<RankGroupOrder> singleByOID( String OID);
	
    /**
     * 查询订金或尾款订单
     * @param groupUserID
     * @param orderType
     * @return
     */
	public Optional<RankGroupOrder> single(String groupUserID, String orderType);

}
