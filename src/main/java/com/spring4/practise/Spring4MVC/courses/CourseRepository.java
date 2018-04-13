/**
 * 
 */
package com.spring4.practise.Spring4MVC.courses;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Yashwanth
 *
 */

@Repository
public interface CourseRepository extends CrudRepository<Course,String>{

	//public List<Course> getCoursesByTopic(String topicId);
	
//	public List<Course> findByName(String name);
//	public List<Course> findByDescription(String description);
//	public List<Course> findByTopicId(String id);
//	
	
	
}
