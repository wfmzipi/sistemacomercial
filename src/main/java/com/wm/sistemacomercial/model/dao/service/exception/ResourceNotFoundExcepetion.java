package com.wm.sistemacomercial.model.dao.service.exception;

public class ResourceNotFoundExcepetion extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExcepetion(Object id) {
		super("Resource not found. Id: "+ id);
	}
	
}
