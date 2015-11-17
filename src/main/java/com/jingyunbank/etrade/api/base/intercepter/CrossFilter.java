package com.jingyunbank.etrade.api.base.intercepter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class CrossFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("filtered ........................");
		HttpServletResponse hsresponse = (HttpServletResponse) response;
		hsresponse.setHeader("Access-Control-Allow-Origin", "*");
		hsresponse.setHeader("Access-Control-Allow-Headers", "Content-Type");
		hsresponse.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");
		chain.doFilter(request, hsresponse);
	}

	@Override
	public void destroy() {
		
	}

}
