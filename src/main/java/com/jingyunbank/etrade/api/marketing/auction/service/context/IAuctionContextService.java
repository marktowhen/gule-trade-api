package com.jingyunbank.etrade.api.marketing.auction.service.context;

import java.math.BigDecimal;

import com.jingyunbank.etrade.api.marketing.auction.bo.AuctionGoods;
import com.jingyunbank.etrade.api.marketing.auction.bo.AuctionUser;
import com.jingyunbank.etrade.api.user.bo.Users;

public interface IAuctionContextService {

	/**
	 * 交保证金获取 竞标资格
	 * @param user
	 * @param auctionGoods
	 * @return
	 * 2016年5月4日 qxs
	 */
	public boolean addDeposit(Users user, AuctionGoods auctionGoods) ;
	
	/**
	 * 投标
	 * @param auctionUser
	 * @param price
	 * @return
	 * 2016年5月5日 qxs
	 */
	public boolean submitTender(AuctionUser auctionUser, BigDecimal price );
	
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
