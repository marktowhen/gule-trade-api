package com.jingyunbank.etrade.api.area.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.area.bo.City;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface ICityService {
	
	public boolean save(City bo) throws DataSavingException;
	
	public boolean remove(int id) throws DataRemovingException;
	
	public boolean refresh(City bo) throws DataRefreshingException;
	
	public List<City> selectList(City bo, Range range);
	
	public List<City> selectList(City bo);
	
	public City selectSingle(int id);

}
