package com.asia.ProductShipment.users.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.asia.ProductShipment.users.Users;
import com.asia.ProductShipment.users.dao.UsersDao;

@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersDao usersDao;
	
	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@Override
	public List<Users> selectUsersList(Users u) {
		// TODO Auto-generated method stub
		return usersDao.selectUsersList(u);
	}
	
	@Override
	public List<Users> selectCust(Users u) {
		// TODO Auto-generated method stub
		return usersDao.selectCust(u);
	}
	
	@Override
	public List<Users> selectUserInfo(Users u) {
		// TODO Auto-generated method stub
		return usersDao.selectUserInfo(u);
	}
	
	@Override
	public String selectUserCustcode(Users u) {
		// TODO Auto-generated method stub
		return usersDao.selectUserCustcode(u);
	}
	
	@Override
	public String selectUserPassword(Users u) {
		// TODO Auto-generated method stub
		return usersDao.selectUserPassword(u);
	}
	
	@Override
	public int insertUser(Users u) {
		// TODO Auto-generated method stub
		u.setPWD(encoder().encode(u.getPWD()));
		return usersDao.insertUser(u);
	}

	@Override
	public int updateUser(Users u) {
		// TODO Auto-generated method stub
		return usersDao.updateUser(u);
	}

	@Override
	public int deleteUser(Users u) {
		// TODO Auto-generated method stub
		return usersDao.deleteUser(u);
	}

	@Override
	public int updateUserPwdCount(Users u) {
		// TODO Auto-generated method stub
		return usersDao.updateUserPwdCount(u);
	}

	@Override
	public int updateUserPassword(Users u) {
		// TODO Auto-generated method stub
		u.setPWD(new BCryptPasswordEncoder().encode(u.getPWD()));
		return usersDao.updateUserPassword(u);
	}

	@Override
	public PasswordEncoder encoder() {
		// TODO Auto-generated method stub
		return this.passwordEncoder;
	}

	@Override
	public int updateLoginCount(Users u) {
		// TODO Auto-generated method stub
		return usersDao.updateLoginCount(u);
	}
}
