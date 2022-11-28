package br.com.pilares.mspayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pilares.mspayment.model.entities.Payment;
import br.com.pilares.mspayment.services.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	private PaymentService paymentService;
	
	@Autowired
	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	@PostMapping
	public Payment register() {
		return paymentService.register();
	}
	
	@GetMapping
	public List<Payment> list(){
		return paymentService.list();
	}
	
}
