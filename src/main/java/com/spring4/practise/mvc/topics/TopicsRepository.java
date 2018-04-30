/**
 * 
 */
package com.spring4.practise.mvc.topics;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Yashwanth
 *
 */

@Repository
public interface TopicsRepository extends CrudRepository<Topic,String>{
//	getAllTopics()
//	getTopic(String id)
//	updateTopic(Topic t)
//	deleteTopic(String id)
}
