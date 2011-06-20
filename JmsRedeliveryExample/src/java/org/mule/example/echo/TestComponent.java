package org.mule.example.echo;

import org.exceptions.MyException2;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class TestComponent implements Callable{

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		throw new MyException2("exception customized");
		//return eventContext;
	}

}
