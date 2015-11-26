package com.jingyunbank.etrade.api.resource.service;

import com.jingyunbank.etrade.api.resource.bo.FileSystemServer;

public interface IFileSystemService {

	/**
	 * 随机选择一个文件服务器
	 */
	public FileSystemServer random();

}
