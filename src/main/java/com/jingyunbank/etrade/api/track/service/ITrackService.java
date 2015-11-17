package com.jingyunbank.etrade.api.track.service;

import java.util.List;

import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.track.bo.CollectGoods;
import com.jingyunbank.etrade.api.track.bo.FootprintGoods;

/**
 * 推广延伸服务
 * @author liug
 *
 */
public interface ITrackService {
	/**
	 * 阿胶后台查询我的足迹
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<FootprintGoods> listFootprintGoods() throws Exception;
	/**
	 * 保存我的足迹
	 * @param uid
	 * @param gid
	 * @return
	 * @throws DataSavingException
	 */
	public boolean saveFootprint(String uid,String gid) throws DataSavingException;
	/**
	 * 保存我的收藏
	 * @param uid
	 * @param gid
	 * @return
	 * @throws DataSavingException
	 */
	public boolean saveCollect(String uid,String fid,String type) throws DataSavingException;
	/**
	 * 查询我的收藏店铺商品信息
	 * @return
	 * @throws Exception
	 */
	public List<CollectGoods> listMerchantCollect(String uid,String type) throws Exception;
	/**
	 * 查询我的收藏是否已经存在
	 * @param uid
	 * @param gid
	 * @return
	 * @throws Exception
	 */
	public boolean isCollectExists(String uid,String fid,String type)throws Exception;
}
