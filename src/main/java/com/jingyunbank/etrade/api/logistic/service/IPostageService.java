package com.jingyunbank.etrade.api.logistic.service;

import java.math.BigDecimal;
import java.util.List;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.logistic.bo.Postage;
import com.jingyunbank.etrade.api.logistic.bo.PostageCalculate;


public interface IPostageService {

	
	public boolean save(Postage postage) throws DataSavingException;
	
	public boolean refresh(Postage postage) throws DataRefreshingException;
	
	public boolean remove(String ID) throws DataRemovingException;
	
	/**
	 * 根据id查主表信息
	 * @param ID
	 * @return
	 * 2016年4月12日 qxs
	 */
	public Postage single(String ID) ;
	
	public List<Postage> list(String MID);
	
	public List<Postage> list(List<String> postageIDList);
	
	
	/**
	 * 根据postage表 ID和city 查出邮费和邮费详情
	 * @param ID
	 * @param cityID
	 * @return Postage Postage.PostageDetail
	 * 2016年4月12日 qxs
	 */
	public Postage singleWithDetail(String ID , int cityID) ;
	
}
