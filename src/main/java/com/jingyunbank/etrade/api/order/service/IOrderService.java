package com.jingyunbank.etrade.api.order.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.exception.DataUpdatingException;
import com.jingyunbank.etrade.api.order.bo.Orders;

public interface IOrderService {

	public boolean save(Orders order) throws DataSavingException;
	
	public boolean update(Orders order) throws DataUpdatingException;
	
	public Optional<Orders> getByOrderNo(String orderno) ;
	
	public List<Orders> list(String uid);
	
	public List<Orders> list(Date start, Date end);
	
}
