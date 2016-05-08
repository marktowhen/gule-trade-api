package com.jingyunbank.etrade.api.marketing.auction.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.auction.bo.AuctionPriceLog;

public interface IAuctionPriceLog {
	
	public boolean save(AuctionPriceLog priceLog ) throws DataSavingException;
	
	public Optional<AuctionPriceLog> single(String id);
	
	public List<AuctionPriceLog> list(String auctionGoodsID);
	
	public int count(String auctionGoodsID);
	
	public List<AuctionPriceLog> list(String auctionGoodsID, String UID);
	
	public int count(String auctionGoodsID, String UID);

}
