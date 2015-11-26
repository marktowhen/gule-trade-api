package com.jingyunbank.etrade.api.resource.service;

import com.jingyunbank.etrade.api.exception.FileStorageException;

public interface IStoreService {

	/**
	 * 完成文件的存储工作<p>
	 * 将存储后的文件的url返回调用端，隐藏存储细节。
	 * @param fname 文件名。
	 * @param content 文件内容字节数组
	 * @return 返回存储后的文件的访问uri
	 * @throws FileStorageException 抛出异常如果在执行存储的过程中
	 */
	public String store(String fname, byte[] content) throws FileStorageException;
	
}
