package com.jingyunbank.etrade.api.user.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.exception.DataUpdatingException;
import com.jingyunbank.etrade.api.user.bo.Address;


/**
 * 收货地址管理
 * @author qxs
 *
 */
public interface IAddressService {

	public boolean save(Address address) throws DataSavingException;
	
	public boolean refresh(Address address) throws DataUpdatingException;
	
	/**
	 * 删除某条地址，状态置为无效
	 * @param address
	 * @return
	 * @throws DataUpdatingException
	 * 2015年11月5日 qxs
	 */
	public boolean delete(Address address) throws DataUpdatingException ;
	
	/**
	 * 查找单条地址详情
	 * @param id
	 * @return
	 * 2015年11月5日 qxs
	 */
	public Optional<Address> singleById(String id);
	
	/**
	 * 根据uid查出所有有效地址
	 * @param uid
	 * @return
	 * 2015年11月5日 qxs
	 */
	public List<Address> list(String uid);
	
	
	
	
}
