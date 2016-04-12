package com.jingyunbank.etrade.api.wap.goods.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.wap.goods.bo.GoodsAttr;

public interface IGoodsAttrService {

	public void save(GoodsAttr goodsAttr) throws Exception;

	public Optional<GoodsAttr> singleById(String aid) throws Exception;

	public void refreshGoodsAttr(GoodsAttr goodsAttr) throws Exception;

	public void romoveGoodsAttr(String aid) throws Exception;

	public List<GoodsAttr> listGoodsAttr() throws Exception;
}
