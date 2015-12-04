package com.jingyunbank.etrade.api.pay.service;

import java.util.List;

import com.jingyunbank.etrade.api.pay.bo.PayPipeline;

public interface IPayPipelineService {

	public List<PayPipeline> list();
	
	public PayPipeline single(String pipecode);
	
}
