package com.lorenzi.logistic.api.model.input;

import javax.validation.constraints.NotBlank;

public class RecipientInput {
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String adress;
	
	@NotBlank
	private String number;
	
	@NotBlank
	private String complemente;
	
	@NotBlank
	private String neighborhood;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplemente() {
		return complemente;
	}

	public void setComplemente(String complemente) {
		this.complemente = complemente;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	
	

}
