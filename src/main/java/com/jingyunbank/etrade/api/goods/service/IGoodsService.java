package com.jingyunbank.etrade.api.goods.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.goods.bo.GoodsList;
import com.jingyunbank.etrade.api.goods.bo.GoodsMerchant;
import com.jingyunbank.etrade.api.goods.bo.HoneyGoods;
import com.jingyunbank.etrade.api.goods.bo.Hot24Goods;
import com.jingyunbank.etrade.api.goods.bo.HotGoods;
import com.jingyunbank.etrade.api.goods.bo.ShowGoods;

/**
 * 
 * Title: 商品接口
 * 
 * @author duanxf
 * @date 2015年11月5日
 */
public interface IGoodsService {
	
	/**
	 * 查询所有的品牌
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listBrands() throws Exception;

	/**
	 * 查询3个品牌 用于首页菜单
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listBrandsThree(Range rang) throws Exception;

	/**
	 * 查询3个类别 用于首页菜单
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listTypesThree(Range rang) throws Exception;

	/**
	 * 查询所有的类别
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listTypes() throws Exception;

	/**
	 * 查询所有商品
	 * 
	 * @param range
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listAll(Range range) throws Exception;

	/**
	 * 根据多条件查询商品
	 * 
	 * @param goodsshow
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listGoodsByWhere(String[] brands, String[] types, BigDecimal beginPrice, BigDecimal endPrice,
			int order, Range range) throws Exception;

	/**
	 * 首页查询热门推荐商品
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<HotGoods> listHotGoods() throws Exception;

	/**
	 * 查询宝贝推荐
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listRecommend(String from, String to) throws Exception;

	/**
	 * 根据商品条件查询关联店铺
	 * 
	 * @param show
	 * @return
	 * @throws Exception
	 */
	public List<GoodsMerchant> listMerchantByWhere(String[] brands, String[] types, BigDecimal beginPrice, BigDecimal endPrice, Range range) throws Exception;

	/**
	 * 店铺相关产品
	 * 
	 * @param show
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listMerchantByWhereGoodsMax(String[] brands, String[] types, BigDecimal beginPrice, BigDecimal endPrice,
			String mid, int order ,Range range) throws Exception;

	/**
	 * 阿胶后台查询24小时热门推荐商品
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Hot24Goods> listHot24Goods() throws Exception;

	/**
	 * 根据推广排序查询推广商品
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listGoodsExpand() throws Exception;

	/**
	 * 在结果中查询商品
	 * 
	 * @param bo
	 * @param range
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listGoodsByGoodsResult(String[] brands, String[] types, BigDecimal beginPrice, BigDecimal endPrice,
			String goodsname, int order , Range range) throws Exception;

	/**
	 * 根据id 查询 商品属性
	 * 
	 * @param gid
	 * @return
	 * @throws Exception
	 */
	public Optional<ShowGoods> singleById(String gid) throws Exception;

	/**
	 * 查询阿胶详情页 宝贝排行列表
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<HoneyGoods> listHoneyGoods(String gid) throws Exception;

	/**
	 * 根据多条件查询商品
	 * 
	 * @param goodsshow
	 * @return
	 * @throws Exception

	 */
	public List<GoodsList> listGoodsByCondition(String name,int state,String mid,String bid, Range range) throws Exception;

	/**
	 * 获取商品的库存数量by gid
	 * 
	 * @param gids
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listGoodsStcok(List<String> gids) throws Exception;

	public Map<String, BigDecimal> emprice(List<String> gids);
}
