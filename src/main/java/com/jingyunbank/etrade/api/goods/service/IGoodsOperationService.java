package com.jingyunbank.etrade.api.goods.service;

import com.jingyunbank.etrade.api.goods.bo.GoodsOperation;

/**
 * 
* Title: 	商品的操作类
* @author    duanxf
* @date      2015年11月13日
 */
public interface IGoodsOperationService {
	/**
	 * 保存商品
	 * @param goodsOperation
	 * @return
	 */
	public boolean save(GoodsOperation goodsOperation);
}
