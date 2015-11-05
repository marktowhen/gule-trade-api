package com.jingyunbank.etrade.api.goods.service;

import java.util.List;
import java.util.Map;

import com.jingyunbank.etrade.api.goods.bo.Goods;

/**
 * 
* Title: 商品接口
* @author    duanxf
* @date      2015年11月5日
 */
public interface IGoodsService {
	/**
	 * 根据商品名模糊查询商品信息
	 * @param goodsname
	 * @return
	 * @throws Exception
	 */
	public List<Goods> listGoodsByLikeName(String goodsname) throws Exception;
	/**
	 * 查询所有的品牌
	 * @return
	 * @throws Exception
	 */
	public List<Goods> listBrands() throws Exception;
	
	/**
	 * 查询所有的类别
	 * @return
	 * @throws Exception
	 */
	public List<Goods> listTypes() throws Exception;
	/**
	 * 根据多条件查询商品
	 * @param map 参数封装为map对象
	 * @return
	 * @throws Exception 
	 */
	public List<Goods> listGoodsByWhere(Map<String,Object> map) throws Exception;
}
