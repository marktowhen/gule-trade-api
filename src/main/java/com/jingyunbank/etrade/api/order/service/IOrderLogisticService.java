package com.jingyunbank.etrade.api.order.service;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.bo.OrderLogistic;

public interface IOrderLogisticService {

	public void save(OrderLogistic bo) throws DataSavingException;
	
}
