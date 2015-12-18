package com.jingyunbank.etrade.api.order.postsale.service.context;

import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.postsale.bo.Refund;
import com.jingyunbank.etrade.api.order.postsale.bo.RefundLogistic;

public interface IRefundContextService {
	/**
	 * 申请退款<br>
	 * 对为过退换货期的商品或订单申请退款，将订单状态修改为退款中，等待卖家同意
	 * @param refund
	 */
	public void request(Refund refund) throws DataSavingException, DataRefreshingException;
	/**
	 * 撤销本次退款申请
	 * @param RID
	 * @throws DataRefreshingException
	 */
	public void cancel(String RID) throws DataRefreshingException, DataSavingException;
	/**
	 * 同意买家的退款申请。如果用户不需要退货，则退款流程结束.
	 * 否则，用户需要发货并提交发货信息，等待卖家进一步审批。
	 * @param RID
	 * @param note 如果需要退货，则note为卖家的收货地址
	 * @throws DataRefreshingException
	 */
	public void accept(String RID, String note) throws DataRefreshingException, DataSavingException;
	/**
	 * 卖家拒绝了买家的退款申请
	 * @param RID
	 * @param note
	 * @throws DataRefreshingException
	 */
	public void deny(String RID, String note) throws DataRefreshingException, DataSavingException;
	/**
	 * 买家完成发货并上传物流信息
	 * @param logistic
	 * @throws DataSavingException
	 */
	public void doReturn(RefundLogistic logistic) throws DataSavingException, DataRefreshingException;
	/**
	 * 卖家完成整个退款退货
	 * @param RID
	 * @throws DataRefreshingException
	 * @throws DataSavingException
	 */
	public void done(String RID) throws DataRefreshingException, DataSavingException;
}
