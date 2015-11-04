package com.jingyunbank.etrade.api.goods.service;

import java.util.List;

import com.jingyunbank.etrade.api.goods.bo.Goods;

/**
 * 提供商品相关服务
 * @author liug
 *
 */
public interface IGoodsService {
	public List<Goods> queryByName(String name);
}
