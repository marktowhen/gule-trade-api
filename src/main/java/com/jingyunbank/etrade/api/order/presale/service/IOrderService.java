package com.jingyunbank.etrade.api.order.presale.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.presale.bo.OrderStatusDesc;
import com.jingyunbank.etrade.api.order.presale.bo.Orders;

public interface IOrderService {

	public void save(Orders order) throws DataSavingException;
	
	public void save(List<Orders> order) throws DataSavingException;
	
	public void refreshStatus(List<String> oids, OrderStatusDesc status) throws DataRefreshingException;

	public Optional<Orders> single(String oid);
	
	public List<Orders> list(List<String> oids);
	/**
	 *  查询某用户的按时间降序排列的订单中的 某几条状态，日期，关键字符合自定参数的数据。
	 *  
	 * @param uid
	 * @param statuscode 订单状态码 （如果为空，则不过滤该条件，即查询全部）
	 * @param fromdate 订单开始日期（格式良好的日期字符串，如‘2015-12-09’，如果为空，则默认‘1970-01-01’）
	 * @param keywords 订单关键字 (包括，订单号，商品民，商家名，商家id)（如果为空，则不过滤该条件，即查询全部）
	 * @param range
	 * @return
	 */
	public List<Orders> list(String uid, String statuscode, String fromdate, String keywords, Range range);
	/**
	 *  查询某商家的按时间降序排列的订单中的 某几条状态，日期，关键字符合自定参数的数据。
	 *  
	 * @param uid
	 * @param statuscode 订单状态码 （如果为空，则不过滤该条件，即查询全部）
	 * @param fromdate 订单开始日期（格式良好的日期字符串，如‘2015-12-09’，如果为空，则默认‘1970-01-01’）
	 * @param keywords 订单关键字 (包括，订单号，商品民，商家名，商家id)（如果为空，则不过滤该条件，即查询全部）
	 * @param range
	 * @return
	 */
	public List<Orders> listm(String mid, String statuscode, String fromdate, String keywords, Range range);
	
	/**
	 * 根据对外订单号获取公用该订单号的订单信息
	 * @param extransno
	 * @return
	 */
	public List<Orders> listByExtransno(String extransno);

	/**
	 * 查询用户的订单数量
	 * @param uid
	 * @param statuscode 订单状态码 （如果为空，则不过滤该条件，即查询全部）
	 * @param fromdate 订单开始日期（格式良好的日期字符串，如‘2015-12-09’，如果为空，则默认‘1970-01-01’）
	 * @param keywords 订单商品关键字（如果为空，则不过滤该条件，即查询全部）
	 * @return
	 * 2015年12月10日 qxs
	 */
	public Integer count(String uid, String statuscode, String fromdate,String keywords);
	/**
	 * 列出截止某期限内所有某状态的订单
	 * @param deadline
	 * @return
	 */
	public List<Orders> listBefore(Date deadline, OrderStatusDesc status);
	
}
