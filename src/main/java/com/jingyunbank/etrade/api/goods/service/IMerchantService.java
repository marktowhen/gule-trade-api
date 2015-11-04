package com.jingyunbank.etrade.api.goods.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.good.bo.Merchant;

/**
 * 提供商家服务
 * @author liug
 *
 */
public interface IMerchantService {
	public List<Merchant> list(Range range);
}
