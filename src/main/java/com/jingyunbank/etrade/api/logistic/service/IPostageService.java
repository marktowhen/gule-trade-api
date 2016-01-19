package com.jingyunbank.etrade.api.logistic.service;

import java.math.BigDecimal;
import java.util.List;

import com.jingyunbank.etrade.api.logistic.bo.Postage;

public interface IPostageService {

	/**
	 * 计算寄往<code>provenceid</code>省份的价格为<code>orderprice</code>
	 * 重量为<code>weight</code>的订单的邮费
	 * @param orderprice
	 * @param provenceid
	 * @param weight
	 * @return
	 */
	public BigDecimal calculate(BigDecimal orderprice, int provenceid);
	
	public List<Postage> calculate(List<Postage> postages);
}
