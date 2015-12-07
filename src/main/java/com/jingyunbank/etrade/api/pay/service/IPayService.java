package com.jingyunbank.etrade.api.pay.service;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.pay.bo.OrderPayment;

public interface IPayService {
	
	/**
	 * 保存某订单的支付记录
	 * @param payment
	 * @throws DataSavingException
	 */
	public void save(OrderPayment payment) throws DataSavingException;
	/**
	 * 批量保存某订单的支付记录
	 * @param payments
	 * @throws DataSavingException
	 */
	public void save(List<OrderPayment> payments) throws DataSavingException;

	/**
	 * 根据某订单信息查询该订单的支付记录
	 * @param order
	 * @return
	 */
//	public OrderPayment singlePayment(Orders order);
//	
//	public OrderPayment singlePayment(String oid);
//	
//	public OrderPayment singlePayment(long orderno);
//	
	public List<OrderPayment> listPayments(List<String> oids);

	/**
	 * 批量更新订单支付记录的信息，如果付款方式，对外订单号的更新等。
	 * @param payments
	 * @throws DataSavingException
	 */
	public void refreshNOAndPipeline(List<OrderPayment> payments) throws DataSavingException;
	/**
	 * 更新支付状态为成功或者失败
	 * @param extransno
	 * @throws DataRefreshingException
	 */
	public void refreshStatus(String extransno, boolean done) throws DataRefreshingException;
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

}
