package com.lorenzi.logistic.api.model.input;

import javax.validation.constraints.NotBlank;

public class OccurrenceInput {
	
	@NotBlank
	private String detail;

	
	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	

}
