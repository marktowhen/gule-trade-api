package com.jingyunbank.etrade.api.postage.service;

import java.math.BigDecimal;
import java.util.List;

import com.jingyunbank.etrade.api.order.presale.bo.Orders;

public interface IPostageService {

	public BigDecimal calculate(String mid, BigDecimal orderprice, BigDecimal weight, BigDecimal defaultp);
	
	public void calculate(List<Orders> orders);
}
