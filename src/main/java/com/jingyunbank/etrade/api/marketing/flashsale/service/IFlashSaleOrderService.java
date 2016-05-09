package com.jingyunbank.etrade.api.marketing.flashsale.service;

import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.flashsale.bo.FlashSaleOrder;

public interface IFlashSaleOrderService {
	/**
	 * 保存订单的信息
	 * @param flashSaleOrder
	 * @return
	 */
	public boolean save(FlashSaleOrder flashSaleOrder) throws DataSavingException;
	/**
	 * 通过oid查出某个对象的信息
	 * @param oid
	 * @return
	 */
	public Optional<FlashSaleOrder> single(String oid);
	/**
	 * 通过id查某对象信息
	 * @param id
	 * @return
	 */
	public Optional<FlashSaleOrder> singleByUid(String flashUserId);
}
