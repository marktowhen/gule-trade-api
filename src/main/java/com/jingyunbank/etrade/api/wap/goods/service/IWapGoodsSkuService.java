package com.jingyunbank.etrade.api.wap.goods.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.wap.goods.bo.GoodsSku;

public interface IWapGoodsSkuService {
	/**
	 * 通过id查出单个的对象
	 * @param id
	 * @return
	 */
	public Optional<GoodsSku> single(String id);
}
