package com.jingyunbank.etrade.api.logistic.bo;

import java.io.Serializable;
import java.math.BigDecimal;


public class PostageCalculate implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2185368745666081741L;
	private String postageID;
	private BigDecimal price;
	private int city;
	private int number;
	private double weight;
	private double volume;
	private String transportType;
	
	private Postage calculatRule;
	
	public String getTransportType() {
		return transportType;
	}
	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}
	public Postage getCalculatRule() {
		return calculatRule;
	}
	public void setCalculatRule(Postage calculatRule) {
		this.calculatRule = calculatRule;
	}
	public String getPostageID() {
		return postageID;
	}
	public void setPostageID(String postageID) {
		this.postageID = postageID;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	
}
