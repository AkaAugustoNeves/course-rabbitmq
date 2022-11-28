package br.com.pilares.mspayment.config;

import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import  org.springframework.amqp.core.Queue;

@Configuration
public class AMQPConfig {

	@Bean
	public Queue createQueue() {
		//return new Queue("PAYMENT_CONCLUDED", false);
		return QueueBuilder.nonDurable("PAYMENT_CONCLUDED").build();
	}
	
	@Bean
	public RabbitAdmin createRabbitAdmin(ConnectionFactory connection) {
		return new RabbitAdmin(connection);
	}
	
	@Bean
	public ApplicationListener<ApplicationReadyEvent> initializerAdmin(RabbitAdmin rabbitAdmin){
		return event -> rabbitAdmin.initialize();
	}
	
}
