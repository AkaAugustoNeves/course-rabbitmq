package br.com.pilares.mspayment.model.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String hash;
	private String hashU;
	private String hashP;
	
	public Payment() {
		this.hash = UUID.randomUUID().toString();
		this.hashU = UUID.randomUUID().toString();
		this.hashP = UUID.randomUUID().toString();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getHashU() {
		return hashU;
	}

	public void setHashU(String hashU) {
		this.hashU = hashU;
	}

	public String getHashP() {
		return hashP;
	}

	public void setHashP(String hashP) {
		this.hashP = hashP;
	}
	
}