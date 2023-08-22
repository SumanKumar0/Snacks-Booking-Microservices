package com.example.demo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MenuNotFoundException extends RuntimeException {

	public MenuNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
