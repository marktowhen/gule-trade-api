package com.jingyunbank.etrade.api.logistic.service.context;

import java.math.BigDecimal;

import com.jingyunbank.etrade.api.logistic.bo.Postage;
import com.jingyunbank.etrade.api.logistic.bo.PostageCalculate;
import com.jingyunbank.etrade.api.logistic.bo.PostageDetail;

public interface IPostageCalculateRuleService {

	public boolean matches(Postage Postage, PostageDetail postageDetail);
	
	public BigDecimal calculateFirstCost( PostageDetail postageDetail);
	
	public BigDecimal calculateNextCost(PostageCalculate calculate, PostageDetail postageDetail);
}
