package com.jingyunbank.etrade.api.wap.goods.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Title: GoodsAttr
 * 
 * @author duanxf
 * @date 2016年3月31日
 */
public class GoodsAttr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String ID;
	private String name;
	private boolean status;

	private List<GoodsAttrValue> valueList = new ArrayList<GoodsAttrValue>();
	
	
	

	public List<GoodsAttrValue> getValueList() {
		return valueList;
	}

	public void setValueList(List<GoodsAttrValue> valueList) {
		this.valueList = valueList;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
