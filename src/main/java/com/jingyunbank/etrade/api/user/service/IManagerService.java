package com.jingyunbank.etrade.api.user.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.user.bo.Manager;

public interface IManagerService {

	public Optional<Manager>  singleByID(String id);
	
	public Optional<Manager> singleByMname(String mname);
	
	public boolean refreshPassword(String id, String password) throws DataRefreshingException;
}
