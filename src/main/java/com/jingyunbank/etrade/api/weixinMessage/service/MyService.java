package com.jingyunbank.etrade.api.weixinMessage.service;

import java.util.Map;

/**
 * 我的微信服务接口，主要用于结合自己的业务和微信接口
 */
public interface MyService {
	
	/**
	 * 推送操作结果信息到用户
	 * @param templateId   模板id
	 * @param userId 用户id
	 * @param dataMap   数据包
	 * @return
	 */
	public boolean sendMessageToUser(String templateId,String userId,Map<String, String> dataMap);


	

	
}



