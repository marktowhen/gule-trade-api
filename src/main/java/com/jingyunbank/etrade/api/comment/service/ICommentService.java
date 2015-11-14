package com.jingyunbank.etrade.api.comment.service;

import java.util.List;

import com.jingyunbank.etrade.api.comment.bo.Comments;
import com.jingyunbank.etrade.api.comment.bo.CommentsImg;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;


public interface ICommentService {
	
	public boolean save(Comments comments) throws DataSavingException;
	//通过gid得到产品的留言
	public List<Comments> getCommentsByGid(String gid);
	
	public Comments getById(String id);
	
	public void remove(String id) throws DataRemovingException;
	
	
}
