package com.jingyunbank.etrade.api.user.service;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.user.bo.ManagerRole;

public interface IManagerRoleService {

	public List<ManagerRole> list(String uid);
	
	public ManagerRole single(String id);
	
	public boolean delete(String[]ids) throws DataRemovingException;
	
	public boolean isAuthoritative(String uid, String roleCode);
}
