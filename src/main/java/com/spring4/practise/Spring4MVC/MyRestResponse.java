/**
 * 
 */
package com.spring4.practise.Spring4MVC;

/**
 * @author Yashwanth
 *
 */
public class MyRestResponse {

	private String message;
	
	public MyRestResponse(String message) {
		this.message=message;
	}
	public String getMessage() {
		return this.message;
	}
}
