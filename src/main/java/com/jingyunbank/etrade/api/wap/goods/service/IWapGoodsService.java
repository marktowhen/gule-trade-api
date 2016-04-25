package com.jingyunbank.etrade.api.wap.goods.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.wap.goods.bo.GoodsDeatil;
import com.jingyunbank.etrade.api.wap.goods.bo.GoodsInfo;
import com.jingyunbank.etrade.api.wap.goods.bo.GoodsPostage;
import com.jingyunbank.etrade.api.wap.goods.bo.GoodsSku;
import com.jingyunbank.etrade.api.wap.goods.bo.GoodsSkuCondition;
import com.jingyunbank.etrade.api.wap.goods.bo.ShowGoods;

/**
 * 
 * Title: IGoodsService 商品
 * 
 * @author duanxf
 * @date 2016年3月31日
 */
public interface IWapGoodsService {

	/**
	 * 根据商品名称, 商家,类型 ,排序 查询 展示的商品信息
	 * 
	 * @param mid
	 * @param tid
	 * @param order
	 * @param name
	 * @return
	 * @throws Exception
	 */
	List<ShowGoods> listGoods(String mid, String tid, String order, String name,String from,String size) throws Exception;

	/**
	 * 获取商品查询的 sku 条件
	 * 
	 * @param gid
	 * @return
	 * @throws Exception
	 */
	Optional<GoodsSkuCondition> singleGoodsSkuCondition(String gid) throws Exception;

	/**
	 * 根据商品ID和选择的sku条件获取商品的信息
	 * 
	 * @param gid
	 * @param condition
	 * @return
	 * @throws Exception
	 */
	Optional<GoodsSku> singleGoodsSku(String gid, String condition) throws Exception;

	/**
	 * 根据商品id获取商品的概要信息
	 * 
	 * @param gid
	 * @return
	 * @throws Exception
	 */
	List<GoodsInfo> listGoodsInfo(String gid) throws Exception;

	/**
	 * 商品详情展示
	 * 
	 * @param gid
	 * @return
	 * @throws Exception
	 */
	Optional<GoodsDeatil> singleGoodsDetail(String gid) throws Exception;

	/**
	 * 用于购买后修改商品的库存
	 * 
	 * @param skuid
	 *            单件sku信息
	 * @param count
	 * @return
	 * @throws Exception
	 */
	boolean modifyStock(String skuid, String count) throws Exception;

	/**
	 * 根据多个商品的id 获取 商品的库存
	 * 
	 * @param skuids
	 * @return
	 * @throws Exception
	 */
	List<GoodsSku> listStockBySkuIds(List<String> skuids) throws Exception;

	/**
	 * 获取当前商品的快递信息(暂时不使用)
	 * 
	 * @param gid
	 * @return
	 * @throws Exception
	 */
	Optional<GoodsPostage> singleGoodsPostage(String gid) throws Exception;

	/**
	 * 根据商品的id获取当前商品的快递模板id
	 * 
	 * @param gid
	 * @return
	 * @throws Exception
	 */
	String singlePidByGid(String gid) throws Exception;

}
