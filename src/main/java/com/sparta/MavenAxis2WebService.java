package com.sparta;

/**
 * @author shriramAllinOne
 *
 */
public class MavenAxis2WebService {
	
	/**
	 * @param text
	 * @return
	 */
	public String ping(String text) {
	    if (text == null) {
	      return "Service is up and available";
	    }
	    return "Service is up and available, message: " + text;
	  }
	}


