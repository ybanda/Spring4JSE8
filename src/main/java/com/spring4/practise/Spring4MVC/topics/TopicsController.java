/**
 * 
 */
package com.spring4.practise.Spring4MVC.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yashwanth
 *
 */
@RestController
public class TopicsController {

	
	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		
		return Arrays.asList(
				new Topics("Spring","Spring Framwork","Spring Framework Description"),
				new Topics("Java","Java SE 8","JSE 8 Description"),
				new Topics("Angular 4","Angular JS ","Angular - JS Framework")
				);
	}

}
