/**
 * 
 */
package com.spring4.practise.Spring4MVC.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring4.practise.Spring4MVC.topics.Topic;

/**
 * @author Yashwanth
 *
 */
@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}

	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	/**
	 * RequestBody tells the spring MVC that ur req payload will contain json representation of Topic Object
	 * @param topic
	 */
	@RequestMapping(method =RequestMethod.POST,value="/topics/{topicId}/courses/{id}")
	public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/topics/{topicId}/courses/{id}")
	public void updateTopic(@RequestBody Course course , 
			@PathVariable String topicId,
			@PathVariable String id) {
		System.out.println(" Id :: "+id );
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(id,course);
	}
	
//	@RequestMapping(value ="/topic/{id}", method = RequestMethod.DELETE)
//	public void deleteTopic(@PathVariable String id) {
//		 courseService.deleteCourse(id);
//	}
	
}
