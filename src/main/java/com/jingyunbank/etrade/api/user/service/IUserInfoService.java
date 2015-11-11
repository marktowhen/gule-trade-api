package com.jingyunbank.etrade.api.user.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.user.bo.UserInfo;

public interface IUserInfoService {
public boolean save(UserInfo uinfo) throws DataSavingException;
	
	public boolean refresh(UserInfo uinfo) throws DataRefreshingException;
	
	public Optional<UserInfo> getByUid(String id);
	
	public int UidExists(String uid);
	/**
	 * 更新头像
	 * @param uinfo
	 * @return
	 * @throws DataRefreshingException
	 * 2015年11月11日 qxs
	 */
	public boolean refreshPicture(UserInfo uinfo) throws DataRefreshingException;
}
