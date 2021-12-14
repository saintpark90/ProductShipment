package com.asia.ProductShipment.users.controller;

import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.asia.ProductShipment.users.Users;
import com.asia.ProductShipment.users.service.UsersService;

@RestController
public class UsersController {
	@Autowired
	private UsersService usersService;
	
	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	@RequestMapping("/users.do")
	public ModelAndView selectUserList(Users u) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("users");
		
		List<Users> list = usersService.selectUsersList(u);
		modelAndView.addObject("data",list);
		if(u.getSTOP() == null) {
			modelAndView.addObject("scrollYN","N");
		} else {
			modelAndView.addObject("scrollYN","Y");
		}
		
		
		return modelAndView;
	}
	
	@RequestMapping("/password.do")
	public ModelAndView password(Users u) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("password");		
		return modelAndView;
	}
	
	@PostMapping("/checkMypassword.do")
	public ResponseEntity<?> checkMypassword(@Validated Users u, Errors errors) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		UserDetails userDetails = (UserDetails)principal;
		
		Boolean b = false;
		u.setID(userDetails.getUsername());
		if (passwordEncoder.matches(u.getNowPWD(), usersService.selectUserPassword(u))) {
			b = true;
		}
		return ResponseEntity.ok(b);
	}
	
	@SuppressWarnings("deprecation")
	@RequestMapping("/insertUser.do")
	public ModelAndView insertUser(Users u) throws Exception {
		String s[] = URLDecoder.decode(u.getSelectCust()).split("/");
		
		//u.setID(s[0]);
		//u.setPWD(s[0]);
		u.setCUST_CODE(s[0]);
		u.setCUST_NM(s[1]);
		u.setBZ_REG_NO(s[2]);
		u.setTYPE(s[3]);
		
		usersService.insertUser(u);
		return selectUserList(u);
	}
	
	@RequestMapping("/updateUserPwdCount.do")
	public ModelAndView updateUserPwdCount(Users u) throws Exception {
		usersService.updateUserPwdCount(u);
		return selectUserList(u);
	}
	
	@RequestMapping("/deleteUser.do")
	public ModelAndView deleteUser(Users u) throws Exception {
		usersService.deleteUser(u);
		return selectUserList(u);
	}
	
	@PostMapping("/custSelect.do")
	public ResponseEntity<?> custSelect(@Validated Users u, Errors errors) {
		List<Users> list = usersService.selectCust(u);
		return ResponseEntity.ok(list);
	}
	
	//@SuppressWarnings("deprecation")
	@RequestMapping("/updateUserPassword.do")
	public ModelAndView updateUserPassword(HttpSession session, Users u) throws Exception {
		session.setAttribute("changePWD", null);
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		UserDetails userDetails = (UserDetails)principal;
		u.setID(userDetails.getUsername());
		//u.setPWD(URLDecoder.decode(u.getPWD()));
		usersService.updateUserPassword(u);
		return password(u);
	}
	
	@RequestMapping("/updateUser.do")
	public ModelAndView updateUser(Users u) throws Exception {
		usersService.updateUser(u);
		return selectUserList(u);
	}
	
		
	
	public PasswordEncoder encoder() {
		// TODO Auto-generated method stub
		return this.passwordEncoder;
	}
}
