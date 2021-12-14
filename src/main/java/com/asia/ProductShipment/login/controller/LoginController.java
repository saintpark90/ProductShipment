package com.asia.ProductShipment.login.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.asia.ProductShipment.login.Login;
import com.asia.ProductShipment.login.dao.LoginDao;

@RestController
public class LoginController {
	
	@Autowired
	private LoginDao loginDao;
	
	@RequestMapping("/")
	public ModelAndView loginView(HttpSession session, Login login) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		
		if(session.getAttribute("changePWD") != null) {
			modelAndView.setViewName("/password");
		} else {
			modelAndView.setViewName("/login");
		}
		
		
		
		return modelAndView;
		
	}
	
	@RequestMapping("/login.do")
	public ModelAndView login(Login login) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/board");
		return modelAndView;

	}
	
	@RequestMapping("/white.do")
	public ModelAndView white(Login login) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/white");
		return modelAndView;

	}
	
	@RequestMapping("/loginLog.do")
	public ModelAndView loginLogList(Login login) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/loginLog");
		
		List<Login> list = loginDao.loginLogList(login);
		modelAndView.addObject("data",list);
		
		return modelAndView;

	}
}
