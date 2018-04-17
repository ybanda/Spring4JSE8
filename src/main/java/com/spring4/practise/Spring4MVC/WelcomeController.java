package com.spring4.practise.Spring4MVC;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class WelcomeController {
	
	@Value("${application.message:Hello World}")
	private String message = "Hello World";
	
	@RequestMapping("/")
	public String welcome(Map<String,Object> model){
		model.put("message",this.message);
		return "welcome";
	}
	
	@RequestMapping("/JSE8")
	public String welcomeJSE8(Map<String,Object> model){
		
		return "javase8";
	}
	
	@RequestMapping("/fail")
	public String fail() {
		throw new MyException("Oh dear!");
	}

	@RequestMapping("/fail2")
	public String fail2() {
		throw new IllegalStateException();
	}

	
	@ExceptionHandler(MyException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public @ResponseBody MyRestResponse handleMyRuntimeException(MyException exception) {
		return new MyRestResponse("Exception while sending the response to client");
		
	}
}