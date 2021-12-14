package com.asia.ProductShipment.login.service;

import java.util.List;

import com.asia.ProductShipment.login.Login;

public interface LoginService {
	public List<Login> loginLogList(Login login);
	
	public int loginLogMaxID(Login login);
	
	public int insertLoginLog(Login login);

}
