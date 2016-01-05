package com.jingyunbank.etrade.api.posts.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.posts.bo.HelpCenterDetail;

public interface IHelpCenterDetailService {
	
	/**
	 * 查询单个
	 * @param id
	 * @return
	 * 2015年12月10日 qxs
	 */
	public Optional<HelpCenterDetail> single(String id);
	
	/**
	 * 根据类别查找明细
	 * @param categoryID
	 * @return
	 * 2015年12月11日 qxs
	 */
	public List<HelpCenterDetail> listAllValid(String categoryID);
	/**
	 * 分页查看
	 * @param range
	 * @return
	 * 2015年12月18日 qxs
	 */
	public List<HelpCenterDetail> list(Range range);
	
	/**
	 * 新增
	 * @param helpCenterDetail
	 * @return
	 * @throws DataSavingException
	 * 2015年12月10日 qxs
	 */
	public boolean save(HelpCenterDetail helpCenterDetail) throws DataSavingException;
	/**
	 * 修改
	 * @param helpCenterDetail
	 * @return
	 * @throws DataRefreshingException
	 * 2015年12月10日 qxs
	 */
	public boolean refresh(HelpCenterDetail helpCenterDetail) throws DataRefreshingException;
	
	/**
	 * 删除
	 * @param id
	 * @return
	 * @throws DataRemovingException
	 * 2015年12月10日 qxs
	 */
	public boolean remove(String id) throws DataRemovingException;
	
	/**
	 * 删除
	 * @param categoryID
	 * @return
	 * @throws DataRemovingException
	 * 2015年12月10日 qxs
	 */
	public boolean removeByCategory(String categoryID) throws DataRemovingException;

	

}
