package com.jingyunbank.etrade.api.user.service;

import java.util.List;

import com.jingyunbank.etrade.api.user.bo.Role;


public interface IRoleService {
	
	public List<Role> list();
	
	public Role single( String idOrCode);

}
