package com.jingyunbank.etrade.api.comment.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comments implements Serializable{

	private static final long serialVersionUID = 5781821369962254868L;
	private String id;
	private String uid;
	private String gid;
	private String imgid;
	private String goodsComment;
	private int commentGrade;
	private String goodsService;
	private int serviceGrade;
	private Date addtime;//添加评价的时间
	private int commentStatus;
	private List<CommentsImg> imgs=new ArrayList<CommentsImg>();
	
	public List<CommentsImg> getImgs() {
		return imgs;
	}
	
	/**
	 * @return the addtime
	 */
	public Date getAddtime() {
		return addtime;
	}

	/**
	 * @param addtime the addtime to set
	 */
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public void setImgs(List<CommentsImg> imgs) {
		this.imgs = imgs;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImgid() {
		return imgid;
	}
	public void setImgid(String imgid) {
		this.imgid = imgid;
	}

	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
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
	
	
}
