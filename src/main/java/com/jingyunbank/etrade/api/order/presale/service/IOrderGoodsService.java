package com.jingyunbank.etrade.api.order.presale.service;

import java.util.List;
import java.util.Optional;



import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.order.presale.bo.OrderGoods;
import com.jingyunbank.etrade.api.order.presale.bo.OrderStatusDesc;

/**
 * 用来管理操作订单中每件商品的服务接口
 */
public interface IOrderGoodsService {

	public void save(List<OrderGoods> goods) throws DataSavingException;
	
	/**
	 * 查询某用户的某订单状态下的所有订单商品
	 * @param uid
	 * @param status
	 * @return
	 */
	public List<OrderGoods> listOrderGoods(String uid,OrderStatusDesc status);/*OrderStatusDesc status*/
	
	public Optional<OrderGoods> singleOrderGoods(String id);

	/**
	 * 更新指定订单的商品信息的状态
	 * @param oids
	 * @param paid
	 */
	public void refreshStatus(List<String> oids, OrderStatusDesc paid) throws DataRefreshingException;
	public void refreshGoodStatus(String id, OrderStatusDesc paid) throws DataRefreshingException;
	
	
	public int getByOID(String oid,OrderStatusDesc status);
}
