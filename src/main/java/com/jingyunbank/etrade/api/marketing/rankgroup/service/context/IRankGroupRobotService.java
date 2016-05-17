package com.jingyunbank.etrade.api.marketing.rankgroup.service.context;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface IRankGroupRobotService {
	/**
	 * 关闭团长支付超时导致开团失败的团购
	 * 
	 * @throws DataRefreshingException 
	 */
	public void closeUnstartGroup() ;
	
	/**
	 * 开团成功
	 * 
	 */
	public void startSuccess();
	
	/**
	 * 关闭召集失败的团购 并退还押金
	 * 
	 * @throws DataRefreshingException 
	 * @throws DataSavingException 
	 */
	public void closeConveneFailGroup() ;
	
	/**
	 * 支付超时 
	 * 
	 * @throws DataRefreshingException 
	 * @throws DataSavingException 
	 */
	public void payTimeout() ;
	
	/**
	 * 到期
	 * 
	 * @throws DataRefreshingException 
	 * @throws DataSavingException 
	 */
	public void expire() ;
	
	/**
	 * 组团成功
	 * 
	 */
	public void finish();

	
}
