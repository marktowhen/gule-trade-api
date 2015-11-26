package com.jingyunbank.etrade.api.resource.bo;

/**
 * 文件系统服务器的业务类，用于分布式是横向拓展文件服务器使用。<p>
 * 每个上传的图片，等其他文件资源被 按照一定的随机算法存储到不同的文件系统中.
 */
public class FileSystemServer {

	private String code;
	private String name;
	private String host;
	private String rootpath;
	private int rankl;
	private int rankh;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getRootpath() {
		return rootpath;
	}
	public void setRootpath(String rootpath) {
		this.rootpath = rootpath;
	}
	public int getRankl() {
		return rankl;
	}
	public void setRankl(int rankl) {
		this.rankl = rankl;
	}
	public int getRankh() {
		return rankh;
	}
	public void setRankh(int rankh) {
		this.rankh = rankh;
	}
	
}
