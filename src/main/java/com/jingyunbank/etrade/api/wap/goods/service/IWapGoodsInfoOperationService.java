package com.jingyunbank.etrade.api.wap.goods.service;

import com.jingyunbank.etrade.api.wap.goods.bo.GoodsInfo;

/**
 * 
 * Title: WapGoodsOperationService 商品操作
 * 
 * @author duanxf
 * @date 2016年4月11日
 */
public interface IWapGoodsInfoOperationService {

	void saveGoodsInfo(GoodsInfo infoBO) throws Exception;

	void removeGoodsInfo(String gid) throws Exception;

	void removeGoodsInfoById(String infoId) throws Exception;
}
