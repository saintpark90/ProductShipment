package com.asia.ProductShipment.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asia.ProductShipment.login.Login;
import com.asia.ProductShipment.login.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginDao loginDao;
	
	@Override
	public int insertLoginLog(Login login) {
		// TODO Auto-generated method stub
		return loginDao.insertLoginLog(login);
	}

	@Override
	public int loginLogMaxID(Login login) {
		// TODO Auto-generated method stub
		return loginDao.loginLogMaxID(login);
	}

	@Override
	public List<Login> loginLogList(Login login) {
		// TODO Auto-generated method stub
		return loginDao.loginLogList(login);
	}

}
