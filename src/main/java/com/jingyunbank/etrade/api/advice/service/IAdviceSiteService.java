package com.jingyunbank.etrade.api.advice.service;

import java.util.List;

import com.jingyunbank.etrade.api.advice.bo.AdviceSite;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface IAdviceSiteService {
	
	public boolean save(AdviceSite adviceSite) throws DataSavingException;
	
	public List<AdviceSite> getSitesBySiteid(String siteid);
}
