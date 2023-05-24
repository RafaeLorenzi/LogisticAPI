package com.lorenzi.logistic.api.model;

import java.time.OffsetDateTime;

public class OccurrenceModel {
	
	private Long id;
	private String detail;
	private OffsetDateTime registrationDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public OffsetDateTime getRegistratipnDate() {
		return registrationDate;
	}
	public void setRegistratipnDate(OffsetDateTime registratipnDate) {
		this.registrationDate = registratipnDate;
	}
	
	

}
