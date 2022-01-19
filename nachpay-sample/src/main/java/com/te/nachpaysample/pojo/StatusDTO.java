package com.te.nachpaysample.pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusDTO implements Serializable {

	private Long uniqueKey;
	private String companyName;
	private Long amtPaid;
	private Long amtUnpaid;
	private int noOfInvoices;
	private Long noOfMandateCreated;
	
	
	
	public StatusDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getUniqueKey() {
		return uniqueKey;
	}


	public void setUniqueKey(Long uniqueKey) {
		this.uniqueKey = uniqueKey;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public Long getAmtPaid() {
		return amtPaid;
	}
	public void setAmtPaid(Long amtPaid) {
		this.amtPaid = amtPaid;
	}
	public Long getAmtUnpaid() {
		return amtUnpaid;
	}
	public void setAmtUnpaid(Long amtUnpaid) {
		this.amtUnpaid = amtUnpaid;
	}
	public int getNoOfInvoices() {
		return noOfInvoices;
	}
	public void setNoOfInvoices(int noOfInvoices) {
		this.noOfInvoices = noOfInvoices;
	}
	public Long getNoOfMandateCreated() {
		return noOfMandateCreated;
	}
	public void setNoOfMandateCreated(Long noOfMandateCreated) {
		this.noOfMandateCreated = noOfMandateCreated;
	}
}
