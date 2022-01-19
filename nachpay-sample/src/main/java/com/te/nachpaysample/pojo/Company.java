package com.te.nachpaysample.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="np_company")
public class Company implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="company_id")
	private Long companyId;
	@Column(name="company_code")
	private String companyCode;
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="type_of_ownership")
	private String typeOfOwnership;
	@Column(name="type_of_industry")
	private String typeOfIndustry;
	@Column(name="pan")
	private String pan;
	@Column(name="gstin")
	private String gst;
	@Column(name="cin")
	private String cin;
	@Column(name="registerd_address")
	private String registerdAddress;
	@Column(name="billing_address")
	private String billingAddress;
	@Column(name="business_address")
	private String businessaddress;
	@Column(name="status")
	private String status;
	@Column(name="phone_no")
	private Long phoneNo;
	@Column(name="business_email_id")
	private String emailId;
	@Column(name = "erp_uid")
	private String erp;
	@Column(name = "no_of_employees")
	private Long employees;
	@Column(name="logo")
	private String logo;
	@Column(name = "payment_type")
	private String payment;
	@Column(name = "landline_no")
	private Long landlineNo;
	@Column(name = "created_date")
	private Date createdDate;
	@Column(name="created_by")
	private Long createdBy;
	@Column(name = "modified_date")
	private Date modifiedDate;
	@Column(name="modified_by")
	private Long modifiedBy;
	@Column(name = "branch_name")
	private String branchName;
	@Column(name = "is_deleted")
	private Boolean isDeleted;
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTypeOfOwnership() {
		return typeOfOwnership;
	}
	public void setTypeOfOwnership(String typeOfOwnership) {
		this.typeOfOwnership = typeOfOwnership;
	}
	public String getTypeOfIndustry() {
		return typeOfIndustry;
	}
	public void setTypeOfIndustry(String typeOfIndustry) {
		this.typeOfIndustry = typeOfIndustry;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getRegisterdAddress() {
		return registerdAddress;
	}
	public void setRegisterdAddress(String registerdAddress) {
		this.registerdAddress = registerdAddress;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getBusinessaddress() {
		return businessaddress;
	}
	public void setBusinessaddress(String businessaddress) {
		this.businessaddress = businessaddress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getErp() {
		return erp;
	}
	public void setErp(String erp) {
		this.erp = erp;
	}
	public Long getEmployees() {
		return employees;
	}
	public void setEmployees(Long employees) {
		this.employees = employees;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public Long getLandlineNo() {
		return landlineNo;
	}
	public void setLandlineNo(Long landlineNo) {
		this.landlineNo = landlineNo;
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
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
	
}
