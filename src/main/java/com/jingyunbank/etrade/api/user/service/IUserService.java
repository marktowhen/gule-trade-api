package com.jingyunbank.etrade.api.user.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.user.bo.UserInfo;
import com.jingyunbank.etrade.api.user.bo.Users;


public interface IUserService {

	public Optional<Users> getByUID(String id);
	
	/**
	 * 用户用户登录的查询，提供用户的键值（可以是用户名，手机号，邮箱）
	 * 该方法主要用户的登录查询
	 * <br>
	 * @param key （可以是用户名，手机号，邮箱）互相不冲突
	 * @return
	 */
	public Optional<Users> getByKey(String key);
	
	public void save(Users user, UserInfo info) throws DataSavingException;
	
	public void refresh(Users user) throws DataRefreshingException;
	
	public List<Users> list(Range range);
	
	public List<Users> list(Date start, Date end);
	
	/**
	 * equals to(phoneExists(key) | unameExists(uname) | emailExists(email))
	 * @param key (username | phone | email)
	 * @return
	 */
	public boolean exists(String key);
	
	/*public boolean updatePhone(Users user) throws DataRefreshingException;*/
}
