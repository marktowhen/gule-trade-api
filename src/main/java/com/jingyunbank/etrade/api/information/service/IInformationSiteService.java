package com.jingyunbank.etrade.api.information.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.information.bo.InformationSite;

public interface IInformationSiteService {
	
	public boolean save(InformationSite informationSite) throws DataSavingException;
	
	public List<InformationSite> getSitesBySiteid(String siteid);
	
	public Optional<InformationSite> singleSitesByName(String name);
	
	public List<InformationSite> getSite(String informationID,Range range);
}
