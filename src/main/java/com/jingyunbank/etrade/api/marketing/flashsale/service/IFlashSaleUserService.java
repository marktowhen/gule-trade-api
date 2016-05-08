package com.jingyunbank.etrade.api.marketing.flashsale.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.flashsale.bo.FlashSaleUser;

public interface IFlashSaleUserService {

	public boolean save(FlashSaleUser flashSaleUser) throws DataSavingException;
	
	public Optional<FlashSaleUser> single(String id);
	
	public boolean refreshStatus(String id,String orderStatus)throws DataRefreshingException;
	
	public boolean refreshStatus(String ID, String currentStatus,
			String flowStatusFlag) throws DataRefreshingException;
}
