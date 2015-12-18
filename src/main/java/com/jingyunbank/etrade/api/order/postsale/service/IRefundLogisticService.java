package com.jingyunbank.etrade.api.order.postsale.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.postsale.bo.RefundLogistic;

public interface IRefundLogisticService {
	
	public void save(RefundLogistic bo) throws DataSavingException;

	public Optional<RefundLogistic> single(String rid);
}
