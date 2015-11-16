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
	private String merchantName;
	/**商家英文名称*/
	private String merchantEname;
	/**商家编码*/
	private String merchantCode;
	/**商家地址*/
	private String merchantAddress;
	/**商家规模*/
	private String merchantScale;
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
	/**发票的类型*/
	private String invoiceCodes;
	/**快递的类型*/
	private String deliveryCodes;
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
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantEname() {
		return merchantEname;
	}
	public void setMerchantEname(String merchantEname) {
		this.merchantEname = merchantEname;
	}
	public String getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	public String getMerchantAddress() {
		return merchantAddress;
	}
	public void setMerchantAddress(String merchantAddress) {
		this.merchantAddress = merchantAddress;
	}
	public String getMerchantScale() {
		return merchantScale;
	}
	public void setMerchantScale(String merchantScale) {
		this.merchantScale = merchantScale;
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
	
	
}
