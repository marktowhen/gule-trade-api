package com.jingyunbank.etrade.api.goods.service;


import java.util.List;
import java.util.Optional;


import com.jingyunbank.etrade.api.goods.bo.Brand;

/**
 * 
 * Title: 品牌管理接口
 * 
 * @author duanxf
 * @date 2015年12月15日
 */
public interface IBrandService {

	/**
	 * 保存品牌
	 * 
	 * @param brand
	 * @return
	 * @throws Exception
	 */
	public boolean save(Brand brand) throws Exception;

	/**
	 * 查询品牌by ID
	 * 
	 * @param bid
	 * @return
	 * @throws Exception
	 */
	public Optional<Brand> singleById(String bid) throws Exception;

	/**
	 * 修改品牌属性
	 * @param brand
	 * @return
	 * @throws Exception
	 */
	public boolean refreshBrand(Brand brand) throws Exception;
	
	
	public boolean delBrand(String bid) throws Exception;

	/**
	 * 根据MID 查询brand
	 * @param mid
	 * @return
	 * @throws Exception
	 */
	public List<Brand> listBrandsByMid(String mid) throws Exception;
	
	/**
	 * 查询所有品牌
	 * @return
	 * @throws Exception
	 */
	public List<Brand> listBrands() throws Exception;
}
