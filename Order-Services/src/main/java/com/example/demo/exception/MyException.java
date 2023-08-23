package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import feign.FeignException;
@RestControllerAdvice
public class MyException extends ResponseEntityExceptionHandler{
	@ExceptionHandler({ OrderNotFoundException.class })
    public ResponseEntity<?> handleException(RuntimeException e,WebRequest w) {
	 ResponseEntity<?> responseEntity=new ResponseEntity<String>(e.getMessage() , HttpStatus.NOT_FOUND);
	 return responseEntity;
        //
    }
	@ExceptionHandler({ FeignException.class })
    public ResponseEntity<?> handleFeingException(FeignException e,WebRequest w) {
	System.out.println(e.getLocalizedMessage());
	System.out.println(e.getStackTrace());
	String err[]=e.getMessage().split(":");
	 ResponseEntity<?> responseEntity=new ResponseEntity<String>(err[err.length-1] , HttpStatus.NOT_FOUND);
	 return responseEntity;
        //
    }
}
