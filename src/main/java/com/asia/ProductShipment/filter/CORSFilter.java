package com.asia.ProductShipment.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CORSFilter implements Filter {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		logger.info("init CORSFilter");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		logger.info("##### filter - before #####");
		chain.doFilter(req, res);
		logger.info("##### filter - after #####");
	}
	
	@Override
	public void destroy() {
		logger.info("destroy CORSFilter");
	}
	
}