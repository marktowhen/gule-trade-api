package com.jingyunbank.etrade.api.order.postsale.service;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.postsale.bo.Refund;

public interface IRefundService {

	public void save(Refund refund) throws DataSavingException;
	
}
