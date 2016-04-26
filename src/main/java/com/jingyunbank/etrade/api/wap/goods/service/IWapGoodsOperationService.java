package com.jingyunbank.etrade.api.wap.goods.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.wap.goods.bo.GoodsOperation;
import com.jingyunbank.etrade.api.wap.goods.bo.GoodsOperationShow;

public interface IWapGoodsOperationService {

	/**
	 * 保存商品
	 * 
	 * @param goodsOperation
	 * @return
	 * @throws Exception
	 */
	public boolean saveGoods(GoodsOperation goodsOperation) throws Exception;

	/**
	 * 修改商品信息
	 * 
	 * @param goodsOperation
	 * @return
	 * @throws Exception
	 */
	public boolean modfiyGoods(GoodsOperation goodsOperation) throws Exception;

	/**
	 * 商品上架 by skuid
	 * 
	 * @param skuId
	 * @return
	 * @throws Exception
	 */
	public boolean up(String skuId) throws Exception;

	/**
	 * 商品下架 by skuid
	 * 
	 * @param skuId
	 * @return
	 * @throws Exception
	 */
	public boolean down(String skuId) throws Exception;

	/**
	 * 获取商品的详细信息 用于修改回显商品
	 * 
	 * @param gid
	 * @return
	 * @throws Exception
	 */
	public Optional<GoodsOperationShow> getGoodsByGid(String gid) throws Exception;

	/**
	 * 删除商品
	 * 
	 * @param gid
	 */
	public void delGoodsByGid(String gid) throws Exception;

}
