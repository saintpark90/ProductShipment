package com.asia.ProductShipment.login.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.asia.ProductShipment.login.Login;
import com.asia.ProductShipment.login.service.LoginService;
import com.asia.ProductShipment.users.Users;
import com.asia.ProductShipment.users.service.UsersService;

@Configuration
public class LoginSuccessHandler implements AuthenticationSuccessHandler{
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private UsersService usersService;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		// TODO Auto-generated method stub
		Login login = new Login();
		Users u = new Users();
		u.setID(request.getParameter("userID"));
		u.setPWD(request.getParameter("password"));
		usersService.updateUserPwdCount(u); //chk_pwd를 0으로 해준다.
		List<Users> list = usersService.selectUserInfo(u);
		
		HttpSession session = (HttpSession)request.getSession();
		session.setAttribute("greeting", authentication.getName() + "님 반갑습니다.");
		
		login.setLogID(loginService.loginLogMaxID(login));
		login.setCust_code(list.get(0).getCUST_CODE());
		login.setCust_nm(list.get(0).getCUST_NM());
		login.setIpAddr(request.getRemoteAddr());
		login.setLogType("Y");
		
		loginService.insertLoginLog(login);
		
		//아이디와 비밀번호가 같으면 비밀번호 변경 창으로 이동한다.
		if(u.getID().equals(u.getPWD())) {
			session.setAttribute("changePWD", "Y");
			//response.sendRedirect("/password.do");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/password.do");
			dispatcher.forward(request, response);
		}else {
			//response.sendRedirect("/main.do");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/board.do");
			dispatcher.forward(request, response);
		}
		
		
	}

}
