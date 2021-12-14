package com.asia.ProductShipment.main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.asia.ProductShipment.main.Main;

@Mapper
public interface MainDao {
	public List<Main> selectListMain(Main m);
	
	public List<Main> selectListDetail(Main m);
}
