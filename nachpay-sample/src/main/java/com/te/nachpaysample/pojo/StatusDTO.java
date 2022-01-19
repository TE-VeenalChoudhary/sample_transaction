package com.te.nachpaysample.pojo;

public class StatusDTO {

	
	private Long amtPaid;
	private Long amtUnpaid;
	private int noOfInvoices;
	private Long noOfMandateCreated;
	
	
	
	public StatusDTO() {
		super();
		// TODO Auto-generated constructor stub
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
