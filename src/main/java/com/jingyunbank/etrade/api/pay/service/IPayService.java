package com.jingyunbank.etrade.api.pay.service;

import com.jingyunbank.etrade.api.pay.bo.Payment;

public interface IPayService {
	
	public void save(Payment payment);
	
	public void update(Payment payment);

}
