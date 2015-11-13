package com.jingyunbank.etrade.api.goods.bo;

import java.io.Serializable;
import java.util.Date;

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
