package com.jingyunbank.etrade.api.marketing.group.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupGoods;

public interface IGroupGoodsService {

	public void save(GroupGoods goods) throws DataSavingException;
	
	public Optional<GroupGoods> single(String ggid) ;
	
}
