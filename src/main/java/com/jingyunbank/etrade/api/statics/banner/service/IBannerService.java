package com.jingyunbank.etrade.api.statics.banner.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.statics.banner.bo.Banner;

public interface IBannerService {

	public boolean save(Banner banner) throws DataSavingException;
	
	public boolean refresh(Banner banner) throws DataRefreshingException;
	
	public boolean refresh(String id, int order) throws DataRefreshingException;
	
	public boolean remove(String id) throws DataRemovingException;
	
	public List<Banner> list(String type);
	
	public List<Banner> list(String type, Range range);
	
	public Banner single(String id);

	public int count(String type);

	
}
