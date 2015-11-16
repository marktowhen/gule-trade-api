package com.jingyunbank.etrade.api.advice.bo;

import java.io.Serializable;
import java.util.Date;

public class AdviceDetails implements Serializable{
	//动态的行内咨询
	private static final long serialVersionUID = 6898615572819261062L;
	private String id;
	private String sid;
	private String name;//主要的信息
	private String title;//标题
	private String content;//内容
	private Date publish;//出版时间
	private Date addtime;//添加时间
	private String status;
	private int orders;
	public int getOrders() {
		return orders;
	}
	public void setOrders(int orders) {
		this.orders = orders;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Date getPublish() {
		return publish;
	}
	public void setPublish(Date publish) {
		this.publish = publish;
	}
	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	
}
