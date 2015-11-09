package com.jingyunbank.etrade.api.goods.service;

import java.util.List;
import java.util.Map;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.goods.bo.HotGoods;
import com.jingyunbank.etrade.api.goods.bo.GoodsShow;

/**
 * 
 * Title: 商品接口
 * 
 * @author duanxf
 * @date 2015年11月5日
 */
public interface IGoodsService {
	/**
	 * 根据商品名模糊查询商品信息
	 * 
	 * @param goodsname
	 * @return
	 * @throws Exception
	 */
	public List<HotGoods> listGoodsByLikeName(String goodsname,Range range) throws Exception;

	/**
	 * 查询所有的品牌
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<HotGoods> listBrands() throws Exception;

	/**
	 * 查询所有的类别
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<HotGoods> listTypes() throws Exception;

	/**
	 * 根据多条件查询商品
	 * @param goodsshow
	 * @return
	 * @throws Exception
	 */
	public List<HotGoods> listGoodsByWhere(GoodsShow goodsshow,Range range) throws Exception;

	/**
	 * 首页查询热门推荐商品
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<HotGoods> listHotGoods() throws Exception;

}
