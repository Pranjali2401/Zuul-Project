package com.service.demo.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class PreFilter extends ZuulFilter {
	 
	  @Override
	  public String filterType() {
		  System.out.println("*****pre filter type***");
	    return "pre";
	  }
	 
	  @Override
	  public int filterOrder() {
		  System.out.println("*****pre filter order***");
	    return 1;
	  }
	 
	  @Override
	  public boolean shouldFilter() {
		  System.out.println("*****pre shouldFilter***");
	    return true;
	  }
	 
	  @Override
	  public Object run() {
		  System.out.println("*************in run*************");
	    RequestContext ctx = RequestContext.getCurrentContext();
	    ctx.addZuulRequestHeader("x-location", "USA");
	    
//	    HttpServletRequest request = ctx.getRequest();
	 
//	    System.out.println("Request Method : " + request.getMethod() + " Request URL : " + request.getRequestURL().toString());
	    return null;
	  }
	}