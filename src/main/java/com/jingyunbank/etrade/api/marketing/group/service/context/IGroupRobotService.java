package com.jingyunbank.etrade.api.marketing.group.service.context;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface IGroupRobotService {

	/**
	 * 关闭团长支付超时导致开团失败的团购
	 * 
	 * 2016年4月26日 qxs
	 * @throws DataRefreshingException 
	 */
	public void closeUnstartGroup() ;
	
	/**
	 * 开团成功
	 * 
	 * 2016年4月26日 qxs
	 */
	public void startSuccess();
	
	/**
	 * 关闭召集失败的团购 并退还押金
	 * 
	 * 2016年4月26日 qxs
	 * @throws DataRefreshingException 
	 * @throws DataSavingException 
	 */
	public void closeConveneFailGroup() ;
	
	/**
	 * 支付超时 
	 * 
	 * 2016年4月26日 qxs
	 * @throws DataRefreshingException 
	 * @throws DataSavingException 
	 */
	public void payTimeout() ;
	
	/**
	 * 到期
	 * 
	 * 2016年4月26日 qxs
	 * @throws DataRefreshingException 
	 * @throws DataSavingException 
	 */
	public void expire() ;
	
	/**
	 * 组团成功
	 * 
	 * 2016年4月26日 qxs
	 */
	public void finish();

	
}
