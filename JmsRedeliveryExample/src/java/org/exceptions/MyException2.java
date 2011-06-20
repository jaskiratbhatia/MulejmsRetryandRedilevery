package org.exceptions;

public class MyException2 extends Exception{
	String mistake;
	
	public MyException2() {
		super();
		mistake = "test";
	}
	
	public MyException2(String err) {
		super(err);
		mistake = err;
	}
	
	 public String getError()
	  {
	    return mistake;
	  }

}