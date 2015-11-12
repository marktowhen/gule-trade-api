package com.jingyunbank.etrade.api.goods.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.goods.bo.FootprintGoods;
import com.jingyunbank.etrade.api.goods.bo.GoodsMerchant;
import com.jingyunbank.etrade.api.goods.bo.GoodsShow;
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
	public List<ShowGoods> listRecommend() throws Exception;

	/**
	 * 根据商品条件查询关联店铺
	 * 
	 * @param show
	 * @return
	 * @throws Exception
	 */
	public List<GoodsMerchant> listMerchantByWhere(GoodsShow show, Range range) throws Exception;

	/**
	 * 店铺相关产品
	 * 
	 * @param show
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listMerchantByWhereGoods(GoodsShow show) throws Exception;

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
	 * 阿胶后台查询我的足迹
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<FootprintGoods> listFootprintGoods() throws Exception;
	/**
	 * 保存我的足迹
	 * @param uid
	 * @param gid
	 * @return
	 * @throws DataSavingException
	 */
	public boolean saveFootprint(String uid,String gid) throws DataSavingException;
	/**
	 * 在结果中查询商品
	 * @param bo
	 * @param range
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listGoodsByGoodsResult(GoodsShow bo, Range range) throws Exception;
}
