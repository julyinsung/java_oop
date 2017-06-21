package tdd.sample.one;

public class MessageFactory {
	
	public static Message generateMessage(MessageType messageType) {
		Message message = null;
		
		switch (messageType) {
		case MESSAGE_TYPE_SMS:
			message = new SMSMessage();
			break;
		case MESSAGE_TYPE_MMS:
			message = new MMSMessage();
			break;
		case MESSAGE_TYPE_PUSH:
			message = new PushMessage();
			break;
		case MESSAGE_TYPE_EMAIL:
			message = new EmailMessage();
			break;
		default:
			break;
		}
		
		return message;
		
	}

}
