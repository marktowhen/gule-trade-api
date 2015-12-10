package com.jingyunbank.etrade.api.information.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.information.bo.HelpCenterDetail;

public interface IHelpCenterDetailService {
	
	/**
	 * 查询单个
	 * @param id
	 * @return
	 * 2015年12月10日 qxs
	 */
	public Optional<HelpCenterDetail> single(String id);
	
	/**
	 * 查询所有有效的
	 * @return
	 * 2015年12月10日 qxs
	 */
	public List<HelpCenterDetail> listAllValid();
	
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

}
