package com.guru.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.guru.pojo.HelloBean;

@RestController
public class TestController {
	
	@GetMapping
	public String echo() {
		return "GURU";
	}
	
	@GetMapping("test/{str}")
	public HelloBean all(@PathVariable String str) {
		HelloBean result = new HelloBean(str);
		return result;
	}
}
