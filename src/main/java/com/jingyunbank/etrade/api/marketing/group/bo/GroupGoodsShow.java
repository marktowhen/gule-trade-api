package com.jingyunbank.etrade.api.marketing.group.bo;

import java.math.BigDecimal;

import com.jingyunbank.etrade.api.wap.goods.bo.Goods;
import com.jingyunbank.etrade.api.wap.goods.bo.GoodsSku;

public class GroupGoodsShow extends GroupGoods{

	private Goods goods;
	private GoodsSku sku;
	
	
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
	
	
	
	
}
