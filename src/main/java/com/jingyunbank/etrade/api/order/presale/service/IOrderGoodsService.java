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
	public void refreshGoodStatus(List<String> ogids, OrderStatusDesc paid) throws DataRefreshingException;
	
	
	public int count(String oid,OrderStatusDesc status);

	/**
	 * 更新指定订单下某商品的状态
	 * @param oid
	 * @param gid
	 * @param commented
	 * @throws DataRefreshingException
	 * 2016年2月15日 qxs
	 */
	public void refreshGoodStatus(String oid, String gid,OrderStatusDesc commented) throws DataRefreshingException;
	
	public Optional<OrderGoods> singleOrderGoods(String OID, String GID);
}
