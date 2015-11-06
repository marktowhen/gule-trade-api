package com.jingyunbank.etrade.api.order.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.order.bo.Orders;

public interface IOrderService {

	public void save(Orders order) throws DataSavingException;
	
	public void refresh(Orders order) throws DataRefreshingException;
	
	public Optional<Orders> singleByOrderNo(String orderno) ;
	
	public List<Orders> list(String uid);
	
	public List<Orders> list();
	
	public List<Orders> list(Date start, Date end);

	public void remove(String id) throws DataRemovingException;
	
}
