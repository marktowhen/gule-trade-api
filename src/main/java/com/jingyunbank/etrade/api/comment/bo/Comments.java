package com.jingyunbank.etrade.api.comment.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Comments implements Serializable{

	private static final long serialVersionUID = 5781821369962254868L;
	private String ID;
	private String UID;
	private String OID;
	private String replyUID;//对于评论进行回复的人
	private String GID;
	private String replyComment;//回复人回复的内容
	private String goodsComment;//商品的评价
	private int commentGrade;//商品评价的等级
	private String goodsService;//商品的服务
	private int serviceGrade;//服务级别
	private int logisticsGrade;//物流级别
	private Date addtime;//添加评价的时间
	private int commentStatus;//该字段暂时未使用
	private int sort;//按其排序
	
	private List<CommentsImg> imgs=new ArrayList<CommentsImg>();
	
	
	public List<CommentsImg> getImgs() {
		return imgs;
	}
	public String getOID() {
		return OID;
	}
	public void setOID(String oID) {
		OID = oID;
	}

	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	

	public String getReplyUID() {
		return replyUID;
	}
	public void setReplyUID(String replyUID) {
		this.replyUID = replyUID;
	}
	public String getGID() {
		return GID;
	}
	public void setGID(String gID) {
		GID = gID;
	}

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public void setImgs(List<CommentsImg> imgs) {
		this.imgs = imgs;
	}
	
	public String getReplyComment() {
		return replyComment;
	}
	public void setReplyComment(String replyComment) {
		this.replyComment = replyComment;
	}
	public String getGoodsComment() {
		return goodsComment;
	}
	public void setGoodsComment(String goodsComment) {
		this.goodsComment = goodsComment;
	}
	public int getCommentGrade() {
		return commentGrade;
	}
	public void setCommentGrade(int commentGrade) {
		this.commentGrade = commentGrade;
	}
	public String getGoodsService() {
		return goodsService;
	}
	public void setGoodsService(String goodsService) {
		this.goodsService = goodsService;
	}
	public int getServiceGrade() {
		return serviceGrade;
	}
	public void setServiceGrade(int serviceGrade) {
		this.serviceGrade = serviceGrade;
	}
	public int getCommentStatus() {
		return commentStatus;
	}
	public void setCommentStatus(int commentStatus) {
		this.commentStatus = commentStatus;
	}
	public int getLogisticsGrade() {
		return logisticsGrade;
	}
	public void setLogisticsGrade(int logisticsGrade) {
		this.logisticsGrade = logisticsGrade;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	
}
