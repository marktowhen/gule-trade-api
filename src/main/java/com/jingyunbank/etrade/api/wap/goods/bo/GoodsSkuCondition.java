package com.jingyunbank.etrade.api.wap.goods.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsSkuCondition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String ID;
	private String MID; // 店铺ID
	private String TID; // 类型ID
	private String name; // 商品名
	private String path; // 展示图片
	private BigDecimal price; // 价格
	private BigDecimal salePrice; // 折扣价

	private List<GoodsAttr> attrList = new ArrayList<GoodsAttr>();

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getMID() {
		return MID;
	}

	public void setMID(String mID) {
		MID = mID;
	}

	public String getTID() {
		return TID;
	}

	public void setTID(String tID) {
		TID = tID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	public List<GoodsAttr> getAttrList() {
		return attrList;
	}

	public void setAttrList(List<GoodsAttr> attrList) {
		this.attrList = attrList;
	}

	
	
	
}
