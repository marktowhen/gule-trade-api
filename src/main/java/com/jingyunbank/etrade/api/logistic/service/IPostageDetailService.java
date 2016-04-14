package com.jingyunbank.etrade.api.logistic.service;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.logistic.bo.PostageDetail;

public interface IPostageDetailService {

	public boolean save(PostageDetail detail) throws DataSavingException;
	
	public boolean refresh(PostageDetail detail) throws DataRefreshingException;
	
	public PostageDetail single(String ID);
	
	public List<PostageDetail> list(String postageID);
	
	public boolean remove(String ID) throws DataRemovingException;
	
	public boolean removeByPostageID(String postageID) throws DataRemovingException;
	
	public PostageDetail singleFit(String postageID, int cityID,String transportType);
	
	public List<String> listTransportType(String postageID);

	public boolean save(List<PostageDetail> details) throws DataSavingException;
	
	public boolean deleteBatch(String postageID) throws DataRemovingException;
	
}
