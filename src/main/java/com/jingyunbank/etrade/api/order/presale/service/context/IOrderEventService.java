package com.jingyunbank.etrade.api.order.presale.service.context;

import java.util.List;

import com.jingyunbank.etrade.api.exception.NoticeDispatchException;
import com.jingyunbank.etrade.api.order.presale.bo.Orders;

public interface IOrderEventService {

	
	public final static String MQ_ORDER_QUEUE_SAVE = "order-event-service-broadcast-event-save";
	
	public final static String MQ_ORDER_QUEUE_PAYSUCC = "order-event-service-broadcast-event-paysuccess";
	
	public final static String MQ_ORDER_QUEUE_PAYFAIL = "order-event-service-broadcast-event-payfail";
	
	public final static String MQ_ORDER_QUEUE_DISPATCH = "order-event-service-broadcast-event-dispatch";
	
	public void broadcast(List<Orders> event, String status) throws NoticeDispatchException;
}
