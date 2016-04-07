package com.jingyunbank.etrade.api.asyn.service;

import java.util.List;
import java.util.Map;

import com.jingyunbank.etrade.api.asyn.bo.AsynParam;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface IAsynParamService {
	
	public boolean saveMutl(List<AsynParam> asymParams) throws DataSavingException;
	
	public List<AsynParam> list(String scheduleID);

	public boolean saveMutl(String scheduleID, Map<String, String> params) throws DataSavingException;
	
	public  Map<String, String> getMap(String scheduleID);

}
