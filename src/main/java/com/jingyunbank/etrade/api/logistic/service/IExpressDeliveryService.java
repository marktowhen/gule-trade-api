package com.jingyunbank.etrade.api.logistic.service;

import java.util.Map;
import java.util.Optional;

import com.jingyunbank.etrade.api.logistic.bo.KDNShow;

/**
 * 
* Title:   获取快递接口返回的数据
* @author    duanxf
* @date      2016年1月21日
 */
public interface IExpressDeliveryService {

	/**
	 * 获取远程快递接口返回的数据
	 * @param map 封装调用接口需要的数据
	 * @return
	 * @throws Exception
	 */
	public Optional<KDNShow> getRemoteExpress(Map<Object, Object> map) throws Exception;
}
