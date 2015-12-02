package com.jingyunbank.etrade.api.point.service;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.point.bo.Point;

public interface IPointService {
	/**
	 * 新增
	 * @param point
	 * @return
	 * 2015年12月1日 qxs
	 * @throws DataSavingException 
	 */
	public boolean save(Point point) throws DataSavingException;
	
	/**
	 * 更新
	 * @param uid
	 * @param point
	 * @return
	 * 2015年12月1日 qxs
	 * @throws DataRefreshingException 
	 */
	public boolean refresh(String uid, int point) throws DataRefreshingException;
	/**
	 * 增加积分
	 * @param uid
	 * @param point 传入10表示加上10
	 * @return
	 * 2015年12月1日 qxs
	 * @throws DataRefreshingException 
	 */
	public boolean addPoint(String uid, int point) throws DataRefreshingException;
	/**
	 * 减少积分
	 * @param uid
	 * @param point 传入 10 表示减去10
	 * @return
	 * 2015年12月1日 qxs
	 * @throws DataRefreshingException 
	 */
	public boolean minusPoint(String uid, int point) throws DataRefreshingException;
	
	/**
	 * 获取用户积分
	 * @param uid
	 * @return
	 * 2015年12月2日 qxs
	 */
	public Point get(String uid);
	
	/**
	 * 获得用户当前积分
	 * @param uid
	 * @return
	 * 2015年12月1日 qxs
	 */
	public int getPoint(String uid);
	

}
