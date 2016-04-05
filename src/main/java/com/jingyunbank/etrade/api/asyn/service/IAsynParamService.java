package com.jingyunbank.etrade.api.asyn.service;

import java.util.List;

import com.jingyunbank.etrade.api.asyn.bo.AsynParam;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface IAsynParamService {
	
	public boolean saveMutl(List<AsynParam> asymParams) throws DataSavingException;
	
	public List<AsynParam> list(String schedule);
	

}
