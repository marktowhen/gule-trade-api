package com.jingyunbank.etrade.api.order.service;

/**
 * 订单号生成服务。<br>
 * 该服务支持集群部署，保证任意空间，任意时间
 * 不会产生重复的订单号。
 * 
 */
public interface IOrderNoGenService {

	public IOrderNoGenService setMID(String mid);
	
	public IOrderNoGenService setUID(String uid);
	
	public long next();
	
	public String nexts();
}
