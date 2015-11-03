package com.jingyunbank.etrade.api.order.service;

public interface IOrderNoService {

	public IOrderNoService setMID(String mid);
	
	public IOrderNoService setUID(String uid);
	
	public long next();
	
	public String nexts();
}
