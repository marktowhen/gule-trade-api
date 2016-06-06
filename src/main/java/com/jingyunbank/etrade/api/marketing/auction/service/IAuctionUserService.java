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
	
	/**
	 * 根据用户id 竞拍id 确定唯一参拍人
	 * @param auctinoid
	 * @param userid
	 * @return
	 */
	public Optional<AuctionUser> selByUserId(String auctionid,String userid);
	
	/**
	 * 我的竞拍
	 * @param userid
	 * @param status
	 * @return
	 */
	public List<AuctionUser> selMyAuction(String userid,String status);
	
	/**
	 * 是否报名
	 * @param auctionid
	 * @param uid
	 * @return
	 */
	public int ifSign(String auctionid,String uid);
}
