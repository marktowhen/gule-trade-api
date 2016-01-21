package com.jingyunbank.etrade.api.user.service;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.user.bo.Employee;

public interface IEmployeeService {

	public void save(Employee employee) throws DataSavingException;
	
	public void refresh(Employee employee) throws DataRefreshingException;
	
	public void remove(String id) throws DataRemovingException;
	
	public boolean isEmployee(String mobile);
	
}
