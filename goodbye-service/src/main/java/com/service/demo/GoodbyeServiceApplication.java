package com.service.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class GoodbyeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodbyeServiceApplication.class, args);
	}

}
