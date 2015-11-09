package com.jingyunbank.etrade.api.user;

import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.user.bo.UserInfo;

public interface IUserInfoService {
public boolean save(UserInfo uinfo) throws DataSavingException;
	
	public boolean refresh(UserInfo uinfo) throws DataRefreshingException;
	
	public Optional<UserInfo> getByUid(String id);
	
	public Optional<UserInfo> getByPhone(String phone);
	
	public Optional<UserInfo> getByUname(String username);
	
	public Optional<UserInfo> getByEmail(String email);
	
	public int UidExists(String uid);
}
