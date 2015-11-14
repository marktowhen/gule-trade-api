package com.jingyunbank.etrade.api.goods.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.goods.bo.Merchant;

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
}
