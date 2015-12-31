package com.jingyunbank.etrade.api.comment.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.comment.bo.CommentsImg;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;

public interface ICommentImgService {
	/**
	 * 保存
	 * @param commentsImg
	 * @return
	 * @throws DataSavingException
	 */
	public boolean save(CommentsImg commentsImg) throws DataSavingException;
	/**
	 * 关联查出所有的图片信息
	 * @param commentID
	 * @return
	 */
	public List<CommentsImg> list(String commentID);
	/**
	 * 删除
	 * @param id
	 * @throws DataRemovingException
	 */
	public void remove(String id) throws DataRemovingException;
	
	public Optional<CommentsImg> singleById(String id);
}
