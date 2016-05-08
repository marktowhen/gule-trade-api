package com.jingyunbank.etrade.api.marketing.flashsale.service.context;

import com.jingyunbank.core.Result;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.flashsale.bo.FlashSale;
import com.jingyunbank.etrade.api.marketing.flashsale.bo.FlashSaleUser;
import com.jingyunbank.etrade.api.order.presale.bo.Orders;
import com.jingyunbank.etrade.api.user.bo.Users;

public interface IFlashSalePurchaseContextService {
	/**
	 * 秒杀活动是否可以开始
	 * @param flashsale
	 * @return
	 */
	public Result<String> checkStart(FlashSale flashsale);
	
	/**
	 * 开始秒杀
	 * @param user
	 * @param flashSaleUser
	 * @param orders
	 * @throws DataSavingException
	 * @throws DataRefreshingException
	 */
	public void startSale(Users user,FlashSaleUser flashSaleUser,Orders orders)throws DataSavingException, DataRefreshingException;
	
	/**
	 * 支付成功！
	 * @param order
	 * @throws DataRefreshingException
	 */
	public void paySuccess(Orders order) throws DataRefreshingException;
	/**
	 * 支付失败
	 * @param order
	 * @throws DataRefreshingException
	 */
	public void payFail(Orders order)throws DataRefreshingException;
}
