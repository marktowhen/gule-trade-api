package com.jingyunbank.etrade.api.information.service;

import java.util.List;
import java.util.Optional;


import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.information.bo.InformationDetails;

public interface IInformationDetailsService {
	
	public boolean save(InformationDetails infomationDetails) throws DataSavingException;
	
	public void remove(String id) throws DataRemovingException;
	
	public boolean refresh(InformationDetails infomationDetails) throws DataRefreshingException;
	
	public List<InformationDetails> getDeailsBySiteid(String sid);
	
	public Optional<InformationDetails> getDetailByid(String id);
}
