package com.jingyunbank.etrade.api.comment.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.comment.bo.Comments;
import com.jingyunbank.etrade.api.comment.bo.CommentsImg;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;



public interface ICommentService {
	/**
	 * 保存留言信息
	 * @param comments
	 * @param imgList 
	 * @return
	 * @throws DataSavingException
	 */
	public boolean save(Comments comments, List<CommentsImg> imgList) throws DataSavingException;
	
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
	 * @param existsImg
	 * @param range
	 * @return
	 */
	public List<Comments> list(String gid,int commentGrade,boolean existsImg,Range range);
	
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
	public Optional<Comments> singleByOid(String oid,String gid);
	
	public List<Comments> list();
}
