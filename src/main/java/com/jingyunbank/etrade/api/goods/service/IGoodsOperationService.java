package com.jingyunbank.etrade.api.goods.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.goods.bo.GoodsOperation;
import com.jingyunbank.etrade.api.goods.bo.ShowGoods;

/**
 * 
* Title: 	商品的操作类
* @author    duanxf
* @date      2015年11月13日
 */
public interface IGoodsOperationService {
	/**
	 * 保存商品
	 * @param goodsOperation
	 * @return
	 */
	public boolean save(GoodsOperation goodsOperation) throws Exception;
	
	/**
	 * 根据商品ID 获取商品详细信息
	 * @param gid
	 * @return
	 * @throws Exception
	 */
	public Optional<ShowGoods> singleById(String gid) throws Exception;
	
	/**
	 * 修改商品
	 * @param goods
	 * @return
	 * @throws Exception
	 */
	public boolean refreshGoods(GoodsOperation goodsOperation) throws Exception;
	
	/**
	 * 更改商品的库存和销量
	 * @param gid 商品ID
	 * @param count 销售数量
	 * @return true 修改成功  false 修改失败
	 * @throws Exception
	 */
	public boolean refreshGoodsVolume(String gid,int count) throws Exception;
	
	/**
	 * 商品上架
	 * @param gid
	 * @return
	 * @throws Exception
	 */
	public boolean refreshGoodsUp(String gid)throws Exception;
	
	/**
	 * 商品下架
	 * @param gid
	 * @return
	 * @throws Exception
	 */
	public boolean refreshGoodsDown(String gid)throws Exception;
	
	/**
	 * 获取所有店铺
	 * @return
	 * @throws Exception
	 */
	public  List<ShowGoods> listMerchant()throws Exception;
	/**
	 * 根据商家MID 查询当前上架所属的品牌
	 * @param mid
	 * @return
	 * @throws Exception
	 */
	public List<ShowGoods> listBrandsByMid(String mid)throws Exception;
}
