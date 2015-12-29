package com.jingyunbank.etrade.api.comment.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.comment.bo.CommentsImg;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface ICommentImgService {

	public boolean save(CommentsImg commentsImg) throws DataSavingException;
	
	public List<CommentsImg> list(String commentID);
	
	public void remove(String id) throws DataRemovingException;
	
	public Optional<CommentsImg> singleById(String id);
}
