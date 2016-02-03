package com.jingyunbank.etrade.api.posts.help.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.posts.help.bo.InformationSite;

public interface IInformationSiteService {
	
	public boolean save(InformationSite informationSite) throws DataSavingException;
		
	public List<InformationSite> list(String informationID);
	/**
	 * 范围查询出所有的信息
	 * @param informationID
	 * @param range
	 * @return
	 */
	public List<InformationSite> list(String informationID,Range range);
}
