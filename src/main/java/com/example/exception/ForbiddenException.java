package com.example.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class ForbiddenException extends RuntimeException {

	private final String message;

	public ForbiddenException() {
		this.message = ("Forbidden.");
	}

	public ForbiddenException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
