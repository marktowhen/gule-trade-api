package com.jingyunbank.etrade.api.message.service.context;

import com.jingyunbank.etrade.api.message.bo.Message;

/**
 * 系统同步消息发送服务<p>
 * 包括短信，邮件，站内信等实现<p>
 * 通常消费者将读到的消息委托给同步消息发送服务的实现处理。
 */
public interface ISyncNotifyService {

	public void inform(Message msg) throws Exception;
}
