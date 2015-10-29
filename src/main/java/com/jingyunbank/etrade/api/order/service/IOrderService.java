package com.jingyunbank.etrade.api.order.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.exception.DataUpdatingException;
import com.jingyunbank.etrade.api.order.bo.Order;

public interface IOrderService {

	public boolean save(Order order) throws DataSavingException;
	
	public boolean update(Order order) throws DataUpdatingException;
	
	public Optional<Order> getByOrderNo(String orderno) ;
	
	public List<Order> list(String uid);
	
	public List<Order> list(Date start, Date end);
	
}
