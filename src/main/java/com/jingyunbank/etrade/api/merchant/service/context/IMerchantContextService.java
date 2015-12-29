package com.jingyunbank.etrade.api.merchant.service.context;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.merchant.bo.Merchant;

/**
 * 商家服务
 * @author liug
 *
 */
public interface IMerchantContextService {
	/**
	 * 保存商家信息
	 * @param merchant
	 * @return
	 * @throws DataSavingException
	 */
	public boolean save(Merchant merchant) throws DataSavingException;
	/**
	 * 更新商家信息
	 * @param merchant
	 * @return
	 * @throws DataSavingException
	 */
	public boolean refresh(Merchant merchant) throws DataRefreshingException;
	/**
	 * 根据商家ID 查询商家信息
	 * @param mid
	 * @return
	 */
	public Optional<Merchant> singleByMID(String mid) throws IllegalAccessException, InvocationTargetException;
}
