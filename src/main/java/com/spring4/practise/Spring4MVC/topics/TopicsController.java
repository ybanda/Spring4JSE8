/**
 * 
 */
package com.spring4.practise.Spring4MVC.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yashwanth
 *
 */
@RestController
public class TopicsController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	/**
	 * RequestBody tells the spring MVC that ur req payload will contain json representation of Topic Object
	 * @param topic
	 */
	@RequestMapping(method =RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic , @PathVariable String id) {
		System.out.println(" Id :: "+id );
		topicService.updateTopic(id,topic);
	}
	
	@RequestMapping(value ="/topic/{id}", method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		 topicService.deleteTopic(id);
	}
	
}
