package com.asia.ProductShipment.login.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import com.asia.ProductShipment.login.Login;
import com.asia.ProductShipment.login.service.LoginService;
import com.asia.ProductShipment.users.Users;
import com.asia.ProductShipment.users.service.UsersService;
@Configuration
public class LoginFailureHandler implements AuthenticationFailureHandler{
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private UsersService usersService;

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		// TODO Auto-generated method stub
		Login login = new Login();
		Users u = new Users();
		u.setID(request.getParameter("userID"));
		List<Users> list = usersService.selectUserInfo(u);
		
		if(!list.isEmpty()) { //해당 로그인 아이디가 존재하는 경우
			login.setCust_code(list.get(0).getCUST_CODE());
			login.setCust_nm(list.get(0).getCUST_NM());
			
			if(Integer.parseInt(list.get(0).getCHK_PWD()) > 3) { // 비밀번호 3회이상 틀렸을경우
				login.setLogType("O");
			} else if(list.get(0).getSTOP().equals("Y")) { //사용 중지된 계정일경우
				login.setLogType("S");
			} else {
				login.setLogType("N");
			}
			
			usersService.updateLoginCount(u);
		} else { //로그인 아이디가 없는 경우
			login.setCust_code("0");	
			login.setCust_nm(request.getParameter("userID"));
			login.setLogType("F");
		}
		
		if (login.getLogType().equals("F")) {
			request.setAttribute("loginFailMsg", "※ 존재하지 않는 사용자입니다.");
		
		} else if(login.getLogType().equals("O")) {
			request.setAttribute("loginFailMsg", "※ 로그인 시도를 3회이상 실패하였습니다. 관리자에게 문의하세요.");
			
		} else if(login.getLogType().equals("S")) {
			request.setAttribute("loginFailMsg", "※ 사용 중지된 계정입니다.");
			
		} else if(login.getLogType().equals("N")) {
			request.setAttribute("loginFailMsg", "※ 올바르지 않은 비밀번호입니다.");
		}
		
		login.setLogID(loginService.loginLogMaxID(login));
		login.setIpAddr(request.getRemoteAddr());
		
		loginService.insertLoginLog(login);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/");
		dispatcher.forward(request, response);
	}

}
