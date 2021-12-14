package com.asia.ProductShipment.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asia.ProductShipment.main.Main;
import com.asia.ProductShipment.main.dao.MainDao;

@Service
public class MainServiceImpl implements MainService{
	
	@Autowired
	private MainDao mainDao;
	
	@Override
	public List<Main> selectListMain(Main m) {
		// TODO Auto-generated method stub
		return mainDao.selectListMain(m);
	}

	@Override
	public List<Main> selectListDetail(Main m) {
		// TODO Auto-generated method stub
		return mainDao.selectListDetail(m);
	}

}
