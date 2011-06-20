package org.exceptions;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.message.ExceptionMessage;
import org.mule.transformer.AbstractMessageTransformer;

public class ExceptionTransformer extends AbstractMessageTransformer{

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		// TODO Auto-generated method stub
		//System.out.print("message "+message.getPayload());
		ExceptionMessage msg = (ExceptionMessage) message.getPayload();
		//System.out.print("is this the payload? "+msg.getPayload());
		return msg.getPayload();
	}

}
