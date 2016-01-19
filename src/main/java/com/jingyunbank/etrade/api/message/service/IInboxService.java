package com.jingyunbank.etrade.api.message.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.message.bo.Message;
import com.jingyunbank.etrade.api.message.service.context.ISyncNotifyService;

/**
 * 站内信服务
 */
public interface IInboxService extends ISyncNotifyService{
	

	public boolean save(Message message) throws DataSavingException;
	
	/**
	 * 多个新增
	 * @param message
	 * @param receiveUids 接收人id
	 * 2015年11月12日 qxs
	 * @throws DataSavingException 
	 */
	public boolean save(Message message, String[] receiveUids) throws DataSavingException;
	
	/**
	 * 多个新增
	 * @param message
	 * @param receiveUids 接收人id
	 * 2015年11月12日 qxs
	 * @throws DataSavingException 
	 */
	public boolean save(List<Message> message) throws DataSavingException;
	/**
	 * 逻辑删除消息
	 * @param id
	 * @param receiveUID
	 * @return
	 * @throws DataRefreshingException
	 * 2015年11月12日 qxs
	 */
	boolean remove(String id, String receiveUID) throws DataRefreshingException;
	/**
	 * 批量删除
	 * @param ids
	 * @param receiveUID
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
	public Optional<Message> single(String ID) ;
	
	/**
	 * 列表查询
	 * @param uid
	 * @param range
	 * @return
	 * 2015年11月12日 qxs
	 */
	public List<Message> list(String uid, Range range);
	
	/**
	 * 查询数量
	 * @param receiveUID
	 * @return
	 * 2015年11月13日 qxs
	 */
	public int count(String receiveUID);
	/**
	 * 未读消息
	 * @param receiveUID
	 * @param range
	 * @return
	 * 2015年11月12日 qxs
	 */
	public List<Message> listUnread(String receiveUID, Range range);
	/**
	 * 已读消息数量
	 * @param receiveUID
	 * @return
	 * 2015年11月13日 qxs
	 */
	public int countRead(String receiveUID);
	
	/**
	 * 已读消息
	 * @param receiveUID
	 * @param range
	 * @return
	 * 2015年11月12日 qxs
	 */
	public List<Message> listRead(String receiveUID, Range range);
	/**
	 * 未读消息数量
	 * @param receiveUID
	 * @return
	 * 2015年11月13日 qxs
	 */
	public int countUnread(String receiveUID);

	/**
	 * 修改消息的读取状态
	 * @param id
	 * @param hasRead
	 * @throws DataRefreshingException
	 * 2015年11月20日 qxs
	 */
	public void refreshReadStatus(String  id , boolean hasRead) throws DataRefreshingException  ;
	
	/**
	 * 修改消息的读取状态
	 * @param ids
	 * @param hasRead
	 * @throws DataRefreshingException
	 * 2015年11月20日 qxs
	 */
	public void refreshReadStatus(String [] ids , boolean hasRead) throws DataRefreshingException  ;

	

	
	
}
