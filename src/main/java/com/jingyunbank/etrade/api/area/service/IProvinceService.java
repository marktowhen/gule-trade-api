package com.jingyunbank.etrade.api.area.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.area.bo.Province;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface IProvinceService {

public boolean save(Province bo) throws DataSavingException;
	
	public boolean remove(int id) throws DataRemovingException;
	
	public boolean refresh(Province bo) throws DataRefreshingException;
	
	public List<Province> selectList(Province bo, Range range);
	
	public List<Province> selectList(Province bo);
	
	public Province selectSingle(int id);
}
