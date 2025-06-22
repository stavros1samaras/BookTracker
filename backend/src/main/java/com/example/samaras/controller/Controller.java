package com.example.samaras.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {		
	
	@GetMapping("/")
	public String getHello()
	{
		return "asdasd";
	}
	
	@GetMapping("/secured")
	public String getSecuredHello()
	{
		return "getSecuredHello";
	}			
}
