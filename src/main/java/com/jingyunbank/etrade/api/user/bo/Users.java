package com.jingyunbank.etrade.api.user.bo;

import java.io.Serializable;

/**
 * 用户领域对象（业务对象），其中username，mobile， email必须是相互<br>
 * 独立，全局唯一的。<br><br>
 * usernmae 只能包含数字跟英文字母，不能包含点号等特殊字符，并且必须英文字母开头<br>
 * mobile 11位数字的有效手机号<br>
 * email 有效的邮箱地址，必须包含点好点号跟有效域名<br>
 *
 */
public class Users implements Serializable {

	private static final long serialVersionUID = 4649028411420209157L;
	private String ID;
	private String username;//global unique, ([a-zA-Z]+[a-zA-Z0-9]){4, 20}必须英文字母开头
	private String mobile;//11位数字的有效手机号
	private String email;//有效的邮箱
	private String password;
	private String tradepwd;
	private String nickname;
	private UserInfo uinfo;
	private boolean locked;
	private String openId;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTradepwd() {
		return tradepwd;
	}
	public void setTradepwd(String tradepwd) {
		this.tradepwd = tradepwd;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public UserInfo getUinfo() {
		return uinfo;
	}
	public void setUinfo(UserInfo uinfo) {
		this.uinfo = uinfo;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
}
