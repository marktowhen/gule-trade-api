package com.jingyunbank.etrade.api.good.service;

import java.util.List;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.good.bo.Merchant;

/**
 * 提供商品相关服务
 * @author liug
 *
 */
public interface IGoodService {
	public List<Merchant> list(Range range);
	 
}
