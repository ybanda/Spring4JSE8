/**
 * 
 */
package com.spring4.practise.Spring4MVC;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Yashwanth
 *
 */
public class TestContoller {

	
	@Value("${welcome.message:test}")
	private String message = "Testing the project";
	
	@RequestMapping("/")
	public String welcome(Map<String,Object> model){
		model.put("message", this.message);
		return "welcome";
	}

}
