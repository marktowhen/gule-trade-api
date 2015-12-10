package com.jingyunbank.etrade.api.order.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.bo.OrderLogistic;

public interface IOrderLogisticService {

	public void save(OrderLogistic bo) throws DataSavingException;

	public Optional<OrderLogistic> single(String oid);
	
}
