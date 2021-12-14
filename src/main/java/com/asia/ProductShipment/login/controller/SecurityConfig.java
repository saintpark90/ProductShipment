package com.asia.ProductShipment.login.controller;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.extern.log4j.Log4j;

@Log4j
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	public AuthenticationSuccessHandler authenticationSuccessHandler;
	
	@Autowired
	public AuthenticationFailureHandler authenticationFailureHandler;
	/*
	 * @Autowired private LoginUserDetailsService loginUserDetailsService;
	 */
	@Override
    protected void configure(HttpSecurity http) {
		final Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.info("security config....");
		
		try {
			http.authorizeRequests()
			.antMatchers("/",
					"/white.do",
					"/css/login/**",
					"/js/*",
					"/image/*",
					"/css/bootstrap-4.0.0/dist/css/bootstrap.min.css"
					).permitAll()
			.antMatchers("/board").hasRole("ADMIN")
			.anyRequest().authenticated();
			
			http.formLogin()
            .loginPage("/") //앞으로 로그인은 이 경로에서 수행하게 된다는 뜻이다.
            .loginProcessingUrl("/login") //로그인 form 의 action 과 일치시켜주어야 한다.
            .defaultSuccessUrl("/board.do")
            .successHandler(authenticationSuccessHandler)
            .failureHandler(authenticationFailureHandler)
            .usernameParameter("userID")
            .passwordParameter("password")
            .permitAll();
			
			http.logout()
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            .logoutSuccessUrl("/")
            .invalidateHttpSession(true);
			
			http.exceptionHandling()
            .accessDeniedPage("/denied");
			
			http.csrf().ignoringAntMatchers(
					"/viewDetail.do", 
					"/custSelect.do", 
					"/main.do", 
					"/checkMypassword.do", 
					"updateUserPassword.do",
					"/viewDetail_board.do",
					"/excelDown.do");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	 @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        // add our Users for in memory authentication
			/*
			 * auth.inMemoryAuthentication() .withUser("admin")
			 * .password(passwordEncoder().encode("1234")).roles("ADMIN");
			 */
		 	auth.jdbcAuthentication()
		 	.dataSource(dataSource)
		 	.rolePrefix("ROLE_")
		 	.usersByUsernameQuery("SELECT ID, replace(PWD, '$2y', '$2a'), 1 FROM SHIP_PROD_USER_INFO WHERE ID = ? AND STOP != 'Y' AND CHK_PWD < 4")
		 	.authoritiesByUsernameQuery("SELECT ID, TYPE FROM SHIP_PROD_USER_INFO WHERE ID = ? AND STOP != 'Y' AND CHK_PWD < 4");
	 }
	 
	 @Bean
	  public BCryptPasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	  }

}
