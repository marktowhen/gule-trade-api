package com.jingyunbank.etrade.api.marketing.rankgroup.bo;

import java.math.BigDecimal;

import com.jingyunbank.etrade.api.wap.goods.bo.Goods;
import com.jingyunbank.etrade.api.wap.goods.bo.GoodsSku;

public class RankGroupGoodsShow extends RankGroupGoods{
	private Goods goods;
	private GoodsSku sku;
	private BigDecimal showPrice;
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public GoodsSku getSku() {
		return sku;
	}
	public void setSku(GoodsSku sku) {
		this.sku = sku;
	}
	public BigDecimal getShowPrice() {
		return showPrice;
	}
	public void setShowPrice(BigDecimal showPrice) {
		this.showPrice = showPrice;
	}
	
	
}
