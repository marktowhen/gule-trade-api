package com.jingyunbank.etrade.api.wap.goods.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.wap.goods.bo.GoodsOperation;
import com.jingyunbank.etrade.api.wap.goods.bo.GoodsOperationShow;

public interface IWapGoodsOperationService {

	public boolean saveGoods(GoodsOperation goodsOperation) throws Exception;

	public boolean modfiyGoods(GoodsOperation goodsOperation) throws Exception;

	public boolean up(String skuId) throws Exception;

	public boolean down(String skuId) throws Exception;

	public Optional<GoodsOperationShow> getGoodsByGid(String gid) throws Exception;

}
