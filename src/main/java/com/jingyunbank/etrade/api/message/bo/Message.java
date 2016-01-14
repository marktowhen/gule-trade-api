package com.jingyunbank.etrade.api.message.bo;

import java.io.Serializable;
import java.util.Date;

import com.jingyunbank.etrade.api.user.bo.Users;

public class Message implements Serializable{

	/**
	 * 成功状态
	 */
	public static final int STATUS_SUC = 1;
	/**
	 * 失败
	 */
	public static final int STATUS_FAIL = 2;
	/**
	 * 删除状态
	 */
	public static final int STATUS_DEL = 3;
	/**
	 * 站内信
	 */
	public static final String TYPE_LETTER = "letter";
	
	
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
	
	private Users sendUser = new Users();//发送者
	private Users receiveUser = new Users();//接收者
	private boolean needReadStatus = false;//查询时是否需要加上读取状态
	
	public boolean isNeedReadStatus() {
		return needReadStatus;
	}
	public void setNeedReadStatus(boolean needReadStatus) {
		this.needReadStatus = needReadStatus;
	}
	public Users getSendUser() {
		return sendUser;
	}
	public void setSendUser(Users sendUser) {
		this.sendUser = sendUser;
	}
	public Users getReceiveUser() {
		return receiveUser;
	}
	public void setReceiveUser(Users receiveUser) {
		this.receiveUser = receiveUser;
	}
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
	@Override
	public String toString() {
		return "Message [ID=" + ID + ", sentUID=" + sentUID + ", receiveUID="
				+ receiveUID + ", title=" + title + ", content=" + content
				+ ", type=" + type + ", status=" + status + ", addtime="
				+ addtime + ", addip=" + addip + ", hasRead=" + hasRead
				+ ", sendUser=" + sendUser + ", receiveUser=" + receiveUser
				+ ", needReadStatus=" + needReadStatus + "]";
	}
	
}
