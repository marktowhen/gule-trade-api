package com.jingyunbank.etrade.api.comment.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.comment.bo.Comments;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;



public interface ICommentService {
	
	public boolean save(Comments comments) throws DataSavingException;
	//通过gid得到产品的留言	
	public List<Comments> getCommentsByGid(String gid);
	
	public List<Comments> selectCommentGradeByGid(String gid,int commentGrade,Range range);
	
	public Optional<Comments> getById(String id);
	
	public void remove(String id) throws DataRemovingException;
	
	public void refreshStatus(Comments comments) throws DataRefreshingException;
	
	public void refreshStatus(String[] ids,Comments comments) throws DataRefreshingException;
	
	public Optional<Comments> selectCommentByOid(String oid);
	
	public int commentCount(String gid);
}
