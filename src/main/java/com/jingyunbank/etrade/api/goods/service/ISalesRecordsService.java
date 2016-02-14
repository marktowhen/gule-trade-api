package com.jingyunbank.etrade.api.goods.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.goods.bo.SalesRecord;

public interface ISalesRecordsService {

	public void save(SalesRecord record) throws DataSavingException;

	/**
	 * 查询商品的交易记录
	 * @param gid
	 * @param range
	 * @return
	 * @throws Exception
	 */
	public List<SalesRecord> listRange(String gid, Range range) throws Exception;
	
	/**
	 * 商品销量
	 * @param gid
	 * @param year
	 * @param month
	 * @return
	 * 2016年2月14日 qxs
	 */
	public Integer count(String gid, String year, String month);
}
