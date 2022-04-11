package com.wm.sistemacomercial.controler.exception;

public class CustomException extends Exception{


	private static final long serialVersionUID = 1L;

	public CustomException(String msg, Exception e) {
		System.out.println(msg);
//		System.out.println(e.getMessage());
//		System.out.println(e.getStackTrace());
//	     e.printStackTrace();
	    

	     
	}
		
	
}
