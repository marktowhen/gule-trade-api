package com.jingyunbank.etrade.api.wap.goods.service;

import com.jingyunbank.etrade.api.wap.goods.bo.GoodsInfo;

/**
 * 
 * Title: WapGoodsOperationService 商品操作
 * 
 * @author duanxf
 * @date 2016年4月11日
 */
public interface IWapGoodsInfoService {

	/**
	 * 保存商品的展示信息
	 * @param infoBO
	 * @throws Exception
	 */
	void saveGoodsInfo(GoodsInfo infoBO) throws Exception;

	/**
	 * 删除商品信息 by gid
	 * @param gid
	 * @throws Exception
	 */
	void removeGoodsInfo(String gid) throws Exception;

	/**
	 * 根据id 删除单条信息
	 * @param infoId
	 * @throws Exception
	 */
	void removeGoodsInfoById(String infoId) throws Exception;
}
