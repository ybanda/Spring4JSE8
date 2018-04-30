package com.spring.practise.mvc.entity;

public class Author {

	private int authorId;
	private String authorName;
	private String authorAddress;
	
	private String message;
	
	public Author(int authorId, String authorName, String authorAddress) {
		this.authorAddress=authorAddress;
		this.authorId =authorId;
		this.authorName=authorName;
	}

	/**
	 * @return the authorId
	 */
	public int getAuthorId() {
		return authorId;
	}

	/**
	 * @param authorId the authorId to set
	 */
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	/**
	 * @return the authorAddress
	 */
	public String getAuthorAddress() {
		return authorAddress;
	}

	/**
	 * @param authorAddress the authorAddress to set
	 */
	public void setAuthorAddress(String authorAddress) {
		this.authorAddress = authorAddress;
	}

	

	/**
	 * @return the message
	 */
	/*public String getMessage() {
		return message;
	}*/

	/**
	 * @param message the message to set
	 */
	/*public void setMessage(String message) {
		this.message = message;
	}*/
	
}
