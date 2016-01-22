package com.jingyunbank.etrade.api.user.service;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.user.bo.QQLogin;

public interface IQQLoginService {

	public QQLogin single(String accessToken);
	
	public boolean save(QQLogin qqlogin) throws DataSavingException;
	
	public boolean refreshLoginTime(String accessToken) throws DataRefreshingException;
}
