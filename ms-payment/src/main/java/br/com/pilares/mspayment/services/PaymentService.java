package br.com.pilares.mspayment.services;

import java.util.List;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pilares.mspayment.model.entities.Payment;
import br.com.pilares.mspayment.repositories.PaymentRepository;

@Service
public class PaymentService {

	private PaymentRepository paymentRepository;
	private RabbitTemplate rabbitTemplate;
	
	@Autowired
	public PaymentService(PaymentRepository paymentRepository, RabbitTemplate rabbitTemplate) {
		this.paymentRepository = paymentRepository;
		this.rabbitTemplate = rabbitTemplate;
	}
	
	public List<Payment> list(){
		return paymentRepository.findAll();
	}
	
	public Payment register() {
		Payment payment = paymentRepository.save(new Payment());
		rabbitTemplate.send("PAYMENT_CONCLUDED", new Message(payment.getId().toString().getBytes()));
		return payment;
	}	
	
}