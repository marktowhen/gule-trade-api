package com.jingyunbank.etrade.api.merchant.bo;

import java.util.Date;
import java.util.List;

/**
 * 商家业务BEAN
 * @author liug
 *
 */
public class Merchant {
	private static final long serialVersionUID = 1L;
	/**主键*/
	private String ID;
	/**商家名称*/
	private String name;
	/**商家英文名称*/
	private String ename;
	/**商家编码*/
	private String code;
	/**商家地址*/
	private String address;
	/**商家规模*/
	private String scale;
	/**员工人数（人）*/
	private int employeeNum;
	/**电话*/
	private String tel;
	/**邮编*/
	private String zipcode;
	/**qq*/
	private String qq ;
	/**二维码路径*/
	private String twoDimensionCode ;
	/**注册时间*/
	private Date registerDate ;
	/**管理员排序*/
	private int adminSortNum ;
	/**商家描述*/
	private String  merchantDesc ;
	/**商家图片路径*/
	private String imgPath ;
	/** 是否开具发票 0否1是  */
	private String invoiceFlag;
	/** 商家的等级1-5  */
	private String level;
	/**发票的类型*/
	private String invoiceCodes;
	/**快递的类型*/
	private String deliveryCodes;
	/**是否是自营商家*/
	private boolean autotrophic;
	/**发票类型列表*/
	private List<InvoiceType> invoiceList;
	/**发票类型列表*/
	private List<DeliveryType> deliverylist;
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
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public int getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getTwoDimensionCode() {
		return twoDimensionCode;
	}
	public void setTwoDimensionCode(String twoDimensionCode) {
		this.twoDimensionCode = twoDimensionCode;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public int getAdminSortNum() {
		return adminSortNum;
	}
	public void setAdminSortNum(int adminSortNum) {
		this.adminSortNum = adminSortNum;
	}
	public String getMerchantDesc() {
		return merchantDesc;
	}
	public void setMerchantDesc(String merchantDesc) {
		this.merchantDesc = merchantDesc;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public static Merchant getInstance(){
		return new Merchant();
	}
	public String getInvoiceFlag() {
		return invoiceFlag;
	}
	public void setInvoiceFlag(String invoiceFlag) {
		this.invoiceFlag = invoiceFlag;
	}
	 
	public String getInvoiceCodes() {
		return invoiceCodes;
	}
	public void setInvoiceCodes(String invoiceCodes) {
		this.invoiceCodes = invoiceCodes;
	}
	public String getDeliveryCodes() {
		return deliveryCodes;
	}
	public void setDeliveryCodes(String deliveryCodes) {
		this.deliveryCodes = deliveryCodes;
	}
	public List<InvoiceType> getInvoiceList() {
		return invoiceList;
	}
	public void setInvoiceList(List<InvoiceType> invoiceList) {
		this.invoiceList = invoiceList;
	}
	public List<DeliveryType> getDeliverylist() {
		return deliverylist;
	}
	public void setDeliverylist(List<DeliveryType> deliverylist) {
		this.deliverylist = deliverylist;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public boolean isAutotrophic() {
		return autotrophic;
	}
	public void setAutotrophic(boolean autotrophic) {
		this.autotrophic = autotrophic;
	}
}
