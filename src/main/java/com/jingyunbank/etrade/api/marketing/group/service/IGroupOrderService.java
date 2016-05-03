package com.jingyunbank.etrade.api.marketing.group.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupOrder;

public interface IGroupOrderService {
	
	/**
	 * 此时orderno和oid未知
	 * @param groupOrder
	 * @return
	 * @throws DataSavingException
	 * 2016年4月29日 qxs
	 */
	public boolean save(GroupOrder groupOrder) throws DataSavingException;
	
	public Optional<GroupOrder> single(String ID);
	
	public List<GroupOrder> list(String groupUserID);

	public Optional<GroupOrder> singleByOID( String OID);

	/**
	 * 查询定金或尾款订单
	 * @param groupUserID group_user id
	 * @param orderType DEPOSIT 或 BALANCE_PAYMENT
	 * 2016年4月25日 qxs
	 */
	public Optional<GroupOrder> single(String groupUserID, String orderType);
	
}
