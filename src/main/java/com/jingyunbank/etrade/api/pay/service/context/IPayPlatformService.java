package com.jingyunbank.etrade.api.pay.service.context;

import java.util.List;

import com.jingyunbank.etrade.api.pay.bo.PayPlatform;

public interface IPayPlatformService {

	public List<PayPlatform> list();
	
}
