package com.lorenzi.logistic.api.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.lorenzi.logistic.domain.model.DeliveryStatus;

public class DeliveryModel {
	
	private Long id;
	private ClientResumeModel client;
	private RecipientModel recipient;
	private BigDecimal tax;
	private DeliveryStatus status; 
	private OffsetDateTime deliveryDate;
	private OffsetDateTime completedDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public ClientResumeModel getClient() {
		return client;
	}
	public void setClient(ClientResumeModel client) {
		this.client = client;
	}
	public RecipientModel getRecipient() {
		return recipient;
	}
	public void setRecipient(RecipientModel recipient) {
		this.recipient = recipient;
	}
	public BigDecimal getTax() {
		return tax;
	}
	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	public DeliveryStatus getStatus() {
		return status;
	}
	public void setStatus(DeliveryStatus status) {
		this.status = status;
	}
	public OffsetDateTime getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(OffsetDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public OffsetDateTime getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(OffsetDateTime completedDate) {
		this.completedDate = completedDate;
	}
	
	

}
