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
	 * 构建支付信息，该信息用于提交给支付平台的支付信息数据.
	 * <p>
	 * 包括，交易号（extransno，多订单共享），交易总额等
	 * @param payments
	 * @throws DataSavingException
	 */
	public Map<String, String> buildPayInfo(List<OrderPayment> payments, String platformCode) throws Exception;
}
