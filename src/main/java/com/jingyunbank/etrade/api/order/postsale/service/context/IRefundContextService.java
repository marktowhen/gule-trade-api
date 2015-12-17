package com.jingyunbank.etrade.api.order.postsale.service.context;

import com.jingyunbank.etrade.api.order.postsale.bo.Refund;

public interface IRefundContextService {
	/**
	 * 申请退款<br>
	 * 对为过退换货期的商品或订单申请退款，将订单状态修改为退款中，等待卖家同意
	 * @param refund
	 */
	public void refund(Refund refund);
	
	public void denyRefund(Refund refund);
	
	public void approveRefund(Refund refund);
	
	public boolean canRefund(String oid);
}
