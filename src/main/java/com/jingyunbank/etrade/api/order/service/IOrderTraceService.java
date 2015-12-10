package com.jingyunbank.etrade.api.order.service;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.bo.OrderTrace;

/**
 * 订单生命周期管理服务类。<br>
 * 负责订单的生命周期的管理，包括更新订单的当前状态等。
 */
public interface IOrderTraceService {

	public void save(OrderTrace trace) throws DataSavingException;
	
	public void save(List<OrderTrace> traces) throws DataSavingException;
	
	public List<OrderTrace> list(String oid) ;
}
