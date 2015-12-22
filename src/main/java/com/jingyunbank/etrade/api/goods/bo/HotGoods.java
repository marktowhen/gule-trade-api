package com.jingyunbank.etrade.api.goods.bo;

import java.io.Serializable;

/**
 * 商品信息业务对象
 * @author liug
 *
 */
public class HotGoods extends BaseGoods implements Serializable {

	private static final long serialVersionUID = 2563253149671693408L;
	private String imgPath; // 商家图片
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
}
