package com.jingyunbank.etrade.api.order.presale.service.context;

import java.util.List;

import com.jingyunbank.core.Result;
import com.jingyunbank.etrade.api.order.presale.bo.Orders;

public interface IOrderStatusHandler {

	public Result<String> handle(List<Orders> orders) throws Exception;
	
	public Result<String> handle(Orders order) throws Exception;

}
