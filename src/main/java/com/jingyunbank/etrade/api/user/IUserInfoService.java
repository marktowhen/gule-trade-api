package com.jingyunbank.etrade.api.user;

import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.exception.DataUpdatingException;
import com.jingyunbank.etrade.api.user.bo.UserInfo;

public interface IUserInfoService {
public boolean save(UserInfo uinfo) throws DataSavingException;
	
	public boolean update(UserInfo uinfo) throws DataUpdatingException;
	
	public Optional<UserInfo> getByUid(String id);
	
	public Optional<UserInfo> getByPhone(String phone);
	
	public Optional<UserInfo> getByUname(String username);
	
	public Optional<UserInfo> getByEmail(String email);
}
