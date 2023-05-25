package com.wellsfargo.counselor.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class portFolio {
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO )
	private Integer portFolioId;
	
	@OneToOne(targetEntity = Client.class)
	private Client cliendId;
	
	Date creationDate = new Date();

	public Integer getPortFolioId() {
		return portFolioId;
	}

	public Client getCliendId() {
		return cliendId;
	}

	public void setCliendId(Client cliendId) {
		this.cliendId = cliendId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public portFolio(Integer portFolioId, Client cliendId, Date creationDate) {
		super();
		this.portFolioId = portFolioId;
		this.cliendId = cliendId;
		this.creationDate = creationDate;
	}
	
	
}
