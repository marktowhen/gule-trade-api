package com.jingyunbank.etrade.api.track.bo;

import java.io.Serializable;
import java.util.Date;

import com.jingyunbank.etrade.api.goods.bo.BaseGoods;

/**
 * 我的收藏业务对象
 * @author liug
 *
 */
public class CollectGoods extends BaseGoods implements Serializable {

	private static final long serialVersionUID = 2563253149671693408L;
	private Date collectTime;
	public Date getCollectTime() {
		return collectTime;
	}
	public void setCollectTime(Date collectTime) {
		this.collectTime = collectTime;
	} 
	
}
