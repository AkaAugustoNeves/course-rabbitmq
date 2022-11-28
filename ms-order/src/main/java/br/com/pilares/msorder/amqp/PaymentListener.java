package br.com.pilares.msorder.amqp;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PaymentListener {

	@RabbitListener(queues = "PAYMENT_CONCLUDED")
	public void receiveMessage(Message message) {
		System.out.println(message.toString());
	}
	
}
