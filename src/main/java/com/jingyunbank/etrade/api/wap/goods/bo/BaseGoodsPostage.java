package com.jingyunbank.etrade.api.wap.goods.bo;

import java.io.Serializable;
import java.math.BigDecimal;

public class BaseGoodsPostage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String GID;
	private String name;
	private String pType; // 收费类型 number:按件计费 weight:按重量 volume:体积
	private String pCode; // 快递公司代号
	private String pName; // 快递公司名称
	private boolean free; // 是否包邮
	private int first_number;
	private double first_weight;
	private double first_volume;
	private BigDecimal first_cost;
	private int next_number;
	private double next_weight;
	private double next_volume;
	private BigDecimal next_cost;

	public String getGID() {
		return GID;
	}

	public void setGID(String gID) {
		GID = gID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getpType() {
		return pType;
	}

	public void setpType(String pType) {
		this.pType = pType;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public int getFirst_number() {
		return first_number;
	}

	public void setFirst_number(int first_number) {
		this.first_number = first_number;
	}

	public double getFirst_weight() {
		return first_weight;
	}

	public void setFirst_weight(double first_weight) {
		this.first_weight = first_weight;
	}

	public double getFirst_volume() {
		return first_volume;
	}

	public void setFirst_volume(double first_volume) {
		this.first_volume = first_volume;
	}

	public BigDecimal getFirst_cost() {
		return first_cost;
	}

	public void setFirst_cost(BigDecimal first_cost) {
		this.first_cost = first_cost;
	}

	public int getNext_number() {
		return next_number;
	}

	public void setNext_number(int next_number) {
		this.next_number = next_number;
	}

	public double getNext_weight() {
		return next_weight;
	}

	public void setNext_weight(double next_weight) {
		this.next_weight = next_weight;
	}

	public double getNext_volume() {
		return next_volume;
	}

	public void setNext_volume(double next_volume) {
		this.next_volume = next_volume;
	}

	public BigDecimal getNext_cost() {
		return next_cost;
	}

	public void setNext_cost(BigDecimal next_cost) {
		this.next_cost = next_cost;
	}

}
