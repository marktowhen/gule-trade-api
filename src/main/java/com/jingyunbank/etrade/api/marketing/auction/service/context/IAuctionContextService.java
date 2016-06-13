package com.jingyunbank.etrade.api.marketing.auction.service.context;

import java.math.BigDecimal;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.auction.bo.AuctionGoods;
import com.jingyunbank.etrade.api.marketing.auction.bo.AuctionPriceLog;
import com.jingyunbank.etrade.api.marketing.auction.bo.AuctionUser;
import com.jingyunbank.etrade.api.order.presale.bo.Orders;
import com.jingyunbank.etrade.api.user.bo.Users;

public interface IAuctionContextService {
	
	/**
	 * 报名
	 * @param auctionUser
	 * @param orders
	 * @return
	 */
	public boolean signUp(AuctionUser auctionUser,Orders orders) throws DataSavingException, DataRefreshingException;
    
	
	/**
	 * 交保证金获取 竞标资格
	 * @param user
	 * @param auctionGoods
	 * @return
	 * 2016年5月4日 qxs
	 */
	public boolean addDeposit(Users user, AuctionGoods auctionGoods) ;
	
	
	/**
	 * 立即支付
	 * @param orders
	 * @return
	 */
	public boolean payFinal(AuctionUser auctionUser,Orders orders) throws DataSavingException, DataRefreshingException;
	
	/**
	 * 投标
	 * @param auctionUser
	 * @param price
	 * @return
	 * 2016年5月5日 qxs
	 */
	public boolean submitTender(AuctionUser auctionUser, BigDecimal price );
	
	/**
	 * 出价
	 * @param priceLog
	 * @return
	 */
	public boolean bidding(AuctionPriceLog priceLog);
	
	/**
	 * 延时
	 * @param priceLog
	 * @return
	 */
	public void delayed(String auctionid) throws DataRefreshingException;
	
	/**
	 * 到期 
	 * @return
	 */
	public void expire();
	
	/**
	 * 未中标归还保证金
	 * @param auctionUser
	 * @return
	 * 2016年5月5日 qxs
	 */
	public boolean refoundDeposit(AuctionUser auctionUser);
	
	/**
	 * 支付尾款
	 * @param bargainee 买家
	 * @param goods 竞拍商品
	 * @return
	 * 2016年5月5日 qxs
	 */
	public boolean payBalance(Users bargainee, AuctionGoods goods);
	
	/**
	 * 支付尾款超时 
	 * @return
	 * 2016年5月5日 qxs
	 */
	public boolean payBalanceTimeout(AuctionGoods goods);
	
	
	
	
}
