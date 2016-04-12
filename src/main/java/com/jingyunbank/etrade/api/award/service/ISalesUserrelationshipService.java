package com.jingyunbank.etrade.api.award.service;

import com.jingyunbank.etrade.api.award.bo.SalesUserrelationship;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface ISalesUserrelationshipService {
	
	public boolean save(SalesUserrelationship salesUserrelationship) throws DataSavingException;
	
	public SalesUserrelationship singleBySID(String SID );
	
	public SalesUserrelationship singleByUID(String UID );
	
	

}
