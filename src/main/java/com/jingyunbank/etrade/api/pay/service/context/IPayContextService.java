package com.jingyunbank.etrade.api.pay.service.context;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.bo.Orders;
import com.jingyunbank.etrade.api.pay.bo.OrderPayment;

public interface IPayContextService {

	public void save(List<OrderPayment> payments) throws DataSavingException;

	/**
	 * 检查指定的订单是否是可以支付的。<p>
	 * <b>可以支付的规则：</b>
	 * <ul>
	 * 	<li>1，所有都没有过期。
	 * 	<li>2，所有订单中的商品都没有下架。
	 * 	<li>3，所有订单都没有被支付。
	 * </ul>
	 * @param orders
	 * @return
	 */
	public boolean ifpayable(List<Orders> orders);
	/**
	 * 初始化订单的交易（创建并返回对应订单的order_payment 记录）。
	 * <p>
	 * 每个orderpayment记录对应一笔交易。<p>
	 * 该方法会检查订单的当前状态，包括是否过期？是否已完成支付？<p>
	 * 并且只返回正常状态下的订单的交易信息。
	 * 
	 * @param orders
	 * @return
	 */
	public List<OrderPayment> beginTranscation(List<Orders> orders) throws DataSavingException;
	
}
