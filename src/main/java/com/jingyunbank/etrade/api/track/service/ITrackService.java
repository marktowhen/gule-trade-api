package com.jingyunbank.etrade.api.track.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Optional;

import com.jingyunbank.core.Range;
import com.jingyunbank.etrade.api.exception.DataRefreshingException;
import com.jingyunbank.etrade.api.exception.DataRemovingException;
import com.jingyunbank.etrade.api.exception.DataSavingException;
import com.jingyunbank.etrade.api.track.bo.AdDetail;
import com.jingyunbank.etrade.api.track.bo.AdModule;
import com.jingyunbank.etrade.api.track.bo.FavoritesGoods;
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
	public List<FootprintGoods> listFootprintGoods(int from,int to) throws Exception;
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
	public boolean saveFavorites(String uid,String fid,String type) throws DataSavingException;
	/**
	 * 查询我的收藏店铺商品信息
	 * @return
	 * @throws Exception
	 */
	public List<FavoritesGoods> listMerchantFavorites(String uid,String type,int from,int to) throws Exception;
	/**
	 * 查询我的收藏是否已经存在
	 * @param uid
	 * @param gid
	 * @return
	 * @throws Exception
	 */
	public boolean isFavoritesExists(String uid,String fid,String type)throws Exception;
	/**
	 * 根据ID 删除我的收藏
	 * @param id
	 * @return
	 * @throws DataRemovingException
	 */
	public boolean removeFavoritesById(List<String> id) throws DataRemovingException;
	/**
	 * 获取我的收藏大小
	 * @param uid
	 * @param type
	 * @param from
	 * @param to
	 * @return
	 * @throws Exception
	 */
	public int countMerchantFavorites(String uid,String type) throws Exception;
	/**
	 * 查询广告列表
	 * @param code
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public List<AdDetail> listAdDetails(String code) throws IllegalAccessException, InvocationTargetException;
	/**
	 * 根据ID 查询广告模块
	 * @param id
	 * @return
	 */
	public Optional<AdModule> getAdmoduleInfo(String id);
	/**
	 * 根据ID 查询广告
	 * @param id
	 * @return
	 */
	public Optional<AdDetail> getAddetailInfo(String id);
	/**
	 * 保存广告模块
	 * @param adModule
	 * @return
	 * @throws DataSavingException
	 */
	public boolean saveAdmodule(AdModule adModule) throws DataSavingException;
	/**
	 * 保存广告
	 * @param adDetail
	 * @return
	 * @throws DataSavingException
	 */
	public boolean saveAddetail(AdDetail adDetail) throws DataSavingException;
	/**
	 * 更新广告模块
	 * @param adModule
	 * @return
	 * @throws DataRefreshingException
	 */
	public boolean updateAdmodule(AdModule adModule) throws DataRefreshingException;
	/**
	 * 更新广告
	 * @param adDetail
	 * @return
	 * @throws DataRefreshingException
	 */
	public boolean updateAddetail(AdDetail adDetail) throws DataRefreshingException;
	/**
	 * 查询广告模块列表
	 * @param adModule
	 * @param range
	 * @return
	 * @throws Exception
	 */
	public List<AdModule> listModulesByCondition(AdModule adModule, Range range) throws Exception;
	/**
	 * 查询广告列表
	 * @param adDetail
	 * @param range
	 * @return
	 * @throws Exception
	 */
	public List<AdDetail> listAddetailsByCondition(AdDetail adDetail, Range range) throws Exception;
}
