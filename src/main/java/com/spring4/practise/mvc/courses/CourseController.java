/**
 * 
 */
package com.spring4.practise.mvc.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring4.practise.mvc.entity.Author;
import com.spring4.practise.mvc.services.AuthorService;
import com.spring4.practise.mvc.topics.Topic;

/**
 * @author Yashwanth
 *
 */
@RestController
@RequestMapping("/api")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@Autowired
	private AuthorService authorService;
	
	@GetMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}

	@GetMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	/**
	 * RequestBody tells the spring MVC that ur req payload will contain json representation of Topic Object
	 * @param topic
	 */
	@PostMapping(value="/topics/{topicId}/courses/{id}")
	public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	
	@PutMapping(value="/topics/{topicId}/courses/{id}")
	public void updateTopic(@RequestBody Course course , 
			@PathVariable String topicId,
			@PathVariable String id) {
		System.out.println(" Id :: "+id );
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(id,course);
	}
	
	@RequestMapping(value ="/topics/{id}", method = RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id) {
		 courseService.deleteCourse(id);
	}
	
	@GetMapping("/author1")
	public List<Author> getAllAuthors(){
		
		return authorService.getAllAuthors();
	}
}
