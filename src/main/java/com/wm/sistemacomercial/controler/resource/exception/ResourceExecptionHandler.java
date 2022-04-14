package com.wm.sistemacomercial.controler.resource.exception;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.wm.sistemacomercial.model.dao.service.exception.ResourceNotFoundExcepetion;

@ControllerAdvice
public class ResourceExecptionHandler {
	
	@ExceptionHandler(ResourceNotFoundExcepetion.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundExcepetion e,HttpServletRequest request){
		String error = "resource not found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(),status.value(),error,e.getMessage(),request.getRequestURI());
		return ResponseEntity.status(status).body(err);
		
	}

}
