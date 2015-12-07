package com.jingyunbank.etrade.api.point.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.point.bo.PointLog;

public interface IPointLogService {

	/**
	 * 列表查询
	 * @param uid
	 * @return
	 * 2015年12月1日 qxs
	 */
	public List<PointLog> list(String uid);
	
	/**
	 * 列表查询
	 * @param uid
	 * @param range
	 * @return
	 * 2015年12月1日 qxs
	 */
	public List<PointLog> list(String uid, Range range);
	
	/**
	 * 新增
	 * @param pointLog
	 * @return
	 * @throws DataSavingException
	 * 2015年12月1日 qxs
	 */
	public boolean save(PointLog pointLog) throws DataSavingException;
}
