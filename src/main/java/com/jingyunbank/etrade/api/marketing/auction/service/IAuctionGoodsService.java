package com.jingyunbank.etrade.api.marketing.auction.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.auction.bo.AuctionGoods;

public interface IAuctionGoodsService {

	public boolean save(AuctionGoods goods) throws DataSavingException;
	
	public boolean refreshStatus(String auctionGoodsID, String status) throws DataRefreshingException;
	
	public Optional<AuctionGoods> single(String ID);
	
	public List<AuctionGoods> list(Range range);
	/**
	 * 交易成功后修改成交价
	 * @param auctionGoodsID
	 * @param soldPrice
	 * @return
	 * 2016年5月4日 qxs
	 * @throws DataRefreshingException 
	 */
	public boolean refreshSoldPrice(String auctionGoodsID, BigDecimal soldPrice, String soldUID) throws DataRefreshingException;
	
	/**
	 * 延迟结束一次
	 * @param auctionGoods
	 * @return
	 * @throws DataRefreshingException
	 * 2016年5月4日 qxs
	 */
	public boolean delay(AuctionGoods auctionGoods) throws DataRefreshingException;
	
	/**
	 * 是否结束
	 * @param auctionGoodsID
	 * @return
	 * 2016年5月5日 qxs
	 */
	public boolean isOver(String auctionGoodsID);

	public int count();
	
	
}
