package com.jingyunbank.etrade.api.information.service;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.information.bo.InformationSite;

public interface IInformationSiteService {
	
	public boolean save(InformationSite informationSite) throws DataSavingException;
	
	public List<InformationSite> getSitesBySiteid(String siteid);
}
