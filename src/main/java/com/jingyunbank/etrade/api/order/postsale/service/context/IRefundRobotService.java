package com.jingyunbank.etrade.api.order.postsale.service.context;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface IRefundRobotService {
	/**
	 * 自动接受买家的退款退货申请。（超过10天未处理的）
	 * @throws DataRefreshingException
	 * @throws DataSavingException
	 */
	public void autoAccept() throws DataRefreshingException, DataSavingException;
	
	/**
	 * 自动完成买家的退货申请。
	 * @throws DataRefreshingException
	 * @throws DataSavingException
	 */
	public void autoDone() throws DataRefreshingException, DataSavingException;
}
