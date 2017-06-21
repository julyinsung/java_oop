package tdd.sample.one;

public class MessageSender {

	public MessageSender() {
		// TODO Auto-generated constructor stub
	}

	private boolean dispatch(Message message) {
		return false;
	}

	public boolean send(MessageType messageType, String text) {
		Message message = MessageFactory.generateMessage(messageType);
		return dispatch(message);
	}

}
