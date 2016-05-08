package com.jingyunbank.etrade.api.marketing.auction.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.auction.bo.AuctionOrder;

public interface IAuctionOrderService {

	public boolean save(AuctionOrder auctionOrder) throws DataSavingException;
	
	public Optional<AuctionOrder> single(String id);
	
	public Optional<AuctionOrder> singleByOid(String oid);
	
	public List<AuctionOrder> list(String auctionGoodsID, String auctionUserID);
	
}
