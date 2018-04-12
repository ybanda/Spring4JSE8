package com.spring4.practise.Spring4MVC;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
//	@Value("${welcome.message:test}")
//	private String message = "Testing the project";
	
	@RequestMapping("/")
	public String welcome(Map<String,Object> model){
		//model.put("message", this.message);
		return "Hello Spring Boot";
	}
}