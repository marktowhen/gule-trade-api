package com.jingyunbank.etrade.api.product.bo;

import java.io.Serializable;

//商品属性字典
//如品牌：{'东阿阿胶', '福牌阿胶', '桃花姬', '鹤王阿胶'}
//如形状：{'阿胶糕', '阿胶块', '阿胶原粉'}
public class GoodsAttrValue implements Serializable {

	private static final long serialVersionUID = 375074151108883204L;
	private String id;
	private String attrid;
	private String attrName;
	private String name;
	private String desc;
	private GoodsAttr attr;
}
