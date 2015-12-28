package com.jingyunbank.etrade.api.order.presale.service.context;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface IOrderRobotService {

	/**
	 * 自动关闭未支付的超时订单(24hr)
	 * @throws DataRefreshingException
	 * @throws DataSavingException
	 */
	public void closeUnpaid() throws DataRefreshingException, DataSavingException;
	/**
	 * 自动确认收货，如果买家长期不完成确认收货的操作，则自动完成
	 * @throws DataRefreshingException
	 * @throws DataSavingException
	 */
	public void autoReceive() throws DataRefreshingException, DataSavingException;
	
}
