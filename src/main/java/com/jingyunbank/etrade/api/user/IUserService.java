package com.jingyunbank.etrade.api.user;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.exception.DataUpdatingException;
import com.jingyunbank.etrade.api.user.bo.User;

public interface IUserService {

	public Optional<User> getByUid(String id);
	
	public Optional<User> getByPhone(String phone);
	
	public Optional<User> getByUname(String username);
	
	public Optional<User> getByEmail(String email);
	
	/**
	 * 用户用户登录的查询，提供用户的键值（可以是用户名，手机号，邮箱）
	 * 该方法主要用户的登录查询
	 * <br>
	 * @param key （可以是用户名，手机号，邮箱）互相不冲突
	 * @return
	 */
	public Optional<User> getByKey(String key);
	
	public boolean save(User user) throws DataSavingException;
	
	public boolean update(User user) throws DataUpdatingException;
	
	public List<User> list(Range range);
	
	public List<User> list(Date start, Date end);
	
	public boolean phoneExists(String phone);
	
	public boolean unameExists(String uname);
	
	public boolean emailExists(String email);
	
	/**
	 * equals to(phoneExists(key) | unameExists(uname) | emailExists(email))
	 * @param key (username | phone | email)
	 * @return
	 */
	public boolean exists(String key);
	
}
