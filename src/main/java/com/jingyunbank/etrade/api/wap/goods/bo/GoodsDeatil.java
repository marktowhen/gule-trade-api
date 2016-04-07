package com.jingyunbank.etrade.api.wap.goods.bo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title: GoodsDeatilVO 商品详情展示
 * 
 * @author duanxf
 * @date 2016年4月7日
 */
public class GoodsDeatil extends BaseGoodsDeatil {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//商品图片
	private List<GoodsImg> imgList = new ArrayList<GoodsImg>();

	public List<GoodsImg> getImgList() {
		return imgList;
	}

	public void setImgList(List<GoodsImg> imgList) {
		this.imgList = imgList;
	}

}
