package com.lorenzi.logistic.api.model.input;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class DeliveryInput {
	
	@Valid
	@NotNull
	private ClientIdInput client;
	
	@Valid
	@NotNull
	private RecipientInput recipient;
	
	@NotNull
	private BigDecimal tax;

	public ClientIdInput getClient() {
		return client;
	}

	public void setClient(ClientIdInput client) {
		this.client = client;
	}

	public RecipientInput getRecipient() {
		return recipient;
	}

	public void setRecipient(RecipientInput recipient) {
		this.recipient = recipient;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
	
	
}
