/**
 * 
 */
package com.spring.practise.mvc.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.practise.mvc.entity.Author;

/**
 * @author Yashwanth
 *
 */
@Service
public class AuthorService {

	public List<Author> getAllAuthors(){

		List<Author> authorList = new ArrayList<Author>();
		authorList.add(new Author(1,"Yashwanth Banda","Charlotte,NC"));
		authorList.add(new Author(2,"Banda 1","Charlotte,NC"));
		authorList.add(new Author(3,"Banda 2","Charlotte,NC"));
		
		return authorList;
	}
}
