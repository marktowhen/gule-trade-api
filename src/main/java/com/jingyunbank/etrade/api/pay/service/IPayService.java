package com.jingyunbank.etrade.api.pay.service;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
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

	public void refresh(List<OrderPayment> payments) throws DataSavingException;
	/**
	 * 检查是否有订单已经支付完成。
	 * @param payments
	 * @return
	 */
	public boolean anyDone(List<String> orderpaymentids) ; 
	/**
	 * 检查是否所有指定的订单都已经支付完成。
	 * @param payments
	 * @return
	 */
	public boolean allDone(List<String> orderpaymentids) ;

	/**
	 * 完成支付
	 * @param extransno
	 * @throws DataRefreshingException
	 */
	public void finish(String extransno) throws DataRefreshingException;
	/**
	 * 支付失败
	 * @param extransno
	 * @throws DataRefreshingException
	 */
	public void fail(String extransno) throws DataRefreshingException;
}
