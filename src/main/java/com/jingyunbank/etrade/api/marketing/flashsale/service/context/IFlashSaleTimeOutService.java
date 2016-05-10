package com.jingyunbank.etrade.api.marketing.flashsale.service.context;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface IFlashSaleTimeOutService{
	/**
	 * 支付超时的处理
	 */
	public void payTimeout();
}
