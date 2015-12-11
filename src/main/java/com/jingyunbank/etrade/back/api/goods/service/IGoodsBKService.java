package com.jingyunbank.etrade.back.api.goods.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.back.api.goods.bo.GoodsList;
import com.jingyunbank.etrade.back.api.goods.bo.GoodsSearch;

/**
 * 商品后台管理
 * @author liug
 *
 */
public interface IGoodsBKService {
	/**
	 * 根据多条件查询商品
	 * 
	 * @param goodsshow
	 * @return
	 * @throws Exception
	 */
	public List<GoodsList> listGoodsByCondition(GoodsSearch goodsSearch, Range range) throws Exception;
}
