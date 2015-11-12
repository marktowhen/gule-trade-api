package com.jingyunbank.etrade.api.pay.service.context;

import com.jingyunbank.etrade.api.exception.PaymentException;
import com.jingyunbank.etrade.api.pay.bo.Payment;

public interface IPayContextService {

	public void pay(Payment payment) throws PaymentException;
	
	public void paydone(String transno) throws PaymentException;
	
	public void payfail(String transno) throws PaymentException;
}
