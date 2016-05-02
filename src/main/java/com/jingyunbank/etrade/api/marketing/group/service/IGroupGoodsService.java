package com.jingyunbank.etrade.api.marketing.group.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupGoods;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupGoodsShow;

public interface IGroupGoodsService {

	public void save(GroupGoods goods) throws DataSavingException;
	
	public Optional<GroupGoods> single(String id) ;
	
	public List<GroupGoodsShow> list(String MID, Range range) ;
	
	public Optional<GroupGoods> singleByGroupID(String groupID) ;

	public void refresh(GroupGoods goodsbo) throws DataRefreshingException;
	
}
