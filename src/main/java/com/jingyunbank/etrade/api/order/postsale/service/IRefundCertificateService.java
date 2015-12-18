package com.jingyunbank.etrade.api.order.postsale.service;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.postsale.bo.RefundCertificate;

public interface IRefundCertificateService {

	public void save(List<RefundCertificate> bos) throws DataSavingException;
	
}
