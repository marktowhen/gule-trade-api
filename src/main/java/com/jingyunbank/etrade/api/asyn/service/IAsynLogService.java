package com.jingyunbank.etrade.api.asyn.service;

import com.jingyunbank.etrade.api.asyn.bo.AsynLog;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface IAsynLogService {

	public boolean save(AsynLog asynLog) throws DataSavingException;
	
	public boolean save(String scheduleID, String status, String remark) throws DataSavingException;
}
