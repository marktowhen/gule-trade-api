package com.jingyunbank.etrade.api.asyn.service;

import com.jingyunbank.etrade.api.asyn.bo.AsynSchedule;
import com.jingyunbank.etrade.api.asyn.bo.AsynScheduleHistory;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface IAsynScheduleHistoryService {
	
	public boolean save(AsynScheduleHistory asynHistory) throws DataSavingException;
	
	public boolean saveFromAsynSchedule(AsynSchedule schedule) throws DataSavingException;

}
