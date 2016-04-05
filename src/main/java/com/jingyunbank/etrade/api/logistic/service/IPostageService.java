package com.jingyunbank.etrade.api.logistic.service;

import java.math.BigDecimal;
import java.util.List;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.logistic.bo.Postage;


public interface IPostageService {

	/**
	 * 计算寄往<code>provenceid</code>省份的价格为<code>orderprice</code>
	 * 重量为<code>weight</code>的订单的邮费
	 * @param orderprice
	 * @param provenceid
	 * @param weight
	 * @return
	 */
	public BigDecimal calculate(BigDecimal orderprice, int provenceid);
	
	public List<Postage> calculate(List<Postage> postages);
	
	public boolean save(Postage postage) throws DataSavingException;
	
	public boolean refresh(Postage postage) throws DataRefreshingException;
	
	public boolean remove(String ID) throws DataRemovingException;
	
	public Postage single(String ID) ;
	
	public List<Postage> list(String MID);
	
	//public BigDecimal calculate(BigDecimal orderprice, int provenceid);
	
}
