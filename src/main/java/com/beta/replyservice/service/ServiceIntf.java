package com.beta.replyservice.service;

public interface ServiceIntf {

	/**
	 * 
	 * Method to retrieve the process message
	 * 
	 * @param msg
	 * @return String- processed data either reverse it or encode it
	 */
	String processData(String msg);

	/**
	 * 
	 * Method that handles the reversing of the message
	 * 
	 * @param msg
	 * @return String- reverse arrangement of the message
	 */
	String reverseData(String msg);

	/**
	 * 
	 * Method that handles the encoding of the message
	 * 
	 * @param msg
	 * @return String- encode message to MD5 hash
	 */
	String encodeData(String msg);
}
