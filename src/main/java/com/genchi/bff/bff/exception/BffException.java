package com.genchi.bff.bff.exception;

import org.springframework.http.HttpStatus;

public class BffException extends Exception {
	
	private static final long serialVersionUID = 1L;

	private HttpStatus MyError;

	public HttpStatus getMyError() {
		return MyError;
	}

	public BffException(String message, HttpStatus myError) {
		super(message);
		this.MyError = myError;
	}

}
