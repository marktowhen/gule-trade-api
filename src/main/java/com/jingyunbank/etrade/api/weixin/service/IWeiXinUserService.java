package com.jingyunbank.etrade.api.weixin.service;


import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.weixin.bo.SNSUserInfoBo;

public interface IWeiXinUserService {
	
	public boolean addUser(SNSUserInfoBo userInfo) throws DataSavingException, DataRefreshingException;
	
	public Optional<SNSUserInfoBo> getUsers(String openId);
	
	public Optional<SNSUserInfoBo> singles(String id);
}
