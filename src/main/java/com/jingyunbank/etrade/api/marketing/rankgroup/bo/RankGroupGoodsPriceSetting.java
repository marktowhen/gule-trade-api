package com.jingyunbank.etrade.api.marketing.rankgroup.bo;

import java.math.BigDecimal;

public class RankGroupGoodsPriceSetting {
	private RankGroupGoods goods;
	private int floor;//人数节点
	private int ceiling;//人数上限
	private BigDecimal price;  //对应单价
	
	public RankGroupGoods getGoods() {
		return goods;
	}
	public void setGoods(RankGroupGoods goods) {
		this.goods = goods;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getCeiling() {
		return ceiling;
	}
	public void setCeiling(int ceiling) {
		this.ceiling = ceiling;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
}
