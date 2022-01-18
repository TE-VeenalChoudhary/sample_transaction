package com.te.nachpaysample.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity
@Data
public class Company {
	
	@Id
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
	
}
