package com.jingyunbank.etrade.api.order.bo;

import java.util.ArrayList;
import java.util.List;

import com.jingyunbank.etrade.api.goods.bo.Goods;

/**
 * 购物车 领域对象类
 */
public class Cart {

	private String ID;
	private String UID;
	private List<Goods> goods = new ArrayList<Goods>();

	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public List<Goods> getGoods() {
		return goods;
	}
	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
}
