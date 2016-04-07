package com.jingyunbank.etrade.api.wap.goods.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.wap.goods.bo.GoodsType;

/**
 * 
 * Title: IGoodsTypeService 商品类型
 * 
 * @author duanxf
 * @date 2016年3月31日
 */
public interface IGoodsTypeService {

	/**
	 * 保存类别
	 * 
	 * @param goodsType
	 * @return
	 * @throws Exception
	 */
	public void save(GoodsType goodsType) throws Exception;

	/**
	 * 查询类别根据ID
	 * 
	 * @param tid
	 * @return
	 * @throws Exception
	 */
	public Optional<GoodsType> singleById(String tid) throws Exception;

	/**
	 * 修改 类别
	 * 
	 * @param goodsType
	 * @return
	 * @throws Exception
	 */
	public void refreshGoodsType(GoodsType goodsType) throws Exception;

	/**
	 * 删除类别
	 * 
	 * @param tid
	 * @return
	 * @throws Exception
	 */
	public void delGoodsType(String tid) throws Exception;

	/**
	 * 根据名称查询类别
	 * 
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public List<GoodsType> listGoodsTypesByName(String name) throws Exception;

	/**
	 * 查询所有类别
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<GoodsType> listGoodsTypes() throws Exception;
}
