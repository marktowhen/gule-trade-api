package com.jingyunbank.etrade.api.track.bo;

import java.io.Serializable;
import java.util.Date;

import com.jingyunbank.etrade.api.goods.bo.BaseGoods;
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
