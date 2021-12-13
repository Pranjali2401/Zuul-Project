package com.service.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GoodByeController {

	@GetMapping("/")
	public String getService() {
		return "Good Bye !";
	}
	
}
