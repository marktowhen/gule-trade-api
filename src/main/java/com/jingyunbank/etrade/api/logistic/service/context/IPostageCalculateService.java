package com.jingyunbank.etrade.api.logistic.service.context;

import java.math.BigDecimal;
import java.util.List;

import com.jingyunbank.etrade.api.logistic.bo.PostageCalculate;

public interface IPostageCalculateService {
	
	/**
	 * 计算单种商品的邮费
	 * @param postageCalculate postageID、cityID、transpostType必填 num/weight/volume3选1
	 * @return
	 * 2016年4月12日 qxs
	 */
	public BigDecimal calculate(PostageCalculate postageCalculate);
	/**
	 * 同一收货地址 多种商品多店铺邮费计算
	 * @param postageCalculateList postageID、transpostType必填 num/weight/volume3选1
	 * @param city
	 * @return
	 * 2016年4月12日 qxs
	 */
	public BigDecimal calculateMuti(List<PostageCalculate> postageCalculateList);
	
	/**
	 * 同一店铺下多种商品邮费计算
	 * @param postageCalculateList
	 * @return
	 * 2016年4月27日 qxs
	 */
	public BigDecimal calculateOneMerchat(List<PostageCalculate> postageCalculateList);
	
	/**
	 * 根据postageID查出对应的邮费模板 放入calculatRule中
	 * @param postageCalculateList
	 * @return
	 * 2016年4月28日 qxs
	 */
	public List<PostageCalculate> fitPostageRule(List<PostageCalculate> postageCalculateList);

}
