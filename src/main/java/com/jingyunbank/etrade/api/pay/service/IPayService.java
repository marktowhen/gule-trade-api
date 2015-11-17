package com.jingyunbank.etrade.api.pay.service;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.bo.Orders;
import com.jingyunbank.etrade.api.pay.bo.OrderPayment;

public interface IPayService {
	
	public void save(OrderPayment payment) throws DataSavingException;
	
	public void save(List<OrderPayment> payments) throws DataSavingException;

	public OrderPayment singlePayment(Orders order);
	
	public OrderPayment singlePayment(String oid);
	
	public OrderPayment singlePayment(long orderno);
	
	public List<OrderPayment> listPayments(List<String> oids);

	public void refreshExtransno(List<OrderPayment> payments) throws DataSavingException;

}
