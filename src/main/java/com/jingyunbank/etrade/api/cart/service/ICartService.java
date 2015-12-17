package com.jingyunbank.etrade.api.cart.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.etrade.api.cart.bo.Cart;
import com.jingyunbank.etrade.api.cart.bo.GoodsInCart;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;


public interface ICartService {

	/**
	 * 保存商品到购物车
	 * @param goods
	 * @throws DataSavingException
	 */
	public boolean save(GoodsInCart goods) throws DataSavingException;
	/**
	 * 更新购物车中商品的数量，价格等信息
	 * @param goods
	 * @throws DataRefreshingException
	 */
	public void refresh(GoodsInCart goods) throws DataRefreshingException;
	/**
	 * 将商品从购物车中移除
	 * @param gidInCart 商品在购物车中的id
	 * @throws DataRemovingException
	 */
	public void remove(String gidInCart) throws DataRemovingException;
	/**
	 * 将多件商品从购物车中移除
	 * @param gidInCart 商品在购物车中的id
	 * @throws DataRemovingException
	 */
	public void remove(List<String> gidsInCart) throws DataRemovingException;
	
	/**
	 * 将商品从用户的购物车中移除
	 * @param gid 商品id
	 * @throws DataRemovingException
	 */
	public void remove(String gid, String uid) throws DataRemovingException;
	/**
	 * 将多件商品从购物车中移除
	 * @param gids 商品id
	 * @throws DataRemovingException
	 */
	public void remove(List<String> gids, String uid) throws DataRemovingException;
	
	/**
	 * 列出用户购物车中的所有商品
	 * @param uid
	 * @return
	 */
	public List<GoodsInCart> listGoods(String uid);
	/**
	 * 列出所有购物车中的商品
	 * @param cartID
	 * @return
	 */
	public List<GoodsInCart> listGoodsIntCart(String cartID);
	/**
	 * 为用户创建一个购物车
	 * @param cart
	 * @throws DataSavingException
	 */
	public void save(Cart cart) throws DataSavingException;
	/**
	 * 获取用户的购物车信息
	 * @param uid
	 * @return
	 */
	public Optional<Cart> singleCart(String uid);
	/**
	 * 删除用户购物车中的所有商品
	 * @param loginUID
	 * @throws DataRemovingException
	 */
	public void clear(String uid) throws DataRemovingException;
	/**
	 * 指定用户的购物车中的商品数量
	 * @param uid
	 * @return
	 */
	public int count(String uid);
	
}
