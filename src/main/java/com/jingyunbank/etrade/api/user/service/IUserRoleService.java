package com.jingyunbank.etrade.api.user.service;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.user.bo.UserRole;

public interface IUserRoleService {

	public List<UserRole> list(String uid);
	
	public UserRole single(String id);
	
	public boolean delete(String[]ids) throws DataRemovingException;
	
	public boolean isAuthoritative(String uid, String roleCode);
}
