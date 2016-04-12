package com.jingyunbank.etrade.api.group.bo;

import java.math.BigDecimal;

/**
 * 团购阶梯价，人数越多价格约低
 */
public class GroupGoodsPriceSetting {

	private GroupGoods goods;
	private int floor;//人数门槛
	private int ceiling;//人数上限
	private BigDecimal price;
	public GroupGoods getGoods() {
		return goods;
	}
	public void setGoods(GroupGoods goods) {
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
