package com.te.nachpaysample.pojo;

import java.io.Serializable;

public class InvoiceDTO implements Serializable{
	
	private Long invoiceId;
	private  String generatedFor;
	private String date;
	private Long cost;
	
	public Long getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
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
	public Long getCost() {
		return cost;
	}
	public void setCost(Long cost) {
		this.cost = cost;
	}
	
	

}
