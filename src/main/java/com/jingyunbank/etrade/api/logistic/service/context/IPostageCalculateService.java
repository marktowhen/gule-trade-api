package com.jingyunbank.etrade.api.logistic.service.context;

import java.math.BigDecimal;
import java.util.List;

import com.jingyunbank.etrade.api.logistic.bo.PostageCalculate;

public interface IPostageCalculateService {
	
	/**
	 * 计算单种商品的邮费
	 * @param postageCalculate postageID、cityID必填 num/weight/volume3选1
	 * @return
	 * 2016年4月12日 qxs
	 */
	public BigDecimal calculate(PostageCalculate postageCalculate);
	/**
	 * 同一收货地址 多种商品多店铺邮费计算
	 * @param postageCalculateList postageID必填 num/weight/volume3选1
	 * @param city
	 * @return
	 * 2016年4月12日 qxs
	 */
	public BigDecimal calculateMuti(List<PostageCalculate> postageCalculateList, int city);

}
