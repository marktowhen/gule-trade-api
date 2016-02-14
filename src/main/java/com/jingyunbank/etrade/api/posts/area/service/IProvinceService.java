package com.jingyunbank.etrade.api.posts.area.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.posts.area.bo.Province;

public interface IProvinceService {

	/**
	 * 新增
	 * @param bo
	 * @return
	 * @throws DataSavingException
	 * 2015年11月18日 qxs
	 */
	public boolean save(Province bo) throws DataSavingException;
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
	public boolean refresh(Province bo) throws DataRefreshingException;
	/**
	 * 分页查询
	 * @param bo
	 * @param range
	 * @return
	 * 2015年11月18日 qxs
	 */
	public List<Province> list(Province bo, Range range);
	/**
	 * 不分页查询
	 * @param bo
	 * @return
	 * 2015年11月18日 qxs
	 */
	public List<Province> list(Province bo);
	/**
	 * 单个详情
	 * @param id
	 * @return
	 * 2015年11月18日 qxs
	 */
	public Province single(int id);
	
	/**
	 * 根据国家查询
	 * @param countryID
	 * @return
	 * 2015年11月21日 qxs
	 */
	public List<Province> listByCountry(int countryID);
	
	/**
	 * 根据id判断是否偏远地区
	 * @param provinceID
	 * @return
	 * 2016年1月7日 qxs
	 */
	public boolean isFaraway(int provinceID);
}
