package com.jingyunbank.etrade.api.order.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.jingyunbank.etrade.api.product.bo.Goods;

public class Order  implements Serializable{

	private static final long serialVersionUID = 2563253149671693408L;
	private String orderno;
	private String addressID;
	private String uid;
	private Date addtime;//下单时间
	private int paytypeID;//支付方式
	private String status;//订单状态code
	private List<Goods> goods = new LinkedList<Goods>();
	
}
