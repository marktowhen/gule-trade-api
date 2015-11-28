package com.jingyunbank.etrade.api.pay.service.context;

import java.util.List;
import java.util.Map;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.bo.Orders;
import com.jingyunbank.etrade.api.pay.bo.OrderPayment;

public interface IPayContextService {

	/**
	 * 保存多个订单的支付状态。<p>
	 * <b>注：只保存线上支付的订单状态.</b>
	 * @param orders
	 * @throws DataSavingException
	 */
	public void save(List<Orders> orders) throws DataSavingException;

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
	 * 更新支付信息的 对外交易号(extransno)，支付平台等信息，并且合成用于提交给支付平台的支付信息。
	 * <p>
	 * 如果其中某支付信息已经过时或者已完成支付，则不会更新任一支付信息，并且返回{"error":"支付信息有误！"}
	 * @param payments
	 * @throws DataSavingException
	 */
	public Map<String, String> refreshAndComposite(List<OrderPayment> payments, 
					String platformCode, String platformName) throws Exception;
}
