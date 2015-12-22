package com.jingyunbank.etrade.api.order.postsale.service;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.postsale.bo.RefundCertificate;

public interface IRefundCertificateService {

	public void save(List<RefundCertificate> bos) throws DataSavingException;

	public List<String> list(String rid);

	public void remove(String rid) throws DataRemovingException;
	
}
