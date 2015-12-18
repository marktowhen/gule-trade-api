package com.jingyunbank.etrade.api.order.postsale.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.postsale.bo.Refund;
import com.jingyunbank.etrade.api.order.postsale.bo.RefundStatusDesc;

public interface IRefundService {

	public void save(Refund refund) throws DataSavingException;
	
	public void refreshStatus(String RID, RefundStatusDesc status) throws DataRefreshingException;
	
	public Optional<Refund> single(String rid);
	
}
