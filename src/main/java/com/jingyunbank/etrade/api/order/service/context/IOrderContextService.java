package com.jingyunbank.etrade.api.order.service.context;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.bo.Orders;
import com.jingyunbank.etrade.api.order.bo.Refund;

public interface IOrderContextService {
	
	/**
	 * 保存单个订单信息<br>
	 * 用户填写完订单详情后点击确定按钮，完成订单提交。
	 * 
	 * <br>
	 * 1）该操作会保存订单的基本信息，包括订单的订单号，收货人，支付方式，订单的价格，邮费，商家等信息。<br>
	 * 2）同时还会保存该订单中包含哪些商品，以及商品的价格，数量等信息<br>
	 * 3）最后还会保存一条订单追踪信息，记录订单的生命周期
	 * @param order
	 * @throws OrderGenerateException
	 */
	public void save(Orders order) throws DataSavingException;
	/**
	 * 保存多个订单信息<br>
	 * 
	 * 1）该操作会保存订单的基本信息，包括订单的订单号，收货人，支付方式，订单的价格，邮费，商家等信息。<br>
	 * 2）同时还会保存该订单中包含哪些商品，以及商品的价格，数量等信息<br>
	 * 3）最后还会保存一条订单追踪信息，记录订单的生命周期
	 * @param orders
	 * @throws DataSavingException
	 */
	public void save(List<Orders> orders) throws DataSavingException;
	/**
	 * 更新订单的信息<br>
	 * 用户支付前，可以修改自己的订单信息，如支付方式，收货地址，商品数量，移除商品等
	 * @param order
	 * @throws OrderUpdateException
	 */
	public void update(Orders order) throws DataSavingException;
	/**
	 * 调用支付接口对该订单进行支付<br>
	 * 该方法更新订单状态为PAYING，并生成相应log信息，然后调用相应支付接口
	 * @param order 订单信息
	 * @throws OrderPayException 抛出该异常如果在调用支付接口，或者更改订单状态时
	 */
	public void pay(Orders order) throws DataSavingException;
	/**
	 * 完成支付操作<br>
	 * 当接收到相应支付接口的支付结果反馈后，执行相应的动作<br>
	 * 包括：更新订单状态为PAID，并生成相应的log信息，另外需要通知卖方用户支付成功
	 * @param orderno 订单号
	 * @throws OrderPaidException 
	 */
	public void paid(String orderno) throws DataSavingException;
	/**
	 * 完成支付失败的相应操作<br>
	 * 包括：更新订单状态为PAYFAIL，并生成相应log信息，然后通知买家支付失败
	 * @param orderno
	 * @throws OrderPayFailException
	 */
	public void payfail(String orderno) throws DataSavingException;
	/**
	 * 支付成功确认<br>
	 * 用户支付成功后，卖家需要将订单状态更新为delivering， <br>
	 * 以表示该订单中的商品正在出库即将配送或已经配送但还没有更新为已配送状态，<br>
	 * 一旦卖家将订单状态更新至此，买家申请退款就必须得到买家的同意
	 * @param orderno
	 */
	public void delivering(String orderno) throws DataSavingException;
	/**
	 * 卖家订单发货<br>
	 * 更新订单状态为已发货，然后通知买家注意收货，并生成相应log信息等
	 * @param orderno
	 */
	public void delivered(String orderno);
	/**
	 * 买家订单收货<br>
	 * 更新订单状态为已收货(RECEIVED)，并生成相应log信息等。<br>
	 * <strong>该方法的执行表示整个订单完成</strong>
	 * @param orderno
	 */
	public void received(String orderno);
	/**
	 * 取消订单<br>
	 * 将订单状态更新为已取消。<br>
	 * 只有订单<strong>还没有支付</strong>或者<strong>支付但没有得到卖家确认</strong>的情况下才可以取消。
	 * <br>
	 * 如果买家已付款，但是希望放弃购买，此时必须向卖家提出退款申请，得到卖家同意后，方可退款。<br>
	 * 参考<code></code>
	 * 
	 * @param orderno 订单号
	 * @param reason 取消原因
	 */
	public void cancel(String orderno, String reason);
	/**
	 * 移除已取消的订单<br>
	 * 将已经取消的订单更新为删除状态，不在显示在用户的订单列表中
	 * @param orderno
	 */
	public void remove(String id) throws DataRemovingException;
	/**
	 * 申请退款<br>
	 * 对为过退换货期的商品或订单申请退款，将订单状态修改为退款中，等待卖家同意
	 * @param refund
	 */
	public void refund(Refund refund);
	
	public void denyRefund(Refund refund);
	
	public void approveRefund(Refund refund);
	
	public boolean canRefund(String oid);
}
