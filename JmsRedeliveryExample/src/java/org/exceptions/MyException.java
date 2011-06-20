package org.exceptions;

public class MyException extends Exception{
	String mistake;
	
	public MyException() {
		super();
		mistake = "test";
	}
	
	public MyException(String err) {
		super(err);
		mistake = err;
	}
	
	 public String getError()
	  {
	    return mistake;
	  }

}