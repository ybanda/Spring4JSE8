/**
 * 
 */
package com.spring4.practise.mvc.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yashwanth
 *
 */
@Service
public class TopicService {

	@Autowired
	private TopicsRepository topicsRepository;
	
//	private List<Topic> topics =new ArrayList<>(Arrays.asList(
//			new Topic("Spring","Spring Framwork","Spring Framework Description"),
//			new Topic("Java","Java SE 8","JSE 8 Description"),
//			new Topic("Angular 4","Angular JS ","Angular - JS Framework")
//			));
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicsRepository.findAll().forEach(topics::add);
		//return topics;
		return topics;
	}
	
	public Topic getTopic(String topicId) {
//	
//		return topics.stream().filter(t->t.getId().
//				equals(topicId)).findFirst().get();	
		
		//return topicsRepository.findOne(topicId);
		return topicsRepository.findById(topicId).get();
	}

	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicsRepository.save(topic);
		
	}

	public void updateTopic(String id ,Topic topic) {
//		for(Topic top :topics) {
//			if(top.getId().equals(id)){
//				
//				topics.remove(top);
//				topics.add(topic);
//				return;
//			}
//			
//		}
		
		topicsRepository.save(topic);
	}

	public void deleteTopic(String id) {
		//topics.remove(getTopic(id));
		//topics.removeIf(t->t.getId().equals(id));
		topicsRepository.delete(getTopic(id));
	}
}
