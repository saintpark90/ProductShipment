package com.asia.ProductShipment.login;

import lombok.Data;

@Data
public class Login {
	private String userID;
	private String password;
	private String cust_code;
	private String cust_nm;
	private String bz_reg_no;
	private String chk_pwd;
	private String stop;
	private String type;
	private String loginFail;
	private Boolean boolMaster;
	
	private int logID;
	private String ipAddr;
	private String logType;
	private String loginPage;
	private String regDate;
	
	public String getCust_code() {
		return cust_code;
	}
	public void setCust_code(String cust_code) {
		this.cust_code = cust_code;
	}
	public String getCust_nm() {
		return cust_nm;
	}
	public void setCust_nm(String cust_nm) {
		this.cust_nm = cust_nm;
	}
	public String getBz_reg_no() {
		return bz_reg_no;
	}
	public void setBz_reg_no(String bz_reg_no) {
		this.bz_reg_no = bz_reg_no;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getChk_pwd() {
		return chk_pwd;
	}
	public void setChk_pwd(String chk_pwd) {
		this.chk_pwd = chk_pwd;
	}
	public String getStop() {
		return stop;
	}
	public void setStop(String stop) {
		this.stop = stop;
	}
	public String getLoginFail() {
		return loginFail;
	}
	public void setLoginFail(String loginFail) {
		this.loginFail = loginFail;
	}
	public Boolean getBoolMaster() {
		return boolMaster;
	}
	public void setBoolMaster(Boolean boolMaster) {
		this.boolMaster = boolMaster;
	}
	public int getLogID() {
		return logID;
	}
	public void setLogID(int logID) {
		this.logID = logID;
	}
	public String getIpAddr() {
		return ipAddr;
	}
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	public String getLogType() {
		return logType;
	}
	public void setLogType(String logType) {
		this.logType = logType;
	}
	public String getLoginPage() {
		return loginPage;
	}
	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	
}
