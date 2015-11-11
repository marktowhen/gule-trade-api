package com.jingyunbank.etrade.api.order.service;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataSavingException;

import com.jingyunbank.etrade.api.order.bo.OrderGoods;

/**
 * 用来管理操作订单中每件商品的服务接口
 */
public interface IOrderGoodsService {

	public void save(List<OrderGoods> goods) throws DataSavingException;
	
}
