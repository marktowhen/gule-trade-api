package com.jingyunbank.etrade.api.message.service.context;

import com.jingyunbank.etrade.api.exception.NoticeDispatchException;
import com.jingyunbank.etrade.api.message.bo.Message;

/**
 * 系统消息异步通知服务<p>
 * 该服务只负责将消息放入消息队列，并不关心消息消费者何时处理分发。
 */
public interface IAsyncNotifyService {

	public static final String MQ_NOTIFY_TOPIC = "async-notify-service-dispatch-message";
	
	public static final String MQ_NOTIFY_TOPIC_TAG = "message";
	
	public void dispatch(Message message) throws NoticeDispatchException;
}
