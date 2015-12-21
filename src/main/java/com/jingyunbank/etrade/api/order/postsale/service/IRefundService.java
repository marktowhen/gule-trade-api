package com.jingyunbank.etrade.api.order.postsale.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.postsale.bo.Refund;
import com.jingyunbank.etrade.api.order.postsale.bo.RefundStatusDesc;

public interface IRefundService {

	public void save(Refund refund) throws DataSavingException;
	
	public void refreshStatus(String RID, RefundStatusDesc status) throws DataRefreshingException;
	
	public Optional<Refund> single(String rid);
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
	
}
