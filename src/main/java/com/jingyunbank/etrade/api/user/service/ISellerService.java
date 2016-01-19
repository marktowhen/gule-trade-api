package com.jingyunbank.etrade.api.user.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.user.bo.Seller;

public interface ISellerService {
	
	public Optional<Seller> singleByID(String id);
	
	public Optional<Seller> singleByMname(String mname);
	
	public boolean refreshPassword(String id, String password) throws DataRefreshingException;

}
