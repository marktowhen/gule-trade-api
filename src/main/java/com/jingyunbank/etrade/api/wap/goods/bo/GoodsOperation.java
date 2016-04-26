package com.jingyunbank.etrade.api.wap.goods.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
* Title: GoodsOperation 商品添加BO
* @author    duanxf
* @date      2016年4月13日
 */
public class GoodsOperation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Goods goods;
	// 图片信息
	private List<GoodsImg> imgList = new ArrayList<GoodsImg>();
	// attr-value 信息
	private List<GoodsAttrValue> attrValueList = new ArrayList<GoodsAttrValue>();
	// sku 信息
	private List<GoodsSku> skuList = new ArrayList<GoodsSku>();
	
	
	private List<GoodsInfo> infoList = new ArrayList<GoodsInfo>();

	
	
	public List<GoodsInfo> getInfoList() {
		return infoList;
	}

	public void setInfoList(List<GoodsInfo> infoList) {
		this.infoList = infoList;
	}

	public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	public List<GoodsImg> getImgList() {
		return imgList;
	}

	public void setImgList(List<GoodsImg> imgList) {
		this.imgList = imgList;
	}

	public List<GoodsAttrValue> getAttrValueList() {
		return attrValueList;
	}

	public void setAttrValueList(List<GoodsAttrValue> attrValueList) {
		this.attrValueList = attrValueList;
	}

	public List<GoodsSku> getSkuList() {
		return skuList;
	}

	public void setSkuList(List<GoodsSku> skuList) {
		this.skuList = skuList;
	}

}
