package com.jingyunbank.etrade.api.statics.help.service;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.statics.help.bo.Information;


public interface IInformationService {

public boolean save(Information information) throws DataSavingException;
	
	public List<Information> getInformation();
}
