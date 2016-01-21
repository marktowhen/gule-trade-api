package com.jingyunbank.etrade.api.logistic.service;

import java.util.List;

import com.jingyunbank.etrade.api.logistic.bo.Express;

public interface IExpressService {
	
	public List<Express> listExpress() throws Exception; 
}
