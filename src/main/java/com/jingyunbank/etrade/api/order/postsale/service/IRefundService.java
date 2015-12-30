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
	
	public Optional<Refund> latestOneByOGID(String ogid) ;
	
	public Optional<Refund> single(String rid);
	/**
	 * 查询指定退单id所标识的所有退单信息
	 * @param rids
	 * @return
	 */
	public List<Refund> list(List<String> rids);
	/**
	 * 查询商户的退款信息
	 * @param mid
	 * @param statuscode
	 * @param fromdate
	 * @param keywords
	 * @param range
	 * @return
	 */
	public List<Refund> listm(String mid, String statuscode,
			String fromdate, String keywords, Range range);

	public List<Refund> list(String uid, String statuscode,
			String fromdate, String keywords, Range range);
	/**
	 * 列出截止某期限内所有某状态的退单
	 * @param deadline
	 * @return
	 */
	public List<Refund> listBefore(Date from, RefundStatusDesc status);
}
