package com.jingyunbank.etrade.api.user.service;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.user.bo.UserInfo;
import com.jingyunbank.etrade.api.user.bo.Users;
import com.jingyunbank.etrade.api.user.bo.WeiboLogin;

public interface IWeiboLoginService {

	public WeiboLogin single(String accessTokenOrWeiboUID);
	
	public boolean save(WeiboLogin weibo) throws DataSavingException;
	
	public boolean save(WeiboLogin weibo, Users user, UserInfo info) throws DataSavingException;
	
	public boolean refreshLoginTime(String accessTokenOrWeiboUID) throws DataRefreshingException;
	
	
}
