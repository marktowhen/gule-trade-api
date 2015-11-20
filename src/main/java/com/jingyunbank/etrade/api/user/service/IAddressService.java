package com.jingyunbank.etrade.api.user.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.user.bo.Address;


/**
 * 收货地址管理
 * @author qxs
 *
 */
public interface IAddressService {

	/**
	 * 新增地址 且保证默认地址最多一个
	 * @param address
	 * @return
	 * @throws DataSavingException
	 * @throws DataRefreshingException
	 * 2015年11月13日 qxs
	 */
	public boolean save(Address address) throws DataSavingException, DataRefreshingException;
	
	/**
	 * 修改收货地址
	 * @param address 部分修改 id,uid 必传, 将其他传入的字段进行修改
	 * @return
	 * @throws DataRefreshingException
	 * 2015年11月20日 qxs
	 */
	public boolean refresh(Address address) throws DataRefreshingException;
	
	/**
	 * 删除某条地址，状态置为无效
	 * @param id
	 * @param uid
	 * @return
	 * @throws DataRefreshingException
	 * 2015年11月20日 qxs
	 */
	public boolean remove(String id, String uid) throws DataRefreshingException ;
	
	/**
	 * 删除某条地址，状态置为无效
	 * @param ids
	 * @param uid
	 * @return
	 * @throws DataRefreshingException
	 * 2015年11月20日 qxs
	 */
	public boolean remove(String [] ids, String uid) throws DataRefreshingException ;
	
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
	
	/**
	 * 查询某个用户地址
	 * @param uid
	 * @param range
	 * @return
	 * 2015年11月20日 qxs
	 */
	public List<Address> listUserAdd(String uid, Range range);
	
	/**
	 * 查询数量
	 * @param boFromVo
	 * @return
	 * 2015年11月13日 qxs
	 */
	public int getAmount(String uid);
	
	/**
	 * 设置默认收货地址
	 * @param id
	 * @param uid
	 * 2015年11月9日 qxs
	 * @throws DataRefreshingException 
	 */
	public void refreshDefualt(String id, String uid) throws DataRefreshingException;

	
	
	/**
	 * 查询默认收货地址
	 * @param loginUID
	 * @return
	 * 2015年11月13日 qxs
	 */
	public Optional<Address> getDefaultAddress(String uid);

	
	
	
	
	
	
}
