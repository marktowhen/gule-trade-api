package com.jingyunbank.etrade.api.advice.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.advice.bo.AdviceDetails;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface IAdviceDetailsService {
	
	public boolean save(AdviceDetails adviceDetails) throws DataSavingException;
	
	public void remove(String id) throws DataRemovingException;
	
	public boolean refresh(AdviceDetails adviceDetails) throws DataRefreshingException;
	
	public List<AdviceDetails> getDeailsBySiteid(String sid);
	
	public Optional<AdviceDetails> getDetailByid(String id);
}
