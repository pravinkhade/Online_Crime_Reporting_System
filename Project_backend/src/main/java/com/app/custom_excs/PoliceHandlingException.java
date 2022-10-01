package com.app.custom_excs;

public class PoliceHandlingException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PoliceHandlingException(String errMesg) {
		super(errMesg);
	}

}
