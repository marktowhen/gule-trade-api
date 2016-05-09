package com.jingyunbank.etrade.api.marketing.flashsale.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.flashsale.bo.FlashSale;
import com.jingyunbank.etrade.api.marketing.flashsale.bo.FlashSaleShow;

public interface IFlashSaleService {
	/**
	 * 保存秒杀的商品
	 * @param flashSale
	 * @return
	 * @throws DataSavingException
	 */
	public boolean saveFlashSale(FlashSale flashSale) throws DataSavingException;
	/**
	 * 查出该商家的多有活动促销秒杀的产品
	 * @param mid
	 * @param range
	 * @return
	 */
	public List<FlashSaleShow> getFlashSaleMany(String mid,Range range);
	/**
	 * 全部的修改
	 * @param flashSale
	 * @return
	 * @throws DataRefreshingException
	 */
	public boolean refresh(FlashSale flashSale) throws DataRefreshingException;
	/**
	 * 查出所有上架的的搞秒杀活动的产品
	 * @param range
	 * @return
	 */
	public List<FlashSaleShow> getFlashSaleByCondition(Range range);
	/**
	 * 通过id查出定那个的对象
	 * @param id
	 * @return
	 */
	public Optional<FlashSale> single(String id);
	/**
	 * 只修改活动的数量
	 * @param flashSale
	 * @return
	 * @throws DataRefreshingException
	 */
	public boolean refreshStock(FlashSale flashSale) throws DataRefreshingException;
}
