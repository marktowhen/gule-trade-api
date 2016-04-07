package com.jingyunbank.etrade.api.wap.goods.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.wap.goods.bo.GoodsDeatil;
import com.jingyunbank.etrade.api.wap.goods.bo.GoodsInfo;
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

	List<ShowGoods> listGoods(String mid, String tid, String order, String name) throws Exception;

	Optional<GoodsSkuCondition> singleGoodsSkuCondition(String gid) throws Exception;

	Optional<GoodsSku> singleGoodsSku(String gid, String condition) throws Exception;

	List<GoodsInfo> listGoodsInfo(String gid) throws Exception;

	Optional<GoodsDeatil> singleGoodsDetail(String gid) throws Exception;

}
