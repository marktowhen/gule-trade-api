package com.jingyunbank.etrade.api.logistic.service.context;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.logistic.bo.Postage;
import com.jingyunbank.etrade.api.logistic.bo.PostageDetail;

public interface IPostageManageService {

	/**
	 * 保存模板及详情
	 * @param postage
	 * @param details
	 * @return
	 * @throws DataSavingException
	 * 2016年4月19日 qxs
	 */
	public boolean save(Postage postage, List<PostageDetail> details) throws DataSavingException;
	/**
	 * 刷新模板及详情
	 * @param postage
	 * @param details
	 * @return
	 * @throws DataRemovingException
	 * @throws DataRefreshingException
	 * @throws DataSavingException
	 * 2016年4月19日 qxs
	 */
	public boolean refresh(Postage postage, List<PostageDetail> details) throws DataRemovingException,DataRefreshingException, DataSavingException;
	/**
	 * 删除模板及详情
	 * @param postageID
	 * @return
	 * @throws DataRemovingException
	 * 2016年4月19日 qxs
	 */
	public boolean remove(String postageID) throws DataRemovingException;
	
	/**
	 * 查询某一店铺的所有邮费模板及详情
	 * @param MID
	 * @return
	 * 2016年4月19日 qxs
	 */
	public List<Postage> listOneShopWithDetail(String MID);
}
