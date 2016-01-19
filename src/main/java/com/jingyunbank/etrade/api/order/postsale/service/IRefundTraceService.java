package com.jingyunbank.etrade.api.order.postsale.service;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.postsale.bo.RefundTrace;

public interface IRefundTraceService {

	public void save(RefundTrace trace) throws DataSavingException;
	
	public void save(List<RefundTrace> traces) throws DataSavingException;
	
	public List<RefundTrace> list(String rid) ;
	/**
	 * 查询某退单中某状态下的trace信息
	 * @param rid
	 * @param status 非必须，如果为空，则查询全部
	 * @return
	 */
	public List<RefundTrace> list(String rid, String status) ;
}
