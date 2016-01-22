package com.jingyunbank.etrade.api.logistic.service;

import java.util.List;
import java.util.Map;

import com.jingyunbank.etrade.api.logistic.bo.LogisticData;

/**
 * 
* Title:   获取快递接口返回的数据
* @author    duanxf
* @date      2016年1月21日
 */
public interface ILogisticService {

	/**
	 * 获取远程快递接口返回的数据
	 * @param map 封装调用接口需要的数据
	 * @return
	 * @throws Exception
	 */
	public List<LogisticData> getRemoteExpress(Map<Object, Object> map) throws Exception;
}
