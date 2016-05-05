package com.jingyunbank.etrade.api.marketing.auction.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.auction.bo.AuctionUser;

public interface IAuctionUserService {

	public boolean save(AuctionUser aUser) throws DataSavingException;
	
	public boolean refreshStatus(String auctionUserID, String status) throws DataRefreshingException;
	
	public List<AuctionUser> list(String auctionID);
	
	public int count(String auctionID);
	
	public Optional<AuctionUser> single(String auctionUserID);
}
