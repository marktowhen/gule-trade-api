package com.jingyunbank.etrade.api.logistic.service.context;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.logistic.bo.Postage;
import com.jingyunbank.etrade.api.logistic.bo.PostageDetail;

public interface IPostageManageService {

	public boolean save(Postage postage, List<PostageDetail> details) throws DataSavingException;
	
	public boolean refresh(Postage postage, List<PostageDetail> details) throws DataRemovingException,DataRefreshingException, DataSavingException;
	
	public boolean remove(String postageID) throws DataRemovingException;
	
	public List<Postage> listOneShopWithDetail(String MID);
}
