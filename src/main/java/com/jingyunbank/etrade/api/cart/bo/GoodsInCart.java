package com.jingyunbank.etrade.api.cart.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class GoodsInCart implements Serializable{

	private static final long serialVersionUID = -5109034256152795171L;
	private String ID;
	private Cart cart;
	private String cartID;
	private String GID;
	private String gname;
	private String UID;
	private String uname;
	private String MID;
	private String mname;
	private int count;
	private BigDecimal price;
	private Date addtime;
	private BigDecimal pprice;
	private String SKUID;
	
	//attrs to show
	private String imgpath;
	private int stock;//库存
	private BigDecimal postage;//邮费
	private String propertiesValue;//属性值
	
	
	
	/**
	 * @return the propertiesValue
	 */
	public String getPropertiesValue() {
		return propertiesValue;
	}
	/**
	 * @param propertiesValue the propertiesValue to set
	 */
	public void setPropertiesValue(String propertiesValue) {
		this.propertiesValue = propertiesValue;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public String getCartID() {
		return cartID;
	}
	public void setCartID(String cartID) {
		this.cartID = cartID;
	}
	public String getGID() {
		return GID;
	}
	public void setGID(String gID) {
		GID = gID;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public String getMID() {
		return MID;
	}
	public void setMID(String mID) {
		MID = mID;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getImgpath() {
		return imgpath;
	}
	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public BigDecimal getPprice() {
		return pprice;
	}
	public void setPprice(BigDecimal pprice) {
		this.pprice = pprice;
	}
	public BigDecimal getPostage() {
		return postage;
	}
	public void setPostage(BigDecimal postage) {
		this.postage = postage;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getSKUID() {
		return SKUID;
	}
	public void setSKUID(String sKUID) {
		SKUID = sKUID;
	}
}
