/**
 * 
 */
package com.spring4.practise.mvc.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yashwanth
 *
 */
@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
//	private List<Topic> topics =new ArrayList<>(Arrays.asList(
//			new Topic("Spring","Spring Framwork","Spring Framework Description"),
//			new Topic("Java","Java SE 8","JSE 8 Description"),
//			new Topic("Angular 4","Angular JS ","Angular - JS Framework")
//			));
	
	public List<Course> getAllCourses(String topicId){
	
		
		//return topics;
		return courseRepository.findByTopicId(topicId);
	}
	
	public Course getCourse(String topicId) {
	
//		return topics.stream().filter(t->t.getId().
//				equals(topicId)).findFirst().get();	
//		
		return courseRepository.findById(topicId).get();
		//return courseRepository.findOne(topicId);
	}

	public void addCourse(Course topic) {
		//topics.add(topic);
		courseRepository.save(topic);
		
	}

	public void updateCourse(String id ,Course topic) {
//		for(Topic top :topics) {
//			if(top.getId().equals(id)){
//				
//				topics.remove(top);
//				topics.add(topic);
//				return;
//			}
//			
//		}
		
		courseRepository.save(topic);
	}

	public void deleteCourse(String id) {
		//topics.remove(getTopic(id));
		//topics.removeIf(t->t.getId().equals(id));
		courseRepository.delete(getCourse(id));
	}
}
