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
	 *  <p>
	 *  keywords 参数用来过滤多个条件，其中任意条件满足即可(OR)
	 *  
	 * @param uid
	 * @param statuscode 订单状态码 （如果为空，则不过滤该条件，即查询全部）
	 * @param fromdate 订单开始日期（格式良好的日期字符串，如‘2015-12-09’，如果为空，则默认‘1970-01-01’）
	 * @param keywords 订单关键字 (包括，订单号，商品民，商家名，商家id)（如果为空，则不过滤该条件，即查询全部）
	 * @param range
	 * @return
	 */
	public List<Orders> list(
				String uid, 
				String mid, 
				String statuscode, 
				String keywords, 
				String fromdate, 
				String enddate, 
				Range range);
	/**
	 * 查询按时间降序排列的订单中的 某几条状态，日期，关键字符合自定参数的数据。
	 * <p>
	 * 所有作为过滤条件的参数，如果存在则必须以AND的形式进行查找。如orderno, gname同时指定，则必须两个条件同时满足
	 * <p>
	 * 若某参数为空值则表示不进行过滤，查询所有该参数可能的结果
	 * @param uid
	 * @param mid
	 * @param orderno
	 * @param statuscode
	 * @param gname
	 * @param uname
	 * @param mname
	 * @param fromdate
	 * @param enddate
	 * @return
	 */
	public List<Orders> list(
				String uid, 
				String mid, 
				String statuscode,
				String orderno,
				String gname,
				String uname,
				String mname,
				String fromdate, 
				String enddate,
				Range range
				);
	
	/**
	 * 查询用户的订单数量
	 * @param uid
	 * @param statuscode 订单状态码 （如果为空，则不过滤该条件，即查询全部）
	 * @param fromdate 订单开始日期（格式良好的日期字符串，如‘2015-12-09’，如果为空，则默认‘1970-01-01’）
	 * @param keywords 订单商品关键字（如果为空，则不过滤该条件，即查询全部）
	 * @return
	 * 2015年12月10日 qxs
	 */
	public Integer count(
			String uid, 
			String mid, 
			String statuscode, 
			String keywords, 
			String fromdate, 
			String enddate);
	
	public Integer count(
			String uid, 
			String mid, 
			String statuscode,
			String orderno,
			String gname,
			String uname,
			String mname,
			String fromdate, 
			String enddate);
	/**
	 * 列出截止某期限内所有某状态的订单
	 * @param deadline
	 * @return
	 */
	public List<Orders> listBefore(Date deadline, OrderStatusDesc status);
	
	/**
	 * 列出某期限内所有某状态的订单
	 * @param deadline
	 * @return
	 */
	public List<Orders> listBetween(Date from, Date to, OrderStatusDesc status);
	
	/**
	 * 根据对外订单号获取公用该订单号的订单信息
	 * @param extransno
	 * @return
	 */
	public List<Orders> listByExtransno(String extransno);
	/**
	 * 判断指定优惠卡券是否同时适用于多个订单？
	 * @param couponid
	 * @return
	 */
	public boolean shareCoupon(String couponid);
	
}
