package com.jingyunbank.etrade.api.goods.bo;

import java.io.Serializable;

/**
 * 
 * Title: 商品操作业务类
 * 
 * @author duanxf
 * @date 2015年11月13日
 */
public class GoodsOperation implements Serializable {
	private static final long serialVersionUID = 1L;

	private Goods goods; //商品表实体
	private GoodsDetail goodsDetail; //商品详细信息
	private GoodsImg goodsImg; //商品图片
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public GoodsDetail getGoodsDetail() {
		return goodsDetail;
	}
	public void setGoodsDetail(GoodsDetail goodsDetail) {
		this.goodsDetail = goodsDetail;
	}
	public GoodsImg getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(GoodsImg goodsImg) {
		this.goodsImg = goodsImg;
	}
	
	

}
