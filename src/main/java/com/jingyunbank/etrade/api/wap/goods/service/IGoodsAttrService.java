package com.jingyunbank.etrade.api.wap.goods.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.wap.goods.bo.GoodsAttr;

public interface IGoodsAttrService {

	/**
	 * 添加商品属性
	 * 
	 * @param goodsAttr
	 * @throws Exception
	 */
	public void save(GoodsAttr goodsAttr) throws Exception;

	/**
	 * 查询商品属性by ID
	 * @param aid
	 * @return
	 * @throws Exception
	 */
	public Optional<GoodsAttr> singleById(String aid) throws Exception;

	/**
	 * 修改商品属性
	 * @param goodsAttr
	 * @throws Exception
	 */
	public void refreshGoodsAttr(GoodsAttr goodsAttr) throws Exception;

	/**
	 * 删除商品属性
	 * @param aid
	 * @throws Exception
	 */
	public void romoveGoodsAttr(String aid) throws Exception;
	
	/**
	 * 获取商品的所有属性
	 * @return
	 * @throws Exception
	 */
	public List<GoodsAttr> listGoodsAttr() throws Exception;
}
