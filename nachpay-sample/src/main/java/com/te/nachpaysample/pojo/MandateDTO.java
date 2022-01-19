package com.te.nachpaysample.pojo;

import java.util.Date;

public class MandateDTO {

	
	
	private Long mandateId;
	private  String generatedFor;
	private String date;
	private String status;
	public Long getMandateId() {
		return mandateId;
	}
	public void setMandateId(Long mandateId) {
		this.mandateId = mandateId;
	}
	public String getGeneratedFor() {
		return generatedFor;
	}
	public void setGeneratedFor(String generatedFor) {
		this.generatedFor = generatedFor;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public MandateDTO() {
	}
	
	
	
}
