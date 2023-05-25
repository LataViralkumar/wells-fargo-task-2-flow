package com.wellsfargo.counselor.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Client {
	
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO )
	private Integer clientId;
	
	@OneToMany(targetEntity=Advisor.class )
	private List<Advisor> advisorId ;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private Integer phone;
	
	@Column(nullable = false)
	private String email;

	public Integer getClientId() {
		return clientId;
	}

	public List<Advisor> getAdvisorId() {
		return advisorId;
	}

	public void setAdvisorId(List<Advisor> advisorId) {
		this.advisorId = advisorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Client(Integer clientId, List<Advisor> advisorId, String firstName, String lastName, String address,
			Integer phone, String email) {
		super();
		this.clientId = clientId;
		this.advisorId = advisorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	
	
}
