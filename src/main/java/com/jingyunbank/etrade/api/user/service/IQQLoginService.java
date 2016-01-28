package com.jingyunbank.etrade.api.user.service;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.user.bo.QQLogin;
import com.jingyunbank.etrade.api.user.bo.UserInfo;
import com.jingyunbank.etrade.api.user.bo.Users;

public interface IQQLoginService {

	public QQLogin single(String ID);
	
	public boolean save(QQLogin qqlogin) throws DataSavingException;
	
	public boolean refreshByID(String id, String token, String uid) throws DataRefreshingException;

	public boolean save(QQLogin qq, Users user, UserInfo userInfo) throws DataSavingException;
}
