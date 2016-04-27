package com.jingyunbank.etrade.api.weixin.service;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.weixin.bo.SNSUserInfoBo;

public interface IWeiXinUserService {
	
	public void addUser(SNSUserInfoBo userInfo) throws DataSavingException, DataRefreshingException;
}
