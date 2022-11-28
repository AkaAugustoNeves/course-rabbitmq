package br.com.pilares.msorder.model.dto;

public class PaymentDto {
	
	private Long id;
	private String hash;
	private String hashU;
	private String hashP;
	
	public PaymentDto() {
		// TODO Auto-generated constructor stub
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