package com.jingyunbank.etrade.api.product.bo;

import java.io.Serializable;

//商品属性
//如阿胶形状，适用人群，包装方式，阿胶品牌
public class GoodsAttr implements Serializable {

	private static final long serialVersionUID = 1201337982347916239L;
	private String id ;
	private String code;//immutable
	private String name;
	private String desc;
	
}
