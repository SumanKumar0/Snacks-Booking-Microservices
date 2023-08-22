package com.example.demo.exception;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class MyException extends ResponseEntityExceptionHandler{
	 @ExceptionHandler({ MenuNotFoundException.class })
	    public ResponseEntity<?> handleException(RuntimeException e,WebRequest w) {
		 ResponseEntity<?> responseEntity=new ResponseEntity<String>(e.getMessage() , HttpStatus.NOT_FOUND);
		 return responseEntity;
	        //
	    }
}
