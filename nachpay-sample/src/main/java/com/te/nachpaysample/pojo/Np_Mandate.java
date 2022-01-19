package com.te.nachpaysample.pojo;

import java.io.Serializable;
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

import lombok.Data;

@Entity
@Table(name="np_mandate")
public class Np_Mandate implements Serializable {

	@Column(name = "mandate_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mandateId;
	@Column(name = "seller_company_name")
	private String sellerCompanyName;
	@Column(name = "seller_bank_name")
	private String sellerBankName;
	@Column(name = "buyer_company_name")
	private String buyerComanyName;
	@Column(name = "buyer_bank_name")
	private String buyerBankName;
	@Column(name = "amount")
	private Double amount;
	@Column(name = "account_type")
	private String accountType;
	@Column(name = "frequency")
	private String frequecy;
	@Column(name = "purpose")
	private String purpose;
	@Column(name = "start_date")
	private Date startDate;
	@Column(name = "end_date")
	private Date endDate;
	@Column(name = "until_cancelled")
	private Boolean untilCancelled;
	@Column(name = "authentication_mode")
	private String authenticationMode;
	@Column(name = "mandate_type")
	private String mandateType;
	@Column(name = "umrn")
	private String umrn;
	@Column(name = "status")
	private String status;
	@Column(name = "created_by")
	private Long createdBy;
	@Column(name = "created_date")
	private Date createdDate;
	@Column(name = "modified_by")
	private Long modifiedBy;
	@Column(name = "modified_date")
	private Date modifiedDate;
	@Column(name = "is_deleted")
	private Boolean isDeleted;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "relationship_Id", insertable = false,updatable = false)
	private Relationship relationshipId;
	
	
	
	
	
	
	
	
	
	public Long getMandateId() {
		return mandateId;
	}
	public void setMandateId(Long mandateId) {
		this.mandateId = mandateId;
	}
	public String getSellerCompanyName() {
		return sellerCompanyName;
	}
	public void setSellerCompanyName(String sellerCompanyName) {
		this.sellerCompanyName = sellerCompanyName;
	}
	public String getSellerBankName() {
		return sellerBankName;
	}
	public void setSellerBankName(String sellerBankName) {
		this.sellerBankName = sellerBankName;
	}
	public String getBuyerComanyName() {
		return buyerComanyName;
	}
	public void setBuyerComanyName(String buyerComanyName) {
		this.buyerComanyName = buyerComanyName;
	}
	public String getBuyerBankName() {
		return buyerBankName;
	}
	public void setBuyerBankName(String buyerBankName) {
		this.buyerBankName = buyerBankName;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getFrequecy() {
		return frequecy;
	}
	public void setFrequecy(String frequecy) {
		this.frequecy = frequecy;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Boolean getUntilCancelled() {
		return untilCancelled;
	}
	public void setUntilCancelled(Boolean untilCancelled) {
		this.untilCancelled = untilCancelled;
	}
	public String getAuthenticationMode() {
		return authenticationMode;
	}
	public void setAuthenticationMode(String authenticationMode) {
		this.authenticationMode = authenticationMode;
	}
	public String getMandateType() {
		return mandateType;
	}
	public void setMandateType(String mandateType) {
		this.mandateType = mandateType;
	}
	public String getUmrn() {
		return umrn;
	}
	public void setUmrn(String umrn) {
		this.umrn = umrn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Long getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Long modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Relationship getRelationshipId() {
		return relationshipId;
	}
	public void setRelationshipId(Relationship relationshipId) {
		this.relationshipId = relationshipId;
	}
	
	
	
	
	
	
	
	
	
	
}
