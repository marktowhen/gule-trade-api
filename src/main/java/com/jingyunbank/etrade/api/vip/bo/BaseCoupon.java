package com.jingyunbank.etrade.api.vip.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 所有优惠方式的父类。
 */
public class BaseCoupon implements Serializable{

	private static final long serialVersionUID = 305713281345643598L;

	public final static String CASHCOUPON = "CASHCOUPON";
	public final static String DISCOUNTCOUPON = "DISCOUNTCOUPON";
	public final static String CASHCOUPONSTRATEGY = "CASHCOUPONSTRATEGY";
	public final static String DISCOUNTCOUPONSTRATEGY = "DISCOUNTCOUPONSTRATEGY";
	
	private boolean del;//是否被删除
	private String remark;//备注 
	private Date addtimeStart;
	private Date addtiemEnd;
	private BigDecimal threshholdLow;//查询时添加条件 and threshhold>=threshholdLow
	private BigDecimal threshholdHigh;//查询时添加条件 and threshhold<=threshholdHigh
	
	private boolean validTime;//true ->查询有效期内 false不起效
	private boolean needUsed;//查询时是否需要加上used这个字段的条件
	private boolean needDelete;//查询时是否需要加上Delete这个字段的条件
	
	public boolean isValidTime() {
		return validTime;
	}
	public void setValidTime(boolean validTime) {
		this.validTime = validTime;
	}
	public boolean isNeedUsed() {
		return needUsed;
	}
	public void setNeedUsed(boolean needUsed) {
		this.needUsed = needUsed;
	}
	public boolean isNeedDelete() {
		return needDelete;
	}
	public void setNeedDelete(boolean needDelete) {
		this.needDelete = needDelete;
	}
	public Date getAddtimeStart() {
		return addtimeStart;
	}
	public void setAddtimeStart(Date addtimeStart) {
		this.addtimeStart = addtimeStart;
	}
	public Date getAddtiemEnd() {
		return addtiemEnd;
	}
	public void setAddtiemEnd(Date addtiemEnd) {
		this.addtiemEnd = addtiemEnd;
	}
	public BigDecimal getThreshholdLow() {
		return threshholdLow;
	}
	public void setThreshholdLow(BigDecimal threshholdLow) {
		this.threshholdLow = threshholdLow;
	}
	public BigDecimal getThreshholdHigh() {
		return threshholdHigh;
	}
	public boolean isDel() {
		return del;
	}
	public void setDel(boolean del) {
		this.del = del;
	}
	public void setThreshholdHigh(BigDecimal threshholdHigh) {
		this.threshholdHigh = threshholdHigh;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
