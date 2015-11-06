package com.jingyunbank.etrade.api.user;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.user.bo.Users;

public interface IUserService {

	public Optional<Users> getByUid(String id);
	
	public Optional<Users> getByPhone(String phone);
	
	public Optional<Users> getByUname(String username);
	
	public Optional<Users> getByEmail(String email);
	
	/**
	 * 用户用户登录的查询，提供用户的键值（可以是用户名，手机号，邮箱）
	 * 该方法主要用户的登录查询
	 * <br>
	 * @param key （可以是用户名，手机号，邮箱）互相不冲突
	 * @return
	 */
	public Optional<Users> getByKey(String key);
	
	public boolean save(Users user) throws DataSavingException;
	
	public boolean update(Users user) throws DataRefreshingException;
	
	public List<Users> list(Range range);
	
	public List<Users> list(Date start, Date end);
	
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
