package br.com.pilares.mspayment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pilares.mspayment.model.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
