package com.jingyunbank.etrade.api.base.intercepter;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.jingyunbank.core.Result;
import com.jingyunbank.core.web.AuthBeforeOperation;
import com.jingyunbank.core.web.JsonResponse;
import com.jingyunbank.core.web.Security;

public class AuthIntercepter implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		HandlerMethod method = null;
		if(handler instanceof HandlerMethod){
			method = (HandlerMethod) handler;
		}
		
		if(method == null){
			try {
				JsonResponse.write(response, 
						Result.fail("服务异常，请稍后重试。").toString());
	        } catch (IOException e) {}
			return false;
		}
		
		AuthBeforeOperation requiredLogin = method.getMethodAnnotation(AuthBeforeOperation.class);
		if(requiredLogin != null){
			String[] requiredroles = requiredLogin.role();
			String[] requiredrolesname = requiredLogin.name();
			if(!Security.authenticated(request)){
				try {
		           JsonResponse.write(response, 
		        		   Result.fail("您还未登录，请先登录后继续操作。").setCode("400").toString());
		        } catch (IOException e) {}
				return false;
			}
			if(!Security.authorized(request, requiredroles)){
				try {
		           JsonResponse.write(response, 
		        		   Result.fail("您为被授权"+Arrays.asList(requiredrolesname)).setCode("400").toString());
		        } catch (IOException e) {}
				return false;
			}
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}


}
