package com.jingyunbank.etrade.api.information.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.information.bo.InformationDetails;

public interface IInformationDetailsService {
	/**
	 * 保存对应的信息
	 * @param infomationDetails
	 * @return
	 * @throws DataSavingException
	 */
	public boolean save(InformationDetails infomationDetails) throws DataSavingException;
	/**
	 * 删除对应的信息
	 * @param id
	 * @throws DataRemovingException
	 */
	public void remove(String id) throws DataRemovingException;
	/**
	 * 修改详情信息
	 * @param infomationDetails
	 * @return
	 * @throws DataRefreshingException
	 */
	public boolean refresh(InformationDetails infomationDetails) throws DataRefreshingException;
	/**
	 * 有范围的查询
	 * @param sid
	 * @param range
	 * @return
	 */
	public List<InformationDetails> list(String sid,Range range);
	/**
	 * 查出单个的详情对象
	 * @param id
	 * @return
	 */
	public Optional<InformationDetails> single(String id);
	
	public List<InformationDetails> list(Range range);
	/**
	 * 查出二级分别对应的所有三级页面
	 * @param sid
	 * @return
	 */
	public List<InformationDetails> list(String sid);
}
