package com.jingyunbank.etrade.api.order.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.bo.OrderStatusDesc;
import com.jingyunbank.etrade.api.order.bo.Orders;

public interface IOrderService {

	public void save(Orders order) throws DataSavingException;
	
	public void save(List<Orders> order) throws DataSavingException;
	
	public void refreshStatus(List<String> oids, OrderStatusDesc status) throws DataRefreshingException;

	public Optional<Orders> single(String oid);
	
	/**
	 * 查询某用户的所有订单信息，默认是按照下单时间的降序排列
	 * @param uid
	 * @return
	 */
	public List<Orders> list(String uid);
	/**
	 * 查询某用户的某订单状态下的所有订单
	 * @param uid
	 * @param status
	 * @return
	 */
	public List<Orders> listOrder(String uid, OrderStatusDesc status);
	
	/**
	 * 查询某用户的按时间降序排列的订单中的 某几条数据。
	 * @param uid
	 * @param range from->to
	 * @return
	 */
	public List<Orders> list(String uid, Range range);
	/**
	 *  查询某用户的按时间降序排列的订单中的 某几条状态，日期，关键字符合自定参数的数据。
	 *  
	 * @param uid
	 * @param statuscode 订单状态码 （如果为空，则不过滤该条件，即查询全部）
	 * @param fromdate 订单开始日期（格式良好的日期字符串，如‘2015-12-09’，如果为空，则默认‘1970-01-01’）
	 * @param keywords 订单商品关键字（如果为空，则不过滤该条件，即查询全部）
	 * @param range
	 * @return
	 */
	public List<Orders> list(String uid, String statuscode, String fromdate, String keywords, Range range);
	
	public List<Orders> list();
	
	public List<Orders> list(Date start, Date end);

	public void remove(String id) throws DataRemovingException;

	/**
	 * 根据对外订单号获取公用该订单号的订单信息
	 * @param extransno
	 * @return
	 */
	public List<Orders> listByExtransno(String extransno);
	
}
