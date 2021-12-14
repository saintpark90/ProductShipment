package com.asia.ProductShipment.users.service;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.asia.ProductShipment.users.Users;

public interface UsersService {
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
	
	public PasswordEncoder encoder();
	
	public int updateLoginCount(Users u);
}
