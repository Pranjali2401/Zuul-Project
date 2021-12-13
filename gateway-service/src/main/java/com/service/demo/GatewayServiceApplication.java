package com.service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.service.demo.filter.PreFilter;

@SpringBootApplication
@EnableZuulProxy
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

//	@Bean
//	public PreFilter preFilter() {
//		System.out.println("pre filter***************************");
//	    return new PreFilter();
//	}
	
//	@Bean
//	public PostFilter postFilter() {
//		System.out.println("post filter****************");
//	    return new PostFilter();
//	}
//	@Bean
//	public ErrorFilter errorFilter() {
//		System.out.println("error filter****************");
//	    return new ErrorFilter();
//	}
//	@Bean
//	public RouteFilter routeFilter() {
//		System.out.println("router filter****************");
//	    return new RouteFilter();
//	}

}
