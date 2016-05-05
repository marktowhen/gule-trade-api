package com.jingyunbank.etrade.api.marketing.flashsale.bo;

import com.jingyunbank.etrade.api.wap.goods.bo.Goods;
import com.jingyunbank.etrade.api.wap.goods.bo.GoodsSku;

public class FlashSaleShow extends FlashSale{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6766214631339621488L;

	private Goods goods;
	
	private GoodsSku sku;

	/**
	 * @return the goods
	 */
	public Goods getGoods() {
		return goods;
	}

	/**
	 * @param goods the goods to set
	 */
	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	/**
	 * @return the sku
	 */
	public GoodsSku getSku() {
		return sku;
	}

	/**
	 * @param sku the sku to set
	 */
	public void setSku(GoodsSku sku) {
		this.sku = sku;
	}
	
	
}
