package com.jingyunbank.etrade.api.pay.service;

import java.util.List;

import com.jingyunbank.etrade.api.pay.bo.PayBank;

public interface IPayBankService {

	/**
	 * 列出所有支持快捷支付的银行信息
	 * @return
	 */
	public List<PayBank> listFastWayBanks();
	/**
	 * 列出所有支持快捷支付的银行信息
	 * @return
	 */
	public List<PayBank> listFastWayBanks(long from, long to);
	/**
	 * 列出所有支持网关支付的银行信息
	 * @return
	 */
	public List<PayBank> listGateWayBanks();
	/**
	 * 列出所有支持网关支付的银行信息
	 * @return
	 */
	public List<PayBank> listGateWayBanks(long from, long to);
	/**
	 * 列出所有支持储蓄卡快捷支付的银行信息
	 * @return
	 */
	public List<PayBank> listFastDebitWayBanks();
	/**
	 * 列出所有支持储蓄卡快捷支付的银行信息
	 * @return
	 */
	public List<PayBank> listFastDebitWayBanks(long from, long to);
	/**
	 * 列出所有支持信用卡快捷支付的银行信息
	 * @return
	 */
	public List<PayBank> listFastCreditWayBanks();
	/**
	 * 列出所有支持信用卡快捷支付的银行信息
	 * @return
	 */
	public List<PayBank> listFastCreditWayBanks(long from, long to);
	/**
	 * 列出所有支持信用卡网关支付的银行信息
	 * @return
	 */
	public List<PayBank> listGateCreditWayBanks();
	/**
	 * 列出所有支持信用卡网关支付的银行信息
	 * @return
	 */
	public List<PayBank> listGateCreditWayBanks(long from, long to);
	/**
	 * 列出所有支持储蓄卡快捷支付的银行信息
	 * @return
	 */
	public List<PayBank> listGateDebitWayBanks();
	/**
	 * 列出所有支持储蓄卡快捷支付的银行信息
	 * @return
	 */
	public List<PayBank> listGateDebitWayBanks(long from, long to);
	
}
