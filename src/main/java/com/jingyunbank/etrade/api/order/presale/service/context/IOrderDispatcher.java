package com.jingyunbank.etrade.api.order.presale.service.context;

import java.util.List;

import com.jingyunbank.core.Result;
import com.jingyunbank.etrade.api.order.presale.bo.Orders;

public interface IOrderDispatcher {

	public List<Result<String>> dispatch(List<Orders> orders) throws Exception;
}
