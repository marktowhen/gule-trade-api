package com.jingyunbank.etrade.api.posts.help.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.posts.help.bo.HelpCenterCategory;

public interface IHelpCenterCategoryService {
	
	/**
	 * 单个查询
	 * @param id
	 * @return
	 * 2015年12月10日 qxs
	 */
	public Optional<HelpCenterCategory> single(String id); 
	
	/**
	 * 查询所有有效类别
	 * @param range 
	 * @return
	 * 2015年12月10日 qxs
	 */
	public List<HelpCenterCategory> listAllValid(Range range);
	
	/**
	 * 查询所有有效类别
	 * @return
	 * 2015年12月10日 qxs
	 */
	public List<HelpCenterCategory> listAllValid();
	
	/**
	 * 新增
	 * @param helpCenterCategory
	 * @return
	 * @throws DataSavingException
	 * 2015年12月10日 qxs
	 */
	public boolean save(HelpCenterCategory helpCenterCategory) throws DataSavingException ;
	
	/**
	 * 修改
	 * @param helpCenterCategory
	 * @return
	 * @throws DataRefreshingException
	 * 2015年12月10日 qxs
	 */
	public boolean refresh(HelpCenterCategory helpCenterCategory) throws DataRefreshingException;
	
	/**
	 * 删除
	 * @param id
	 * @return
	 * 2015年12月10日 qxs
	 * @throws DataRemovingException 
	 */
	public boolean remove(String id) throws DataRemovingException;

}
