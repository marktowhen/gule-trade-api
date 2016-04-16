package com.jingyunbank.etrade.api.pay.service.context;

import java.util.List;
import java.util.Map;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.pay.bo.PayPipeline;

public interface IPayContextService {

	/**
	 * 更新支付信息的 对外交易号(extransno)，支付平台等信息，并且合成用于提交给支付平台的支付信息。
	 * <p>
	 * 如果其中某支付信息已经过时或者已完成支付，则不会更新任一支付信息，并且返回{"error":"支付信息有误！"}
	 * @param payments
	 * @throws DataSavingException
	 */
//	public Map<String, String> refreshAndResolvePipeline(
//					List<OrderPayment> payments, 
//					String pipelineCode, String pipelineName,
//					String bankCode) throws Exception;
	
	public Map<String, String> prepay(List<String> oids, PayPipeline pipeline) throws Exception;
	
	public Map<String, String> prefund(String oids) throws Exception;
	
}
