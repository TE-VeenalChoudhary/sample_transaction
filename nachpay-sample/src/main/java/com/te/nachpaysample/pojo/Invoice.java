package com.te.nachpaysample.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="np_invoice")
public class Invoice {
	
	
	@Id
	@Column(name= "invoice_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long invoiceId;
	
	@Column(name= "company_name")
	private String companyName;
	
	@Column(name= "bank_name")
	private String bankName;
	
	@Column(name= "umrn")
	private String umrn;
	
	@Column(name= "invoice_number")
	private String invoiceNumber;
	
	@Column(name= "invoice_date")
	private Date invoiceDate;
	
	@Column(name= "amount")
	private Long amount;
	
	@Column(name= "payment_amount")
	private Long paymentAmount;
	
	@Column(name= "due_amount")
	private Long dueAmount;
	
	@Column(name= "payment_date")
	private Date paymentDate;

	@Column(name="credit_days")
	private Integer creditDays;
	
	@Column(name= "advance_payed")
	private Long advance_payed;
	
	@Column(name= "status")
	private String status;
	
	@Column(name= "documents")
	private String documents;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name="created_by")
	private Long createdBy;
	
	@Column(name = "modified_date")
	private Date modifiedDate;
	
	@Column(name="modified_by")
	private Long modifiedBy;
	
	@Column(name = "is_deleted")
	private Boolean isDeleted;
	
	@Column(name= "relationship_id")
	private Long relationshipId;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="relationship_id",insertable=false ,updatable=false)
	private Relationship relationship;

	public Long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getUmrn() {
		return umrn;
	}

	public void setUmrn(String umrn) {
		this.umrn = umrn;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Long paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Long getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(Long dueAmount) {
		this.dueAmount = dueAmount;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Integer getCreditDays() {
		return creditDays;
	}

	public void setCreditDays(Integer creditDays) {
		this.creditDays = creditDays;
	}

	public Long getAdvance_payed() {
		return advance_payed;
	}

	public void setAdvance_payed(Long advance_payed) {
		this.advance_payed = advance_payed;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Long getRelationshipId() {
		return relationshipId;
	}

	public void setRelationshipId(Long relationshipId) {
		this.relationshipId = relationshipId;
	}
	
	


}
