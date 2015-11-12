package com.jingyunbank.etrade.api.message.bo;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable{

	private static final long serialVersionUID = -4803430571542836689L;
	private String ID;
	private String sentUID;//发送者
	private String receiveUID;//接收者
	private String title;//标题
	private String content;//内容
	private String type;//类型
	private int status;//状态 1:成功 2:失败 3:删除
	private Date addtime;//添加时间
	private String addip;//添加人的ip
	private boolean hasRead;//是否已读
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getSentUID() {
		return sentUID;
	}
	public void setSentUID(String sentUID) {
		this.sentUID = sentUID;
	}
	public String getReceiveUID() {
		return receiveUID;
	}
	public void setReceiveUID(String receiveUID) {
		this.receiveUID = receiveUID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	public String getAddip() {
		return addip;
	}
	public void setAddip(String addip) {
		this.addip = addip;
	}
	public boolean isHasRead() {
		return hasRead;
	}
	public void setHasRead(boolean hasRead) {
		this.hasRead = hasRead;
	}
	
}
