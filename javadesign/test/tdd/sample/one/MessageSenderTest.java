package tdd.sample.one;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import tdd.sample.one.SMSMessage;

import org.junit.Test;

public class MessageSenderTest {

	@Test
	public void testSendMessage_SMS_메시지_발송_테스트() {
		// Given
		MessageSender messageSender = new MessageSender();
		MessageType messageType = MessageType.MESSAGE_TYPE_SMS;
		String text = "Message for SMS";
		// When
		boolean result = messageSender.send(messageType, text);
		// Then
		assertTrue("SMS 문자 발송 성공 케이스", result);
	}

	@Test
	public void testGenerateMessage_SMSMessage인스턴스생성테스트() {
		// Given
		// MessageFactory messageFactory = new MessageFactory();
		MessageType messageType = MessageType.MESSAGE_TYPE_SMS;
		// When
		Message message = MessageFactory.generateMessage(messageType);
		// Then
		assertNotNull(message);
		assertTrue("SMSMessage 인스턴스 생성!!", (message instanceof SMSMessage));
	}

}
