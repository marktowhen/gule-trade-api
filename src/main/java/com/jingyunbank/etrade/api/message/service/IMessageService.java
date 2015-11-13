package com.jingyunbank.etrade.api.message.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.message.bo.Message;

public interface IMessageService {
	/**
	 * 成功状态
	 */
	int STATUS_SUC = 1;
	/**
	 * 失败
	 */
	int STATUS_FAIL = 2;
	/**
	 * 删除状态
	 */
	int STATUS_DEL = 3;
	/**
	 * 站内信
	 */
	String TYPE_LETTER = "letter";

	public boolean save(Message message) throws DataSavingException;
	
	/**
	 * 多个新增
	 * @param message
	 * @param receiveUids
	 * 2015年11月12日 qxs
	 * @throws DataSavingException 
	 */
	public boolean save(Message message, String[] receiveUids) throws DataSavingException;
	
	/**
	 * 多个新增
	 * @param message
	 * @param receiveUids
	 * 2015年11月12日 qxs
	 * @throws DataSavingException 
	 */
	public boolean save(List<Message> message) throws DataSavingException;
	/**
	 * 逻辑删除消息
	 * @param id
	 * @return
	 * @throws DataRefreshingException
	 * 2015年11月12日 qxs
	 */
	boolean remove(String id, String receiveUID) throws DataRefreshingException;
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 * @throws DataRefreshingException
	 * 2015年11月12日 qxs
	 */
	public boolean remove(String [] ids, String receiveUID) throws DataRefreshingException;
	
	/**
	 * 获取单条信息详情
	 * @param ID
	 * @param receiveUID 
	 * @return
	 * 2015年11月12日 qxs
	 * @throws DataRefreshingException 
	 */
	public Optional<Message> getSingle(String ID, String receiveUID) ;
	
	/**
	 * 分页查询
	 * @param message
	 * @param range
	 * @return
	 * 2015年11月12日 qxs
	 */
	public List<Message> list(Message message, Range range);

	/**
	 * 按条件查询所有，不分页
	 * @param message
	 * @return
	 * 2015年11月12日 qxs
	 */
	public List<Message> list(Message message);

	/**
	 * 修改消息的读取状态
	 * @param id
	 * @param receiveUID
	 * 2015年11月13日 qxs
	 * @throws Exception 
	 */
	public void refreshReadStatus(Message message) throws DataRefreshingException  ;
	
	/**
	 * 修改消息的读取状态
	 * @param ids
	 * @param receiveUID
	 * 2015年11月13日 qxs
	 */
	public void refreshReadStatus(String [] ids, Message message) throws DataRefreshingException  ;

	/**
	 * 查询数量
	 * @param message
	 * @return
	 * 2015年11月13日 qxs
	 */
	public int getAmount(Message message);

	
	
}
