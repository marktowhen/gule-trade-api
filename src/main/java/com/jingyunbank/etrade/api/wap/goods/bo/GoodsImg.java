package com.jingyunbank.etrade.api.wap.goods.bo;

import java.io.Serializable;

/**
 * 
 * Title: GoodsImgVO 商品图片
 * 
 * @author duanxf
 * @date 2016年4月7日
 */
public class GoodsImg implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String ID;
	private String GID;
	private String skuId;
	private String path;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getGID() {
		return GID;
	}

	public void setGID(String gID) {
		GID = gID;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
