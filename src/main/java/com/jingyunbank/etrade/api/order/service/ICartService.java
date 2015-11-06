package com.jingyunbank.etrade.api.order.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.bo.Cart;


public interface ICartService {

	public void save(Cart cart) throws DataSavingException;
	
	public void refresh(Cart cart) throws DataRefreshingException;
	
	public void remove(Cart cart) throws DataRemovingException;
	
	public List<Cart> list(String uid);
	
	public List<Cart> list(String uid, Range range);
}
