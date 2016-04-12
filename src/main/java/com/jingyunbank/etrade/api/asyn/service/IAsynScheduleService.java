package com.jingyunbank.etrade.api.asyn.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.asyn.bo.AsynSchedule;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface IAsynScheduleService {
	
	public boolean save(AsynSchedule asynSchedule) throws DataSavingException;
	
	public boolean refreshStatus(String id, String status) throws DataRefreshingException;
	
	public boolean remove(String id) throws DataRemovingException;
	
	public AsynSchedule single(String id);
	
	public List<AsynSchedule> list(Range range);
	

}
