package com.jingyunbank.etrade.api.goods.bo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * Title: 查询商品的业务层对象
 * 
 * @author duanxf
 * @date 2015年11月9日
 */
public class GoodsShow implements Serializable {

	private static final long serialVersionUID = 1L;

	private String[] brands; // 品牌数组
	private String[] types; // 类别数组
	private String[] accessorys; // 辅料数组
	private BigDecimal beginPrice;
	private BigDecimal endPrice;
	private int order;
	
	private String goodsName; //结果查询使用
	private String MID; //  相关产品 -->店铺ID

	public BigDecimal getBeginPrice() {
		return beginPrice;
	}

	public void setBeginPrice(BigDecimal beginPrice) {
		this.beginPrice = beginPrice;
	}

	public BigDecimal getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(BigDecimal endPrice) {
		this.endPrice = endPrice;
	}

	public String[] getBrands() {
		return brands;
	}

	public void setBrands(String[] brands) {
		this.brands = brands;
	}

	public String[] getTypes() {
		return types;
	}

	public void setTypes(String[] types) {
		this.types = types;
	}

	public String[] getAccessorys() {
		return accessorys;
	}

	public void setAccessorys(String[] accessorys) {
		this.accessorys = accessorys;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getMID() {
		return MID;
	}

	public void setMID(String mID) {
		MID = mID;
	}


	
}
