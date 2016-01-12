package com.jingyunbank.etrade.api.order.postsale.service.context;

import java.util.List;

import com.jingyunbank.etrade.api.exception.NoticeDispatchException;
import com.jingyunbank.etrade.api.order.postsale.bo.Refund;

public interface IRefundEventService {
	
	public final static String MQ_REFUND_QUEUE_DONE = "refund-event-service-broadcast-event-done";
	
	public void broadcast(List<Refund> event, String status) throws NoticeDispatchException;
}
