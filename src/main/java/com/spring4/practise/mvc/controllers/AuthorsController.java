/**
 * 
 */
package com.spring4.practise.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring4.practise.mvc.entity.Author;
import com.spring4.practise.mvc.services.AuthorService;

/**
 * @author Yashwanth
 *
 */
@RestController
public class AuthorsController {

	@Autowired
	private AuthorService authorService;

	@RequestMapping("/authors")
	public List<Author> getAllAuthors(){
		System.out.println(authorService.getAllAuthors().get(0));
		return authorService.getAllAuthors();
	}
}
