package com.jingyunbank.etrade.api.comment.service;

import java.util.List;

import com.jingyunbank.etrade.api.comment.bo.CommentsImg;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface ICommentImgService {

	public boolean save(CommentsImg commentsImg) throws DataSavingException;
	
	public List<CommentsImg> getById(String id);
	
	public void remove(String id) throws DataRemovingException;
}
