package com.jingyunbank.etrade.api.goods.bo;

import java.io.Serializable;
import java.util.Date;
/**
 * 我的足迹业务对象
 * @author liug
 *
 */
public class FootprintGoods extends BaseGoods implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date visitTime;
	public Date getVisitTime() {
		return visitTime;
	}
	public void setVisitTime(Date visitTime) {
		this.visitTime = visitTime;
	}
	 
	
}
