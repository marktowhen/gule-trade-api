package com.jingyunbank.etrade.api.goods.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.goods.bo.GoodsMerchant;
import com.jingyunbank.etrade.api.goods.bo.GoodsShow;
import com.jingyunbank.etrade.api.goods.bo.HoneyGoods;
import com.jingyunbank.etrade.api.goods.bo.Hot24Goods;
import com.jingyunbank.etrade.api.goods.bo.HotGoods;
import com.jingyunbank.etrade.api.goods.bo.ShowGoods;
import com.jingyunbank.etrade.back.api.goods.bo.GoodsList;
import com.jingyunbank.etrade.back.api.goods.bo.GoodsSearch;

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
	public List<ShowGoods> listGoodsByLikeName(String goodsname, Range range) throws Exception;

	/**
	 * 查询所有的品牌
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listBrands() throws Exception;

	/**
	 * 查询所有的类别
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listTypes() throws Exception;
	
	/**
	 * 查询所有商品
	 * @param range
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listAll(Range range)throws Exception;
	
	/**
	 * 根据多条件查询商品
	 * 
	 * @param goodsshow
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listGoodsByWhere(GoodsShow goodsshow, Range range) throws Exception;

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
	public List<GoodsMerchant> listMerchantByWhere(GoodsShow show, Range range) throws Exception;

	/**
	 * 店铺相关产品 显示4条
	 * 
	 * @param show
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listMerchantByWhereGoods4(GoodsShow show) throws Exception;
	/**
	 * 店铺相关产品 全部显示
	 * 
	 * @param show
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listMerchantByWhereGoodsMax(GoodsShow show,Range range) throws Exception;

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
	 * @param bo
	 * @param range
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listGoodsByGoodsResult(GoodsShow bo, Range range) throws Exception;
	
	/**
	 * 根据id 查询 商品属性
	 * @param gid
	 * @return
	 * @throws Exception
	 */
	public Optional<ShowGoods> singleById(String gid) throws Exception;
	/**
	 * 查询阿胶详情页  宝贝排行列表
	 * @return
	 * @throws Exception
	 */
	public List<HoneyGoods> listHoneyGoods() throws Exception;
	/**
	 * 根据多条件查询商品
	 * 
	 * @param goodsshow
	 * @return
	 * @throws Exception
	 */
	public List<GoodsList> listGoodsByCondition(GoodsSearch goodsSearch, Range range) throws Exception;
	
	 
}
