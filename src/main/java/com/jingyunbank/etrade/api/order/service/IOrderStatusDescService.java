package com.jingyunbank.etrade.api.order.service;

import java.util.List;

import com.jingyunbank.etrade.api.order.bo.OrderStatusDesc;

public interface IOrderStatusDescService {

	public List<OrderStatusDesc> listVisible();
	
}
