package com.jingyunbank.etrade.api.comment.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.comment.bo.Comments;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;



public interface ICommentService {
	/**
	 * 保存留言信息
	 * @param comments
	 * @return
	 * @throws DataSavingException
	 */
	public boolean save(Comments comments) throws DataSavingException;
	
	/**
	 * 通过gid查出该商品所有的评价
	 * @param gid
	 * @return
	 */
	public List<Comments> list(String gid);
	
	/**
	 * 按照相应的条件和范围查询某商品是我所有评价
	 * @param gid
	 * @param commentGrade
	 * @param picture
	 * @param range
	 * @return
	 */
	public List<Comments> list(String gid,int commentGrade,int picture,Range range);
	
	/**
	 * 查出指定的某一条评价
	 * @param id
	 * @return
	 */
	public Optional<Comments> single(String id);
	
	/**
	 * 删除某一条评价
	 * @param id
	 * @throws DataRemovingException
	 */
	public void remove(String id) throws DataRemovingException;
	
	/**
	 * 修改状态
	 * @param comments
	 * @throws DataRefreshingException
	 */	
	public void refreshStatus(String[] ids,Comments comments) throws DataRefreshingException;
	/**
	 * 查出留言的总条数
	 * @param gid
	 * @return
	 */	
	public int commentCount(String gid);
	
	/**
	 * 通过oid查出对应的评价
	 * @param oid
	 * @return
	 */
	public Optional<Comments> singleByOid(String oid);
	
	public List<Comments> list();
}
