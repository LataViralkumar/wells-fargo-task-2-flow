package com.wellsfargo.counselor.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class security {
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO )
	private Integer securityId;
	
	@OneToMany(targetEntity= portFolio.class)
	private List<portFolio> prortFolioId;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String category;
	
	@Column(nullable = false)
	private String purchsePrice;
	

	private Date  purchesDate = new Date();
	
	@Column(nullable = false)
	private Integer quantity;

	public Integer getSecurityId() {
		return securityId;
	}

	public List<portFolio> getPrortFolioId() {
		return prortFolioId;
	}

	public void setPrortFolioId(List<portFolio> prortFolioId) {
		this.prortFolioId = prortFolioId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPurchsePrice() {
		return purchsePrice;
	}

	public void setPurchsePrice(String purchsePrice) {
		this.purchsePrice = purchsePrice;
	}

	public Date getPurchesDate() {
		return purchesDate;
	}

	public void setPurchesDate(Date purchesDate) {
		this.purchesDate = purchesDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public security(Integer securityId, List<portFolio> prortFolioId, String name, String category, String purchsePrice,
			Date purchesDate, Integer quantity) {
		super();
		this.securityId = securityId;
		this.prortFolioId = prortFolioId;
		this.name = name;
		this.category = category;
		this.purchsePrice = purchsePrice;
		this.purchesDate = purchesDate;
		this.quantity = quantity;
	}
	
	
	
	
}
