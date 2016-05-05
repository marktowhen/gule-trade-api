package com.jingyunbank.etrade.api.marketing.flashsale.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.flashsale.bo.FlashSale;
import com.jingyunbank.etrade.api.marketing.flashsale.bo.FlashSaleShow;

public interface IFlashSaleService {
	
	public boolean saveFlashSale(FlashSale flashSale) throws DataSavingException;
	
	public List<FlashSaleShow> getFlashSaleMany(String mid,Range range);
	
	public Optional<FlashSale> single(String id);
	
	public boolean refresh(FlashSale flashSale) throws DataRefreshingException;
}
