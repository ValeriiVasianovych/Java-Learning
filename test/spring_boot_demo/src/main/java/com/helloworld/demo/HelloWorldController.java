package com.helloworld.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String helloWorld() {
		return "Hello, World From Spring Boot!";
	}
}
