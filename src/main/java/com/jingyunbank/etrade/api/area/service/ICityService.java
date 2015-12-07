package com.jingyunbank.etrade.api.area.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.area.bo.City;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface ICityService {
	
	/**
	 * 新增
	 * @param bo
	 * @return
	 * @throws DataSavingException
	 * 2015年11月18日 qxs
	 */
	public boolean save(City bo) throws DataSavingException;
	/**
	 * 删除
	 * @param id
	 * @return
	 * @throws DataRemovingException
	 * 2015年11月18日 qxs
	 */
	public boolean remove(int id) throws DataRemovingException;
	
	/**
	 * 修改
	 * @param bo
	 * @return
	 * @throws DataRefreshingException
	 * 2015年11月18日 qxs
	 */
	public boolean refresh(City bo) throws DataRefreshingException;
	/**
	 * 分页查询
	 * @param bo
	 * @param range
	 * @return
	 * 2015年11月18日 qxs
	 */
	public List<City> list(City bo, Range range);
	/**
	 * 不分页查询
	 * @param bo
	 * @return
	 * 2015年11月18日 qxs
	 */
	public List<City> list(City bo);
	/**
	 * 单个详情
	 * @param id
	 * @return
	 * 2015年11月18日 qxs
	 */
	public City single(int id);
	/**
	 * 根据省份查city
	 * @param provinceID
	 * @return
	 * 2015年11月21日 qxs
	 */
	public List<City> listByProvince(int provinceID);

}
