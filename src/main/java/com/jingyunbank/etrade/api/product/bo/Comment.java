package com.jingyunbank.etrade.api.product.bo;

import java.util.ArrayList;
import java.util.List;

public class Comment {

	private String ID;
	private String GID;//
	private String orderno;//order NO
	private String goods;
	private String service;
	private String delivery;
	private int productScore;
	private int serviceScore;
	private int deliveryScore;
	private int score;
	private List<String> imgs = new ArrayList<String>();
	
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
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public int getProductScore() {
		return productScore;
	}
	public void setProductScore(int productScore) {
		this.productScore = productScore;
	}
	public int getServiceScore() {
		return serviceScore;
	}
	public void setServiceScore(int serviceScore) {
		this.serviceScore = serviceScore;
	}
	public int getDeliveryScore() {
		return deliveryScore;
	}
	public void setDeliveryScore(int deliveryScore) {
		this.deliveryScore = deliveryScore;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public List<String> getImgs() {
		return imgs;
	}
	public void setImgs(List<String> imgs) {
		this.imgs = imgs;
	}
	
}
