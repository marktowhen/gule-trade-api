package com.jingyunbank.etrade.api.merchant.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.merchant.bo.InvoiceType;
import com.jingyunbank.etrade.api.merchant.bo.Merchant;

/**
 * 提供商家服务
 * @author liug
 *
 */
public interface IMerchantService {
	/**
	 * 查找推荐商家
	 * @param range
	 * @return
	 */
	public List<Merchant> listMerchants() throws IllegalAccessException, InvocationTargetException;
	/**
	 * 商家保存
	 * @param merchant
	 * @return
	 * @throws DataSavingException
	 */
	public boolean saveMerchant(Merchant merchant) throws DataSavingException;
	/**
	 * 查询所有发票类型
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public List<InvoiceType> listInvoiceType() throws IllegalAccessException, InvocationTargetException;
	/**
	 * 商家发票类型的保存
	 * @param merchant
	 * @return
	 * @throws DataSavingException
	 */
	public boolean saveMerchantInvoiceType(Merchant merchant) throws Exception;
}
