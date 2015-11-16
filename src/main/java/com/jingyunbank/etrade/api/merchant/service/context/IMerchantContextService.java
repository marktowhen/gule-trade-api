package com.jingyunbank.etrade.api.merchant.service.context;

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
	public boolean saveMerchant(Merchant merchant) throws DataSavingException;
	/**
	 * 更新商家信息
	 * @param merchant
	 * @return
	 * @throws DataSavingException
	 */
	public boolean updateMerchant(Merchant merchant) throws DataRefreshingException;
}
