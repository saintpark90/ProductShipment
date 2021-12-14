package com.asia.ProductShipment.users.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.asia.ProductShipment.users.Users;

@Mapper
public interface UsersDao {
	public List<Users> selectUsersList(Users u);
	
	public List<Users> selectCust(Users u);
	
	public List<Users> selectUserInfo(Users u);
	
	public String selectUserCustcode (Users u);
	
	public String selectUserPassword (Users u);
	
	public int insertUser(Users u);
	
	public int updateUser(Users u);
	
	public int updateUserPwdCount (Users u);
	
	public int deleteUser(Users u);
	
	public int updateUserPassword(Users u);
	
	public int updateLoginCount(Users u);
}
