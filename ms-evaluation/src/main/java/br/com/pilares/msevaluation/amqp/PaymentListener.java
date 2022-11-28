package br.com.pilares.msevaluation.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import br.com.pilares.msevaluation.model.dto.PaymentDto;


@Component
public class PaymentListener {

	@RabbitListener(queues = "PAYMENT.DETAILS-EVALUATION")
	public void receiveMessage(PaymentDto payment) {
		System.out.println("/*--------------------------------------------------*/");
		System.out.println("id: "+ payment.getId());
		System.out.println("hash: "+ payment.getHash());
		System.out.println("hashU: "+ payment.getHashU());
		System.out.println("hashP: "+ payment.getHashP());
		System.out.println("/*--------------------------------------------------*/");
	}
	
}
