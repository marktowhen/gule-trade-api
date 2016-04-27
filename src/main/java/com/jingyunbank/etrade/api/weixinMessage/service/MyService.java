package com.jingyunbank.etrade.api.weixinMessage.service;

import com.jingyunbank.etrade.api.weixinMessage.bo.AccountFans;
import com.jingyunbank.etrade.api.weixinMessage.bo.MpAccount;
import com.jingyunbank.etrade.api.weixinMessage.bo.MsgRequest;

import net.sf.json.JSONObject;

/**
 * 我的微信服务接口，主要用于结合自己的业务和微信接口
 */
public interface MyService {
	
	//消息处理
	public String processMsg(MsgRequest msgRequest,MpAccount mpAccount);


	
	//获取用户列表
	public boolean syncAccountFansList(MpAccount mpAccount);
	
	//获取单个用户信息
	public AccountFans syncAccountFans(String openId, MpAccount mpAccount, boolean merge);
	

	
}



