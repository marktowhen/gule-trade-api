package com.jingyunbank.etrade.api.order.presale.service;

import java.util.List;

import com.jingyunbank.etrade.api.order.presale.bo.OrderStatusDesc;

public interface IOrderStatusDescService {

	public List<OrderStatusDesc> listVisible();
	
}
