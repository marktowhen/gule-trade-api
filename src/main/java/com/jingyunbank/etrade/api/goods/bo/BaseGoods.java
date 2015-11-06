package com.jingyunbank.etrade.api.goods.bo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
* Title: 商品的包装类[包含商品 商户 品牌属性] 
* @author    duanxf
* @date      2015年11月4日
 */
public class BaseGoods implements Serializable{

	private static final long serialVersionUID = 1L;

	
	private String id;  //商品ID
	
	private String merchant_id;
	private String merchantname; //商家
	private String merchantname_desc; //商家简介
	private String merchantname_img; //商家图片
	
	private String brand_id; //品牌id
	private String brandname;   //所属品牌
	private String brand_desc;   //所属品牌描述
	
	private String type_id; //所属属性id
	private String good_type_name; //所属类型
	
	private String goodname;  //商品名
	private String goodcode;  //商品编码
	private BigDecimal price; //原价
	private BigDecimal special_price; //特价
	private BigDecimal now_price; //现价
	private String discount; //折扣
	private BigDecimal discount_price; //折扣价
	private String show_path_1;  //展示图片
	private String show_path_2;  //展示图片
	private String show_path_3;  //展示图片
	private String show_path_4;  //展示图片
	private String thumb_path_1; //缩略图
	private String thumb_path_2; //缩略图
	private String thumb_path_3; //缩略图
	private String thumb_path_4; //缩略图
	private String count; //库存
	private String volume; //销量
	private String goodaddtime;//商品添加时间
	
	/** 产品标准号*/
	private String standardNo;
	/** 保质期*/
	private String shelfLife;
	/** 批准文号*/
	private String approveNo;
	/** 食用方法和食用量*/
	private String usage;
	/** 适宜人群*/
	private String commendedUser;
	/** 不适宜人群*/
	private String notCommendedUser;
	/** 配料表*/
	private String ingredients;
	/** 食品添加剂*/
	private String foodAdditives;
	/** 具体规格*/
	private String specifications;
	/** 成分含量*/
	private String ingredient;
	/** 功能及功效*/
	private String functions;
	/** 注意事项*/
	private String note;
	/** 储藏方法*/
	private String storageMethods;
	/** 是否礼盒装*/
	private String isGiftBox;
	/** 重量*/
	private String weight;
	/** 单位*/
	private String unit;
	
	
	public String getShow_path_1() {
		return show_path_1;
	}
	public void setShow_path_1(String show_path_1) {
		this.show_path_1 = show_path_1;
	}
	public String getShow_path_2() {
		return show_path_2;
	}
	public void setShow_path_2(String show_path_2) {
		this.show_path_2 = show_path_2;
	}
	public String getShow_path_3() {
		return show_path_3;
	}
	public void setShow_path_3(String show_path_3) {
		this.show_path_3 = show_path_3;
	}
	public String getShow_path_4() {
		return show_path_4;
	}
	public void setShow_path_4(String show_path_4) {
		this.show_path_4 = show_path_4;
	}
	public String getThumb_path_1() {
		return thumb_path_1;
	}
	public void setThumb_path_1(String thumb_path_1) {
		this.thumb_path_1 = thumb_path_1;
	}
	public String getThumb_path_2() {
		return thumb_path_2;
	}
	public void setThumb_path_2(String thumb_path_2) {
		this.thumb_path_2 = thumb_path_2;
	}
	public String getThumb_path_3() {
		return thumb_path_3;
	}
	public void setThumb_path_3(String thumb_path_3) {
		this.thumb_path_3 = thumb_path_3;
	}
	public String getThumb_path_4() {
		return thumb_path_4;
	}
	public void setThumb_path_4(String thumb_path_4) {
		this.thumb_path_4 = thumb_path_4;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMerchant_id() {
		return merchant_id;
	}
	public void setMerchant_id(String merchant_id) {
		this.merchant_id = merchant_id;
	}
	public String getMerchantname() {
		return merchantname;
	}
	public void setMerchantname(String merchantname) {
		this.merchantname = merchantname;
	}
	public String getMerchantname_desc() {
		return merchantname_desc;
	}
	public void setMerchantname_desc(String merchantname_desc) {
		this.merchantname_desc = merchantname_desc;
	}
	public String getMerchantname_img() {
		return merchantname_img;
	}
	public void setMerchantname_img(String merchantname_img) {
		this.merchantname_img = merchantname_img;
	}
	public String getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getBrand_desc() {
		return brand_desc;
	}
	public void setBrand_desc(String brand_desc) {
		this.brand_desc = brand_desc;
	}
	public String getType_id() {
		return type_id;
	}
	public void setType_id(String type_id) {
		this.type_id = type_id;
	}
	public String getGood_type_name() {
		return good_type_name;
	}
	public void setGood_type_name(String good_type_name) {
		this.good_type_name = good_type_name;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	public String getGoodcode() {
		return goodcode;
	}
	public void setGoodcode(String goodcode) {
		this.goodcode = goodcode;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getSpecial_price() {
		return special_price;
	}
	public void setSpecial_price(BigDecimal special_price) {
		this.special_price = special_price;
	}
	public BigDecimal getNow_price() {
		return now_price;
	}
	public void setNow_price(BigDecimal now_price) {
		this.now_price = now_price;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public BigDecimal getDiscount_price() {
		return discount_price;
	}
	public void setDiscount_price(BigDecimal discount_price) {
		this.discount_price = discount_price;
	}
	
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getStandardNo() {
		return standardNo;
	}
	public void setStandardNo(String standardNo) {
		this.standardNo = standardNo;
	}
	public String getShelfLife() {
		return shelfLife;
	}
	public void setShelfLife(String shelfLife) {
		this.shelfLife = shelfLife;
	}
	public String getApproveNo() {
		return approveNo;
	}
	public void setApproveNo(String approveNo) {
		this.approveNo = approveNo;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	public String getCommendedUser() {
		return commendedUser;
	}
	public void setCommendedUser(String commendedUser) {
		this.commendedUser = commendedUser;
	}
	public String getNotCommendedUser() {
		return notCommendedUser;
	}
	public void setNotCommendedUser(String notCommendedUser) {
		this.notCommendedUser = notCommendedUser;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getFoodAdditives() {
		return foodAdditives;
	}
	public void setFoodAdditives(String foodAdditives) {
		this.foodAdditives = foodAdditives;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	public String getFunctions() {
		return functions;
	}
	public void setFunctions(String functions) {
		this.functions = functions;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getStorageMethods() {
		return storageMethods;
	}
	public void setStorageMethods(String storageMethods) {
		this.storageMethods = storageMethods;
	}
	public String getIsGiftBox() {
		return isGiftBox;
	}
	public void setIsGiftBox(String isGiftBox) {
		this.isGiftBox = isGiftBox;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getGoodaddtime() {
		return goodaddtime;
	}
	public void setGoodaddtime(String goodaddtime) {
		this.goodaddtime = goodaddtime;
	}
	
	
	
	
	
}
