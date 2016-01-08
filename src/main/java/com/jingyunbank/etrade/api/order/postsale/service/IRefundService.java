package com.jingyunbank.etrade.api.order.postsale.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.postsale.bo.Refund;
import com.jingyunbank.etrade.api.order.postsale.bo.RefundStatusDesc;

public interface IRefundService {

	public void save(Refund refund) throws DataSavingException;

	public void refresh(Refund refund)throws DataRefreshingException;
	
	public void refreshStatus(List<String> RIDs, RefundStatusDesc status) throws DataRefreshingException;
	
	public Optional<Refund> singleByOGID(String ogid) ;
	
	public Optional<Refund> single(String rid);
	/**
	 * 查询指定退单id所标识的所有退单信息
	 * @param rids
	 * @return
	 */
	public List<Refund> list(List<String> rids);
	/**
	 * 列出截止某期限内所有某状态的退单
	 * @param deadline
	 * @return
	 */
	public List<Refund> listBefore(Date from, RefundStatusDesc status);
	
	
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
	public List<Refund> list(
				String uid, 
				String mid, 
				String statuscode, 
				String keywords, 
				String fromdate, 
				String enddate, 
				Range range);
}
