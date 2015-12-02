package com.jingyunbank.etrade.api.point.service.context;


public interface IPointContextService {

	/**
	 * 用户增加积分
	 * @param uid
	 * @param point
	 * @param remark 原因
	 * @return
	 * 2015年12月2日 qxs
	 * @throws Exception 
	 */
	public boolean addPoint(String uid, int point, String remark) throws Exception;
	
	/**
	 * 减少积分
	 * @param uid
	 * @param point
	 * @param remark
	 * @return
	 * 2015年12月2日 qxs
	 * @throws Exception 
	 */
	public boolean minusPoint(String uid, int point, String remark) throws Exception;
	
}
