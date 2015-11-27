package com.jingyunbank.etrade.api.resource.service;

import com.jingyunbank.etrade.api.resource.bo.FileSystemServer;

public interface IFileSystemService {

	/**
	 * 返回 该子系统所在的服务器的业务类对象。
	 * <p>
	 * 即查询当前服务器的SERVER_ID_IN_CLUSTER环境变量值。然后去数据库 查询对应的记录并返回。<p>
	 * 如果没有查询到匹配的记录，则返回数据库中的第一条。
	 */
	public FileSystemServer current();

}
