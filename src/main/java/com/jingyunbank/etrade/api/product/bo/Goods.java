package com.jingyunbank.etrade.api.product.bo;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable{

	private static final long serialVersionUID = -1166895929555093401L;
	private String ID;
	private String MID;//商家id
	private String name;
	private double price;//原价
	private double discount;//折扣价,促销价
	private Date promotionStart;//折扣价开始时间
	private Date promotionEnd;//折扣价结束时间
	private int promotionCount;//
	private boolean applyVip;//是否用于会员等级优惠
	private Date start;//上架时间
	private Date end;//下架时间
	private int count;//库存
	private double postage;//邮费
	private String brand;//参数表引用
	private String validDate;
}
