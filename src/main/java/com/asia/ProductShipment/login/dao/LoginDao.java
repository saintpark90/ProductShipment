package com.asia.ProductShipment.login.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.asia.ProductShipment.login.Login;

@Mapper
public interface LoginDao {
	public List<Login> loginLogList(Login login);
	
	public int loginLogMaxID(Login login);
	
	public int insertLoginLog(Login login);
}