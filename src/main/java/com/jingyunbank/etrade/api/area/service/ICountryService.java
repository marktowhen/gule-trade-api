package com.jingyunbank.etrade.api.area.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.area.bo.Country;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface ICountryService {
public boolean save(Country bo) throws DataSavingException;
	
	public boolean remove(int id) throws DataRemovingException;
	
	public boolean refresh(Country bo) throws DataRefreshingException;
	
	public List<Country> selectList(Country bo, Range range);
	
	public List<Country> selectList(Country bo);
	
	public Country selectSingle(int id);
}
