package com.jingyunbank.etrade.api.marketing.rankgroup.service;

import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupGoods;
import com.jingyunbank.etrade.api.marketing.group.bo.GroupGoodsShow;
import com.jingyunbank.etrade.api.marketing.rankgroup.bo.RankGroupGoods;
import com.jingyunbank.etrade.api.marketing.rankgroup.bo.RankGroupGoodsShow;

public interface IRankGroupGoodsService {
	
	/**
	 * 添加阶梯团购商品
	 * @param goods
	 * @throws DataSavingException
	 */
	public void save(RankGroupGoods goods) throws DataSavingException;
	
	
	/**
	 * 查询阶梯团购上架商品列表
	 * @param MID
	 * @param goodsName
	 * @param range
	 * @return
	 */
	public List<RankGroupGoodsShow> list(String MID, String goodsName, Range range) ;
	
	/**
	 * 查看上架商品详情
	 * @param id
	 * @return
	 */
	public Optional<RankGroupGoods> single(String id) ;
	
	/**
	 * 根据团购id查询商品信息  到期团购 根据人数确定最终商品单价
	 * @param gid
	 * @return
	 */
	public Optional<RankGroupGoods> singleByGid(String gid);
	
	/**
	 * 修改商品信息
	 * @param goodsbo
	 * @throws DataRefreshingException
	 */
	public void refresh(RankGroupGoods goodsbo) throws DataRefreshingException;
	
	public int count(String mid, String goodsName);
	
	public Optional<RankGroupGoods> singleByGroupID(String groupID) ;
}
